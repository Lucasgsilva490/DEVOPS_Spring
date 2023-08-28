package com.example.demo_salaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSalafApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSalafApplication.class, args);
}
@GetMapping("/nikinho")
    public String hello(){
        return "Nikinho é lindo perfeito maravilhoso com muita mira no vava";
    }
}
