package com.edubridge.encapsulation;

public class Customer extends HDFC {
	private String customerName;
	private long customerId;
	private int pinNo;

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", pinNo=" + pinNo
				+ ", toString()=" + super.toString() + "]";
	}
		
}
