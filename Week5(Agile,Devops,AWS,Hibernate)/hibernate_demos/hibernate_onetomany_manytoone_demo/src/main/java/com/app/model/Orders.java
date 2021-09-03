package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Orders {

	@Id
	private String orderId;
	private double totalBill;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public Orders(String orderId, double totalBill) {
		super();
		this.orderId = orderId;
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalBill=" + totalBill + "]";
	}
	
	
	
}
