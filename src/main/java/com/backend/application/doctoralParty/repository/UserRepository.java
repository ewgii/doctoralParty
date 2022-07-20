package com.backend.application.doctoralParty.repository;

import com.backend.application.doctoralParty.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

}
