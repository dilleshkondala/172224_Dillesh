package com.org.springPojoServices;

public class Customer {
	private String customerId;
	private String customerName; 
	private String customerContact;
	private Address customerAddress;
	
	
	public Customer() {
		super();
	}


	public Customer(String customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	public void displayCustomerDetails()
	{
		System.out.println("Customer Details as follows; \n"
				+"Customer Id = "+getCustomerId()+"\n"
				+"Customer Name= "+getCustomerName()+"\n"
				+"Customer Contact= "+getCustomerContact()+"\n"
				+"Customer Adress: \n"
					+"Street Name= "+getCustomerAddress().getStreet()+"\n"
					+"City Name= "+getCustomerAddress().getCity()+"\n"
					+"State = "+getCustomerAddress().getState()+"\n"
					+"ZIP = "+getCustomerAddress().getZip()+"\n"
					+"Country = "+getCustomerAddress().getCountry());
	}
	

}
