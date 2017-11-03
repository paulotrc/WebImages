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
 
	private static final String PERSISTENCE_UNIT_NAME = "WebImages_PU";

	public ProductServiceImpl(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
 		this.em = this.entityManagerFactory.createEntityManager();
	}
	
	public Product createProduct(Product product) {
		em.persist(product);
		return product;
	}

	public void dropProduct(Product product) {
		em.remove(product);		
	}

	public List<Product> readListAllProducts() {
		TypedQuery<Product> query = em.createQuery("select p from Product p", Product.class);
		System.out.println("Passou para listar");
		return query.getResultList();
	}

	public Product updateProduct(Product product) {
		return em.merge(product);
	}

	public Product readProductById(int idProduct) {
		TypedQuery<Product> query = em.createQuery("select p from Product p where p.id = :id", Product.class);
		return query.getSingleResult();
	}

}
