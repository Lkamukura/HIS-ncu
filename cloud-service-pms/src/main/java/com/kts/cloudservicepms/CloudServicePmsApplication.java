package com.kts.cloudservicepms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//添加数据库后可去掉下面注解
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CloudServicePmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServicePmsApplication.class, args);
    }

}
