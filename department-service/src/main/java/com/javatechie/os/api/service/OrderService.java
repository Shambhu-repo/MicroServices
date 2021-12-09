package com.javatechie.os.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javatechie.os.api.common.PaymentDTO;
import com.javatechie.os.api.common.TransactionRequest;
import com.javatechie.os.api.common.TransactionResponse;
import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.repository.OrderRpository;

@Service
public class OrderService implements OrderServiceInterface {
	
	@Autowired
	private OrderRpository orderRepository;
	
	@Autowired
	private RestTemplate template;
	
	public TransactionResponse saveOrder(TransactionRequest  transactionRequest) {
		String response ="";
		Order order = transactionRequest.getOrder();
		PaymentDTO  paymentDTO = transactionRequest.getPayment();
		paymentDTO.setOrderId(order.getId());
		paymentDTO.setAmount(order.getPrice());
		
		// Rest call
          //PaymentDTO paymentResponse=	template.postForObject("http://localhost:901/payment/doPayment", paymentDTO,PaymentDTO.class); // url for rest call, request object and Request type
		//PaymentDTO paymentResponse=	template.postForObject("http://PAYMENT-SERVICE", paymentDTO,PaymentDTO.class); // url for rest call, request object and Request type

	
		PaymentDTO paymentResponse=	template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", paymentDTO,PaymentDTO.class); // url for rest call, request object and Request type
		
	response =paymentResponse.getPaymentStatus().equals("success")? "payment proceed and order checkout":"there is failure in payment api";
		
		 return	new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}
	
	}


