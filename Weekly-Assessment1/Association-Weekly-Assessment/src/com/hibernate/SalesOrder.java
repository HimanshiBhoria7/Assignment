package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "salesorderespire")

public class SalesOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	@NotNull
	@Column(name="salesorderId")
	private int salesorderId;
	
	//second table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart")
	private Cart cart;
	
	//third table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer")
	private Customer customer;
	
	//fourth table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shippingAddress")
	private ShippingAddress shippingAddress;
	
	//fifth table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "billingAddress")
	private BillingAddress billingAddress;


	


	public int getSalesorderId() {
		return salesorderId;
	}

	public void setSalesorderId(int salesorderId) {
		this.salesorderId = salesorderId;
	}
	


	

}
