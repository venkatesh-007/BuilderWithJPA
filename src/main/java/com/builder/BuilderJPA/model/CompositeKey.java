package com.builder.BuilderJPA.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class CompositeKey implements Serializable{
	@Column(name = "ID")
	private int id;
	@Column(name = "SERVINGSIZE")
	private int servingSize;
	@Column(name = "SERVINGS")
	private int servings;

	public CompositeKey(int id, int servingSize, int servings) {
		this.id = id;
		this.servingSize = servingSize;
		this.servings = servings;
	}

	public CompositeKey() {
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	int getServingSize() {
		return servingSize;
	}

	void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	int getServings() {
		return servings;
	}

	void setServings(int servings) {
		this.servings = servings;
	}
}
