package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id
	
	private int customerId;
	private String customerName;
	@OneToMany(mappedBy = "customer")//,fetch = FetchType.EAGER
	private List<Orders> orderList=new ArrayList<>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id,String customerName) {
		super();
		this.customerId=id;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName +  "]";
	}
	
	
}
