package example.domain;

import java.security.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Brewery extends BaseEntity {
	
	
	public Brewery(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, String breweryName) {
		super(id, version, createdDate, lastModifiedDate);
		this.breweryName = breweryName;
	}

	private String breweryName;
}
