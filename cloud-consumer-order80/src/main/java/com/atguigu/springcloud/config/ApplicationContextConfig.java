package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangsh
 * @Classname ApplicationContextConfig
 * @Description
 * @Date 2020/9/24 22:34
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
   // @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    /**
     * 获取到restTemplate对象
     */
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
