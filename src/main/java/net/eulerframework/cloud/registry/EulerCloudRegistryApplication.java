package net.eulerframework.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EulerCloudRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EulerCloudRegistryApplication.class, args);
    }
}
