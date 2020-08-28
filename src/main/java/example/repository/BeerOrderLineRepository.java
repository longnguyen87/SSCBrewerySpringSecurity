package example.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import example.domain.BeerOrderLine;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID>{

}
