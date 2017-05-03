package me.buhuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudConsulServerApplication {

	@RequestMapping("/home")
	public String home() {
		return "A Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulServerApplication.class, args);
	}
}
