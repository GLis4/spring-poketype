package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.JsonNode;

@SpringBootApplication
public class PokeTypeApplication {

	public static void main(String[] args) {

		JsonNode json = PokeService.getType("1");
		System.out.println(json.get("name").asText());
		JsonNode request = PokeService.getType("2");
		System.out.println(request.get("name").asText());
		
	}

}
