package com.builder.BuilderJPA.repo;

import com.builder.BuilderJPA.model.NutritionEntry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionRepo extends CrudRepository<NutritionEntry, Integer> {
}
