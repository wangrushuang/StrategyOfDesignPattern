package com.example.demo.Strategy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    private Order order;

    @GetMapping("/order")
    public void Controller() {
        order.setName("");
        order.setPrice(99.9);
        order.setType(1);

        orderService.handleOrder(order);

    }

}
