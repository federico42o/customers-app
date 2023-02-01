package com.f42o.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.f42o.app.model.Customer;


public interface ICustomerDao extends JpaRepository<Customer,Long>,ListCrudRepository<Customer, Long> {

	Optional<Customer> findById(Long id);
	Optional<Customer> findByName(String name);
	
}
