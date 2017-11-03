package br.com.paulotrc.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "Product", schema="WIMG")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", unique = true)
    private int id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "description", unique = true)
	private String description;
	
	@OneToOne
	private Product parent_product_id;

	@OneToMany(targetEntity=Product.class , orphanRemoval=true)
	private List<Product> childs_products;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getParent_product_id() {
		return parent_product_id;
	}

	public void setParent_product_id(Product parent_product_id) {
		this.parent_product_id = parent_product_id;
	}

	public List<Product> getChilds_products() {
		return childs_products;
	}

	public void setChilds_products(List<Product> childs_products) {
		this.childs_products = childs_products;
	}
}