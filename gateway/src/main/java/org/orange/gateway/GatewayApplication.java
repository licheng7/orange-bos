package org.orange.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"org.orange"})
@PropertySource(value = {"classpath:application.yml", "classpath:bootstrap.yml", "classpath" +
        ":bootstrap-dev.yml", "classpath:bootstrap-test.yml", "classpath:bootstrap-prod.yml"})
@EnableDiscoveryClient
public class GatewayApplication
{
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GatewayApplication.class, args);
        /*String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);*/
    }
}
