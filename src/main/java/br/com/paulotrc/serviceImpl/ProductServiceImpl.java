package br.com.paulotrc.serviceImpl;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.paulotrc.entities.Product;
import br.com.paulotrc.service.ProductService;

@Named(value="productService")
public class ProductServiceImpl  implements ProductService {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager em;
 
	static final String PERSISTENCE_UNIT_NAME = "WebImagesPU";

	public ProductServiceImpl(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
 		this.em = this.entityManagerFactory.createEntityManager();
	}
	
	public Product createProduct(Product product) {
		try {
			System.out.println(product);
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println("Erro na transacao:");
			e.printStackTrace();
		}
		return product;
	}

	public void dropProduct(Product product) {
		em.getTransaction().begin();
		em.remove(product);
		em.getTransaction().commit();
		em.close();
	}

	public List<Product> readListAllProducts() {
//		em.getTransaction().begin();
		TypedQuery<Product> query = em.createQuery("select p from Product p", Product.class);
		System.out.println("Passou para listar");
		List<Product> returnList = query.getResultList();
//		em.close();
		return returnList;
	}

	public Product updateProduct(Product product) {
		em.getTransaction().begin();
		product = em.merge(product);
		em.getTransaction().commit();
		em.close();
		return product;
	}

	public Product readProductById(int idProduct) {
//		em.getTransaction().begin();
		TypedQuery<Product> query = em.createQuery("select p from Product p where p.id = :id", Product.class);
		Product product = query.getSingleResult();
//		em.close();
		return product;
	}

}
