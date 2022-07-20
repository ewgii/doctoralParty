package com.backend.application.doctoralParty.repository;

import com.backend.application.doctoralParty.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, Long> {

}
