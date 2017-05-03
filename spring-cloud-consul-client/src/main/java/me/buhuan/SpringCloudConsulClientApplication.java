package me.buhuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudConsulClientApplication {


	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@RequestMapping("/discover")
	public Object discover() {
		return loadBalancerClient.choose("server").getUri().toString();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulClientApplication.class, args);
	}
}
