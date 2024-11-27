package com.xworkz.cable.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sport_table")
public class SportDtO {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="sport_name")
	private String sport_name;
	@Column(name="type")
	private String type;
	@Column(name="players_per_team")
	private int  players_per_team;
	@Column(name="origin_country")
	private String  origin_country;
	@Column(name="is_olympic_sport")
	private boolean is_olympic_sport;
	@Column(name="field_size")
	private String field_size;
	@Column(name="governing_body")
	private String governing_body;
	@Column(name="equipment_needed")
	private String equipment_needed;
	@Column(name="popularity_rank")
	private int  popularity_rank;
	
	public SportDtO()
	{
		
	}
	public SportDtO(String sport_name, String type, int players_per_team, String origin_country,
			boolean is_olympic_sport, String field_size, String governing_body, String equipment_needed,
			int popularity_rank) {
		super();
		
		this.sport_name = sport_name;
		this.type = type;
		this.players_per_team = players_per_team;
		this.origin_country = origin_country;
		this.is_olympic_sport = is_olympic_sport;
		this.field_size = field_size;
		this.governing_body = governing_body;
		this.equipment_needed = equipment_needed;
		this.popularity_rank = popularity_rank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSport_name() {
		return sport_name;
	}
	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPlayers_per_team() {
		return players_per_team;
	}
	public void setPlayers_per_team(int players_per_team) {
		this.players_per_team = players_per_team;
	}
	public String getOrigin_country() {
		return origin_country;
	}
	public void setOrigin_country(String origin_country) {
		this.origin_country = origin_country;
	}
	public boolean getIs_olympic_sport() {
		return is_olympic_sport;
	}
	public void setIs_olympic_sport(boolean is_olympic_sport) {
		this.is_olympic_sport = is_olympic_sport;
	}
	public String getField_size() {
		return field_size;
	}
	public void setField_size(String field_size) {
		this.field_size = field_size;
	}
	public String getGoverning_body() {
		return governing_body;
	}
	public void setGoverning_body(String governing_body) {
		this.governing_body = governing_body;
	}
	public String getEquipment_needed() {
		return equipment_needed;
	}
	public void setEquipment_needed(String equipment_needed) {
		this.equipment_needed = equipment_needed;
	}
	public int getPopularity_rank() {
		return popularity_rank;
	}
	public void setPopularity_rank(int popularity_rank) {
		this.popularity_rank = popularity_rank;
	}
	
	
	
	

}
