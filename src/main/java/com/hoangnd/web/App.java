package com.hoangnd.web;

import javax.transaction.Transactional;

import com.hoangnd.web.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hoangnd.web.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class App implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	private final UserRepository userRepository;
	private final OrderService orderService;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		
	}

}
