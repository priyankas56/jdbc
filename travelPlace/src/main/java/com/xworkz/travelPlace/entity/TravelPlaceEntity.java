package com.xworkz.travelPlace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@RequiredArgsConstructor
@Table(name="travel_table")
@NoArgsConstructor
public class TravelPlaceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String placeName;
	private Long travelPrice;
	public TravelPlaceEntity() {
		super();
	
		this.placeName = placeName;
		this.travelPrice = travelPrice;
	}
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
		TravelPlaceEntity other = (TravelPlaceEntity) obj;
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
		return "TravelPlaceEntity [id=" + id + ", placeName=" + placeName + ", travelPrice=" + travelPrice + "]";
	}
	
	


}
