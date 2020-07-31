package com.farley.mccommerce.services;

import org.springframework.mail.SimpleMailMessage;

import com.farley.mccommerce.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
