package com.cloud2.discover;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZCloud2DiscoverApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2DiscoverApplication.class).web(true).run(args);
    }

}
