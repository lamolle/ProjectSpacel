package com.SpringBoot.BE;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestServices {

    private RestTemplate restTemplate = new RestTemplate();

    public void RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON() {
    	String SPO = "{%20%20%20?subject%20?predicate%20?object%20}";
       String url ="http://localhost:3030/UPO?query=SELECT ?subject ?predicate ?object WHERE {?subject ?predicate ?object} LIMIT 25&output=json";
    		  // "http://localhost:3030/UPO?query=SELECT%20?subject%20?predicate%20?object%20WHERE%20SPO={SPO}%20LIMIT%2025";
       
       
        return this.restTemplate.getForObject(url,String.class);
    }
    
}