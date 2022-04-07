package it.prova.datamigration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.datamigration.service.MigrationService;

@SpringBootApplication
public class DatamigrationApplication implements CommandLineRunner {

	@Autowired
	MigrationService ms;

	public static void main(String[] args) {
		SpringApplication.run(DatamigrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ms.transferData();
	}

}
