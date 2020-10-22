package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author wangsh
 * @Classname LoadBalancer
 * @Description
 * @Date 2020/10/22 21:48
 */
public interface LoadBalancer {
    ServiceInstance insaInstance(List<ServiceInstance> serviceInstance);
}
