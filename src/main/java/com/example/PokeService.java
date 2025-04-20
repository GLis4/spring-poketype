package com.example;
import java.util.Map;


import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

public class PokeService {
    public static JsonNode getType(String index) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://pokeapi.co/api/v2/type/"+index;

        return restTemplate.getForObject(url, JsonNode.class);
    }

    public static String getNameType( Map<String, Object> json){
        return (String) json.get("nome");
}
}
