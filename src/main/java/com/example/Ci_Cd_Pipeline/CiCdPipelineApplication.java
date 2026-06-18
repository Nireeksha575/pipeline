package com.example.Ci_Cd_Pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdPipelineApplication {

	@GetMapping("/welcome")
	public String getWElcome(){
		return "Welcome to nireeksha's world";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdPipelineApplication.class, args);
	}

}
