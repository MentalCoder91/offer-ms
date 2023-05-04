package com.offer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offer.model.Offer;
import com.offer.service.OfferService;

@RestController
@RequestMapping("/offers")
public class OfferController {

	@Autowired
	private OfferService service;

	@GetMapping("/{startChar}")
	public Offer getOfferByProductName(@PathVariable String startChar) throws InterruptedException {
		return service.getOfferByProductName(startChar);
	}
	
	@GetMapping("/all")
	public List<Offer> getAllOffers(){
		return service.getAllOffers();
	}
	
	

}
