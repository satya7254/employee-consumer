package com.satya.controllers;

import java.io.IOException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class EmpConsumerControllerClient {

	public void getEmployee() throws RestClientException, IOException {

		String baseUrl = "http://localhost:8080/employee";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response=null;
		try{
		        response=restTemplate.exchange(baseUrl,HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex){
			System.out.println(ex);
		}
<<<<<<< HEAD
		System.out.println(response.getBody());
		System.out.println("Hello hello hi");
=======
		System.out.println(response.getBody());
		System.out.println("Satya...");
>>>>>>> 965088456e0a346fc27285a6bcb96706e1525121
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}