package com.ethan.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName : LoadBalancer
 * @Author : ethan
 * @Date: 2020-09-17 14:07
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
