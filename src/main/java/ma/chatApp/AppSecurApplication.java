package ma.chatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AppSecurApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSecurApplication.class, args);
	}

}
