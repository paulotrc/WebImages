package br.com.paulotrc.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.paulotrc.entities.Product;
import br.com.paulotrc.service.ProductService;
import br.com.paulotrc.serviceImpl.ProductServiceImpl;

@Path("/listarProdutos")
public class ListProductsRestService {

	private ProductService productService;
	
	public ListProductsRestService() {
		super();
		this.productService = getProductService();
		if(this.getProductService() == null){
			System.out.println("productService" + productService == null);
			productService = new ProductServiceImpl();
		}
	}

	@Inject
    public ProductService getProductService() {
		return productService;
	}


	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProductsInJSON() {
    	List<Product> lista = new ArrayList<Product>(); 
    	lista.addAll(productService.readListAllProducts());
    	
    	if(lista.isEmpty()){
//	    	Product product = new Product(null, "TestP", "TestDescP");
//	    	Product product2 = new Product(null, "TestP2", "TestDescP2");
//	    	Product product3 = new Product(null, "TestP3", "TestDescP3");
//	    		
//	    	lista.add(productService.createProduct(product));
//	    	lista.add(productService.createProduct(product2));
//	    	lista.add(productService.createProduct(product3));
//    		lista.addAll(productService.readListAllProducts());
    		System.out.println("Listavazia: " + lista.isEmpty());
    	}
    	return lista;
    }
}

