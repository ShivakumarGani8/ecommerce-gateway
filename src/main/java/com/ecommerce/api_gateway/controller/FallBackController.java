package com.ecommerce.api_gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @RequestMapping("/orderServiceFallBack")
    public String orderServiceFallBack(){
        return "OrderService unavailable";
    }
    @RequestMapping("/productServiceFallBack")
    public String productServiceFallBack(){
        return "ProductService unavailable";
    }@RequestMapping("/paymentServiceFallBack")
    public String paymentServiceFallBack(){
        return "PaymentService unavailable";
    }

}
