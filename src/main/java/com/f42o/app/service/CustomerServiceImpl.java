package com.f42o.app.service;

import com.f42o.app.model.Customer;
import com.f42o.app.repository.ICustomerDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements ICustomerService{
	

	private final ICustomerDao customerDao;




	
	
	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

}
