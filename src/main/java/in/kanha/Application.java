package in.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

// 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

@SpringBootApplication
@EnableAdminServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
