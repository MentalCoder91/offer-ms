package com.offer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offer.model.Offer;
import com.offer.repository.OfferRepository;

@Service
public class OfferService {

	@Autowired
	private OfferRepository repo;

	public Offer getOfferByProductName(String startChar) throws InterruptedException {

		Thread.sleep(2000);
		
		return repo.getOfferByProductName(startChar);

	}

	public List<Offer> getAllOffers() {
		return repo.findAll();
	}

}
