package com.example.deploy02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DeployController {

    @GetMapping("/random-sum")
    public String getRandomSum() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int sum = num1 + num2;
        return "Sum of " + num1 + " and " + num2 + " is: " + sum;
    }
}
