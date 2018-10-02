package com.amdocs.hrn.tool.AutoHrnGenerationTool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.amdocs.hrn.tool"})
public class AutoHrnGenerationToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoHrnGenerationToolApplication.class, args);
	}
}
