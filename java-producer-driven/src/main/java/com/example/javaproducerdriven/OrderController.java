package com.example.javaproducerdriven;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("/order")
    public OrderResponse createOrder(@RequestBody OrderRequest order) {
        return new OrderResponse("asdasd");
    }
}




