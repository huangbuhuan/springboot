package me.buhuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerApplication.class, args);
	}

	@Bean
	public Docket useApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(path -> path.startsWith("/api/"))
				.build();
	}
}
