package cloud.shore.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient // Enable Eureka Client to register with Eureka Server
//@EnableEurekaClient is deprecated, no need to annotate the main class. It is enough to add the spring-cloud-starter-netflix-eureka-client dependency to pom.xml and if we have the application name in yml or properties file it will be registered to Eureka Server.
@EnableDiscoveryClient
public class InventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
}

