package com.builder.BuilderJPA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.builder.BuilderJPA.model.NutritionEntry;
import com.builder.BuilderJPA.model.Nutrition;
import com.builder.BuilderJPA.repo.NutritionRepo;
import com.builder.BuilderJPA.util.JsonUtils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuilderJpaApplication {

	private NutritionRepo nrepo;

	BuilderJpaApplication(NutritionRepo nrepo) {
		this.nrepo = nrepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(BuilderJpaApplication.class, args);
	}

	@PostMapping("/nuts")
	public void insert(@RequestBody  Nutrition nut) throws IOException {
		NutritionEntry entry = new NutritionEntry(JsonUtils.convertObjectToString(nut));
		nrepo.save(entry);
	}

	@GetMapping(value = "/nuts")
	public List<Nutrition> enquireNuts(){
		Iterable<NutritionEntry> entries = nrepo.findAll();
		List<Nutrition> nuts = new ArrayList<>();
		entries.forEach(
				(entry)->{
					try {
						nuts.add(JsonUtils.convertStringToObject(entry.getPayload(), Nutrition.class));
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				}
		);
		return Collections.unmodifiableList(nuts);
	}
}
