package com.example.dataRest.customer;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

	Optional<Customer> findCustomerByLastNameAndFirstName(String lastName, String firstName);
	Optional<Customer> findCustomerByAddressCity(String city);
}
