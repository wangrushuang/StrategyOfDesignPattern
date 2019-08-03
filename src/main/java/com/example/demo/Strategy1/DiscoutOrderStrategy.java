package com.example.demo.Strategy1;

import org.springframework.stereotype.Component;

@Component
@HandlerOrderType(Order.DISCOUT)
public class DiscoutOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("----处理打折订单----");
    }
}
