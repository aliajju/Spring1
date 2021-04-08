package com.xworkz.spring.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fastdelivery")

public class FoodDeliveryEntity implements Serializable {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private int price;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "DISCOUNT")
	private int discount;

	public FoodDeliveryEntity(String name, int price, int quantity, int discount) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getDiscount() {
		return discount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FoodDeliveryEntity [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", discount=" + discount + "]";
	}

}
