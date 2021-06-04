package org.orange.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"org.orange.provide"})
@PropertySource(value = {"classpath:application.yml", "classpath:bootstrap.yml", "classpath" +
        ":bootstrap-dev.yml", "classpath:bootstrap-test.yml", "classpath:bootstrap-prod.yml"})
@EnableDiscoveryClient
public class ProviderApplication
{
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
