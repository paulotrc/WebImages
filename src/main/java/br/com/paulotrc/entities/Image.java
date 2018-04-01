package br.com.paulotrc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_IMAGEM")
public class Image {

	@Id
	@SequenceGenerator(name="SQ_IMAGEM", allocationSize = 10, initialValue = 1, sequenceName="SQ_IMAGEM")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true)
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