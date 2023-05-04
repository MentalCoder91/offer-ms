package com.offer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="offers")
@Data
@NoArgsConstructor
public class Offer{
	
	@Id
	private Long id;
	private String startCharacter;
	private Double offerPercentage;
	
	public Offer(Long id, String startCharacter, Double offerPercentage) {
		this.id = id;
		this.startCharacter = startCharacter;
		this.offerPercentage = offerPercentage;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", startCharacter=" + startCharacter + ", offerPercentage=" + offerPercentage + "]";
	}
	
	
	

}
