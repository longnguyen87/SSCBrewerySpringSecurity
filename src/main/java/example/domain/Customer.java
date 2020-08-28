package example.domain;

import java.security.Timestamp;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Customer extends BaseEntity {
	
	
	public Customer(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, String customerName,
			UUID apiKey, Set<BeerOrder> beerOrders) {
		super(id, version, createdDate, lastModifiedDate);
		this.customerName = customerName;
		this.apiKey = apiKey;
		this.beerOrders = beerOrders;
	}

	private String customerName;
	@Column(length = 36, columnDefinition = "varchar")
	private UUID apiKey;
	
	@OneToMany (mappedBy = "customer")
	private Set<BeerOrder> beerOrders;
}
