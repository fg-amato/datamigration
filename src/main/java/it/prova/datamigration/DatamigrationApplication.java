package it.prova.datamigration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.datamigration.model.DatiFiscali;
import it.prova.datamigration.model.Sinistro;
import it.prova.datamigration.service.DatiFiscaliService;

@SpringBootApplication
public class DatamigrationApplication implements CommandLineRunner {

	@Autowired
	DatiFiscaliService dfs;

	public static void main(String[] args) {
		SpringApplication.run(DatamigrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<DatiFiscali> dfList = dfs.listAllElementsEager();

		if (!dfList.isEmpty()) {
			for (DatiFiscali dfItem : dfList) {
				System.out.println(dfItem);
				System.out.println(dfItem.getDatiAnagrafici());
				if (!dfItem.getDatiAnagrafici().getSinistri().isEmpty()) {
					for (Sinistro s : dfItem.getDatiAnagrafici().getSinistri()) {
						System.out.println(s);
					}
				} else
					System.out.println("empty");
			}
		} else
			System.out.println("empty");
	}

}
