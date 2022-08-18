package com.akshay.techstack.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechstackController {
	
	@GetMapping("/techstack/{technologyType}")
	public List<String> getRelatedTechStack(@PathVariable("technologyType") String technologyType){
		List<String> relatedTechnologies = new ArrayList<String>();
		
		switch(technologyType) {
		
		case "frontend":
			relatedTechnologies = Arrays.asList("HTML","CSS","BOOTSTRAP","REACT.JS","VUE.JS");
			break;
			
		case "backend":
			relatedTechnologies = Arrays.asList("JAVA","PYTHON","C++","NODE","PHP","GOLANG","RUST");
			break;
			
		case "database":
			relatedTechnologies = Arrays.asList("MYSQL", "ORACLE", "POSTGRESQL", "MONGODB", "CASSANDRA");
			break;
			
		default:
			relatedTechnologies = Arrays.asList("invalid type");
			break;
		}
		
		return relatedTechnologies;
	}
	
}
