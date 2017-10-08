package com.example.dataRest.customer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.dataRest.Address.Address;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	
	
	private @Id @GeneratedValue Long customerId;
	private final String firstName;
	private final String lastName;
	@OneToOne
	private final Address address;
	
	public Customer() {
		this.firstName = null;
		this.lastName = null;
		this.address = null;
	}
	
	
	

}
