package com.ethan.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName : MyLB
 * @Author : ethan
 * @Date: 2020-09-17 14:10
 */
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int curr;
        int next;
        do {
            curr = this.atomicInteger.get();
            next = curr >= 2147483647 ? 0 : curr + 1;
        } while (!this.atomicInteger.compareAndSet(curr, next));
        System.out.println(">>>>>>>>>>>next: " + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstanceList) {
        int index = this.getAndIncrement() % serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }
}
