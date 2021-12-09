package com.javatechie.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.os.api.common.PaymentDTO;
import com.javatechie.os.api.common.TransactionRequest;
import com.javatechie.os.api.common.TransactionResponse;
import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {
		
		return orderService.saveOrder(transactionRequest);
		
		// when this order mark to check out then do a rest call to payment and pass the orderId
		// in payment table
	}
	
	
	
	
	

}
