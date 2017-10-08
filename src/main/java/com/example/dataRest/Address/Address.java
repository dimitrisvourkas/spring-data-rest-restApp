package com.example.dataRest.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import com.example.dataRest.customer.Customer;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class Address {
	private @Id @GeneratedValue Long addressId;
	private final String street;
	private final String number;
	private final String city;
	private final String country;
	
	@OneToOne
	private Customer customer;

	public Address() {
		
		this.street = null;
		this.number = null;
		this.city = null;
		this.country = null;
		this.customer = null;
	}
	
	

}
