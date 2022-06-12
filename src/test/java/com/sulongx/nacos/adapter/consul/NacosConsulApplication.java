package com.sulongx.nacos.adapter.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sulongx
 * @title 测试启动类
 * @details
 * @date 2022/6/12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsulApplication.class);
    }
}
