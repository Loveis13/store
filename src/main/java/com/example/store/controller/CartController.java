package com.example.store.controller;

import com.example.store.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/add")
    public String add(@RequestParam List<Long> items) {
        cartService.add(items);
        return "Товары добавлены";
    }

    @GetMapping("/get")
    public List<Long> get() {
        return cartService.get();
    }
}
