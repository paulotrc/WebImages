package br.com.paulotrc.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.paulotrc.entities.Product;
import br.com.paulotrc.service.ProductService;
import br.com.paulotrc.serviceImpl.ProductServiceImpl;

@Path("/products")
public class ProductRestService {

	ProductService productService;
		
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getDefaultProductInJSON() {
    	return getProductService().readListAllProducts();
    }
    
//    @GET
//    @Path("/all")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Product> getAllUsersInJSON() {
//        return productService.readListAllProducts();
//    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductById(@PathParam("id") int id) {
        return getProductService().readProductById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product create(Product produto) {
        return getProductService().createProduct(produto);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product update(Product produto) {
        return getProductService().updateProduct(produto);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(@PathParam("id") int id) {
    	getProductService().dropProduct(this.getProductById(id));
    }

	public ProductService getProductService() {
		return productService == null ? new ProductServiceImpl() : productService;
	}
}

