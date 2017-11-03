package br.com.paulotrc.service;

import java.util.List;

import br.com.paulotrc.entities.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	void dropProduct(Product product);
	Product updateProduct(Product product);
	Product readProductById(int idProduct);

	List<Product> readListAllProducts();
	
}
