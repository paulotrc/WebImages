package br.com.paulotrc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Image", schema="WIMG")
public class Image {

	@Id
    @Column(name = "image_id", unique = true)
    private int id;

	@ManyToOne
	private Product product_id;
	
	public Image() {
		super();
	}

	public Image(int id, Product product_id) {
		super();
		this.id = id;
		this.product_id = product_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Product product_id) {
		this.product_id = product_id;
	}
}