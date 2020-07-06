package com.kts.cloudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
// 注册feign后删除
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApiApplication.class, args);
    }

}
