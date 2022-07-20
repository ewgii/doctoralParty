package com.backend.application.doctoralParty.controller;

import com.backend.application.doctoralParty.model.Customer;
import com.backend.application.doctoralParty.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/v1/customers")
    public List<Customer> findAll() {
        List<Customer> customers = customerService.findByAll();
        return customers;
    }

    @GetMapping("/api/v1/customers/{id}")
    public Optional<Customer> getCustomer (@PathVariable Long id) {
        return customerService.findById(id);
    }

    @PostMapping("/api/v1/customers/create")
    public Customer createCustomer (@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/api/v1/customers/delete/{id}")
    public void deleteCustomer (@PathVariable Long id) {
        customerService.deleteById(id);
    }

}
