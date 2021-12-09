package com.javatechie.os.api.common;

import com.javatechie.os.api.entity.Order;

public class TransactionRequest {
	
	private PaymentDTO paymentdto;
	private Order order;
	
	
	public PaymentDTO getPayment() {
		return paymentdto;
	}
	public void setPayment(PaymentDTO payment) {
		this.paymentdto = payment;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
