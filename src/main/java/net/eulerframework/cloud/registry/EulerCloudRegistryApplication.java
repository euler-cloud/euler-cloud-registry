package net.eulerframework.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class EulerCloudRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EulerCloudRegistryApplication.class, args);
    }
}
