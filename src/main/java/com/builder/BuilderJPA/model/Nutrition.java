package com.builder.BuilderJPA.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(builder = Nutrition.Builder.class)
public final class Nutrition{
	private final int id;
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int carbohydrates;
	private final int sodium;

	public static class Builder{
		private final int id;
		private final int servingSize;
		private final int servings;

		private int calories;
		private int fat;
		private int carbohydrates;
		private int sodium;

		@JsonCreator
		public Builder(@JsonProperty("id") int id,
				@JsonProperty("servingSize") int servingSize,
				@JsonProperty("servings") int servings) {
			this.id = id;
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder withCalories(int val){
			calories = val;
			return this;
		}

		public Builder withFat(int val){
			fat = val;
			return this;
		}

		public Builder withCarbohydrates(int val){
			carbohydrates = val;
			return this;
		}

		public Builder withSodium(int val){
			sodium = calories;
			return this;
		}

		public Nutrition build(){
			return new Nutrition(this);
		}

	}

	private Nutrition(Builder builder) {
		this.id = builder.id;
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.carbohydrates = builder.carbohydrates;
		this.sodium = builder.sodium;
	}

	@Override
	public String toString() {
		return "Nutrition{" +
				"id=" + id +
				", servingSize=" + servingSize +
				", servings=" + servings +
				", calories=" + calories +
				", fat=" + fat +
				", carbohydrates=" + carbohydrates +
				", sodium=" + sodium +
				'}';
	}

	public int getId() {
		return id;
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getCarbohydrates() {
		return carbohydrates;
	}

	public int getSodium() {
		return sodium;
	}
}
