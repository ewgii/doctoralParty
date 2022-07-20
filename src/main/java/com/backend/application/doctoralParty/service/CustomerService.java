package com.backend.application.doctoralParty.service;

import com.backend.application.doctoralParty.model.Customer;
import com.backend.application.doctoralParty.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomersRepository customersRepository;

    public CustomerService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Optional<Customer> findById (Long id) {
        return customersRepository.findById(id);
    }

    public List<Customer> findByAll () {
        return customersRepository.findAll();

    }

    public Customer saveCustomer (Customer customer) {
        return customersRepository.save(customer);
    }


    public void deleteById (Long id) {
        customersRepository.deleteById(id);
    }
}
