package example.repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

import javax.persistence.LockModeType;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import example.domain.BeerOrder;
import example.domain.Customer;
import example.web.model.OrderStatusEnum;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
	Page<BeerOrder> findAllByCustomer (Customer customer, Pageable pageable);
	
	List<BeerOrder> findAllByOrderStatus (OrderStatusEnum orderStatusEnum);
	
	@Lock (LockModeType.PESSIMISTIC_WRITE)
	BeerOrder findOneById (UUID id);
}
