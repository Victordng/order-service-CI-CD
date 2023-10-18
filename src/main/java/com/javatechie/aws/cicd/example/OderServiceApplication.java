package com.javatechie.aws.cicd.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OderServiceApplication {

    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrders() {
        return orderDao.getOrders();
    }


    public static void main(String[] args) {
        SpringApplication.run(OderServiceApplication.class, args);
    }

}
