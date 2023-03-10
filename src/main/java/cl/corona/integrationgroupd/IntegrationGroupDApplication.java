package cl.corona.integrationgroupd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IntegrationGroupDApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationGroupDApplication.class, args);
	}

}
