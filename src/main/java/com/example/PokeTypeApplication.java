package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.JsonNode;

@SpringBootApplication
public class PokeTypeApplication {

	public static void main(String[] args) {
		for(int i=1; i<6; i++){
		String index = String.valueOf(i);

		JsonNode json = PokeService.getType(index);
		System.out.println(json.get("name").asText());
}
		// JsonNode json = PokeService.getType("1");
		// System.out.println(json.get("name").asText());
		// JsonNode request = PokeService.getType("2");
		// System.out.println(request.get("name").asText());
		
	}

}
