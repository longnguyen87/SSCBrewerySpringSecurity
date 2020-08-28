package example.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import example.domain.Brewery;

public interface BreweryRepository extends JpaRepository<Brewery, UUID>{

}
