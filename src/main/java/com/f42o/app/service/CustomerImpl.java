package com.f42o.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f42o.app.model.Customer;
import com.f42o.app.repository.ICustomerDao;

@Service
public class CustomerImpl implements ICustomerService{
	
	@Autowired
	ICustomerDao customerDao;
	
	
	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

}
