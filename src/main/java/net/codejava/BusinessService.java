package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail() {
		// use mailSender here...
	}
}
