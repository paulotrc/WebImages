package br.com.paulotrc.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.paulotrc.entities.Product;
import br.com.paulotrc.service.ProductService;
import br.com.paulotrc.serviceImpl.ProductServiceImpl;

@Path("/listarProdutos")
public class ListProductsRestService {

	ProductService productService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProductsInJSON() {
//    	productService = new ProductServiceImpl();
    	Product product = new Product(0, "TestP", "TestDescP");
    	Product product2 = new Product(1, "TestP2", "TestDescP2");
    	System.out.println(product.toString());
    	System.out.println(product2.toString());
    	List<Product> lista = new ArrayList<Product>(); 
    	lista.add(product);
    	lista.add(product2);
    	return lista;
//    	return productService.createProduct(product);
    }
}

