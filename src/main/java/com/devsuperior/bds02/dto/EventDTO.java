package com.devsuperior.bds02.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;

public class EventDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate date;
	private String url;
	private City cityId;
	
	public EventDTO(Event entity) {
	}

	public EventDTO(Long id, String name, LocalDate date, String url, City cityId) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.url = url;
		this.cityId = cityId;
	}
	
	public EventDTO(Event entity, String expo_xp, LocalDate of, String url, long CityId) {
		id = entity.getId();
		name = entity.getName();
		date = entity.getDate();
		this.url = entity.getUrl();
		cityId = entity.getCity(cityId);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}
}
