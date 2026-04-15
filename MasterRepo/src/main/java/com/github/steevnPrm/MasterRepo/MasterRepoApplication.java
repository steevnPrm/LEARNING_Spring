package com.github.steevnPrm.MasterRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MasterRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterRepoApplication.class, args);
	}

}
