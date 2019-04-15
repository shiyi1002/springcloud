package com.qf.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 */
@Configuration
public class RestConfiguration {

    @Bean
    @LoadBalanced//表示开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
