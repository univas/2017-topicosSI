package br.edu.univas.si8.ta.hello.ejb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "products")
@SequenceGenerator(name = "seq_products",
					sequenceName = "seq_products",
					allocationSize = 1)
public class Product {

	@Id
	@GeneratedValue(generator = "seq_products", strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String name;
	private Integer quantity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
