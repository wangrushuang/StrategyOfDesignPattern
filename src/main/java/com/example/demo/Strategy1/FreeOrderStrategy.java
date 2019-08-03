package com.example.demo.Strategy1;

import org.springframework.stereotype.Component;

@Component
@HandlerOrderType(Order.FREE) //使用注解标明策略类型
public class FreeOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("----处理免费订单----");
    }
}
