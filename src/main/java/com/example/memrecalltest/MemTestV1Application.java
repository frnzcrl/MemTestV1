package com.example.memrecalltest;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemTestV1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MemTestV1Application.class, args);
		
		//runs the project automatically in a browser
		Runtime rt = Runtime.getRuntime();
	    rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080");
	}

}
