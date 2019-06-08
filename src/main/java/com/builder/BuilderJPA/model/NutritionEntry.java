package com.builder.BuilderJPA.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NUTRITION")
public class NutritionEntry {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "PAYLOAD")
	private String payload;

	NutritionEntry() {
	}

	public NutritionEntry(String payload) {
		this.payload = payload;
	}

	public  int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	public String getPayload() {
		return payload;
	}

	void setPayload(String payload) {
		this.payload = payload;
	}
}
