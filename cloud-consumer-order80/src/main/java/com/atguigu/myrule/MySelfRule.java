package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
/**
 * @author wangsh
 * @Classname OrderMain80
 * @Description
 * @Date 2020/9/24 22:26
 */
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //定义为随机
        return new RandomRule();
    }
}
