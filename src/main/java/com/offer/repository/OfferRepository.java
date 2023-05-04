package com.offer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.offer.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

	@Query(value = "SELECT * FROM offers f where f.start_character =?1", nativeQuery = true)
	public Offer getOfferByProductName(String startChar); // Start Character of Product

}
