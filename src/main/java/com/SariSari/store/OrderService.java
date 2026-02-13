package com.SariSari.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
		
	private PaymentService paymentService;
	
	// Manual Dependency Injection	
	//	@Autowired
	public OrderService (PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void placeOrder() {
		paymentService.processPayment(30);
	}

	// Setter Injection	
	public void setPaymentService (PaymentService paymentService) {
		this.paymentService = paymentService;
	}
}

