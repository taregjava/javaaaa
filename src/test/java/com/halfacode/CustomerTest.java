package com.halfacode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.halfacode.model.Customer;
import com.halfacode.repo.CustomerRepo;

@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CustomerTest {

	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void saveCustomer() {
		Customer customer= new Customer("tareg", "tareg.safi5@gmail.com");
		
	Customer  saveCustomer=	repo.save(customer);
		
		assertThat(saveCustomer.getId()).isGreaterThan(0);
	}
}
