package com.halfacode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.halfacode.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
