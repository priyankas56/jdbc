package com.xworkz.travelPlace.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TravelPlaceDTO {
	
	private int id;
	private String placeName;
	private Long travelPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public Long getTravelPrice() {
		return travelPrice;
	}
	public void setTravelPrice(Long travelPrice) {
		this.travelPrice = travelPrice;
	}
	public TravelPlaceDTO(int id, String placeName, Long travelPrice) {
		super();
		this.id = id;
		this.placeName = placeName;
		this.travelPrice = travelPrice;
	}
	public TravelPlaceDTO() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((placeName == null) ? 0 : placeName.hashCode());
		result = prime * result + ((travelPrice == null) ? 0 : travelPrice.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelPlaceDTO other = (TravelPlaceDTO) obj;
		if (id != other.id)
			return false;
		if (placeName == null) {
			if (other.placeName != null)
				return false;
		} else if (!placeName.equals(other.placeName))
			return false;
		if (travelPrice == null) {
			if (other.travelPrice != null)
				return false;
		} else if (!travelPrice.equals(other.travelPrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TravelPlaceDTO [id=" + id + ", placeName=" + placeName + ", travelPrice=" + travelPrice + "]";
	}

	
	
	
	
	
	
}
