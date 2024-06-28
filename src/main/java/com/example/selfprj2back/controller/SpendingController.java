package com.example.selfprj2back.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/spending")
public class SpendingController {

    @PostMapping("add")
    public void add() {
        System.out.println("SpendingController.add");
    }
}
