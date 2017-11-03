package br.com.paulotrc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.paulotrc.entities.Product;
import br.com.paulotrc.service.ProductService;
import br.com.paulotrc.serviceImpl.ProductServiceImpl;

@Path("/product")
public class ListProductsRestService {

	ProductService productService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Product getDefaultProductInJSON() {
    	productService = new ProductServiceImpl();
    	Product product = new Product(0, "TestP", "TestDescP");
    	return productService.createProduct(product);
    }
}

