package com.javatechie.os.api.common;

import com.javatechie.os.api.entity.Order;

public class TransactionResponse {
	
	private Order order;
	private double amount;
	private String transactionId;
	private String messageForOrderAndPaymentDoneOrNot;
	
	public TransactionResponse(Order order, double amount, String transactionId,
			String messageForOrderAndPaymentDoneOrNot) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.messageForOrderAndPaymentDoneOrNot = messageForOrderAndPaymentDoneOrNot;
	}
	
	
	public String getMessageForOrderAndPaymentDoneOrNot() {
		return messageForOrderAndPaymentDoneOrNot;
	}
	public void setMessageForOrderAndPaymentDoneOrNot(String messageForOrderAndPaymentDoneOrNot) {
		this.messageForOrderAndPaymentDoneOrNot = messageForOrderAndPaymentDoneOrNot;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	
	

}
