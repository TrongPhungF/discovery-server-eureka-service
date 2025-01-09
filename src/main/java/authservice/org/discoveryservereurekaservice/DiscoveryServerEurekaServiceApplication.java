package authservice.org.discoveryservereurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerEurekaServiceApplication.class, args);
    }

}
