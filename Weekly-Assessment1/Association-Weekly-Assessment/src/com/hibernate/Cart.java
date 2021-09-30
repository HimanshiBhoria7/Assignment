package com.hibernate;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
@Table(name = "cartespire")

public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	@NotNull
	@Column(name="cartid")
	private int cartId;
	@NotNull
	@Column(name="address")
	private int totalPrice;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
