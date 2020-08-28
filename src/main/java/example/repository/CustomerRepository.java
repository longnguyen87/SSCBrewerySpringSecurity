package example.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import example.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID>{
	List<Customer> findAllByCustomerNameLike (String customerName);
}
