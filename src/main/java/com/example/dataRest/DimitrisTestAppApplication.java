package com.example.dataRest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dataRest.Address.Address;
import com.example.dataRest.Address.AddressRepository;
import com.example.dataRest.customer.Customer;
import com.example.dataRest.customer.CustomerRepository;


@SpringBootApplication
public class DimitrisTestAppApplication {

	@Autowired CustomerRepository customerRepository;
	@Autowired AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DimitrisTestAppApplication.class, args);
	}
	
	
	public @PostConstruct void init() {
		
			Address address1=new Address("Kastoria", "Greece", "M. Alexander", "83");
			addressRepository.save(address1);
			customerRepository.save(new Customer("C1_FIRST_NAME","C1_LAST_NAME", address1));
			
			
			Address address2=new Address("Kastoria", "Greece", "M. Alexander", "83");
			addressRepository.save(address2);
			customerRepository.save(new Customer("C2_FIRST_NAME","C2_LAST_NAME",address2));//
			
			Address address3=new Address("Kastoria", "Greece", "M. Alexander", "83");
			addressRepository.save(address3);
			customerRepository.save(new Customer("C3_FIRST_NAME","C3_LAST_NAME",address3));
		
	}
}
