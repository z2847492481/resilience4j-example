package com.zhq.resilience4jexample.controller;

import com.zhq.resilience4jexample.entity.User;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @DATE: 2024-03-11 22:20
 * @Author: zhq123
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @GetMapping("/getUserInfo")
    @CircuitBreaker(name = "myCircuitBreaker")
    public User getUserInfo(@RequestParam("id") Long id) {
        Random random = new Random();
        // 模拟失败
        int i = random.nextInt(100);
        if (i < 10) {
            return new User(id, "user-" + id);
        }else {
            throw new RuntimeException("error");
        }
    }
}
