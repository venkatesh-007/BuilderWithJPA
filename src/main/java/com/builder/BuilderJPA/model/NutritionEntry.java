package com.builder.BuilderJPA.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NUTRITION")
public class NutritionEntry {

	@EmbeddedId
	private CompositeKey key;

	@Column(name = "PAYLOAD")
	private String payload;

	NutritionEntry() {
	}

	public NutritionEntry(CompositeKey key, String payload) {
		this.key = key;
		this.payload = payload;
	}

	public CompositeKey getKey() {
		return key;
	}

	void setKey(CompositeKey key) {
		this.key = key;
	}

	public String getPayload() {
		return payload;
	}

	void setPayload(String payload) {
		this.payload = payload;
	}
}
