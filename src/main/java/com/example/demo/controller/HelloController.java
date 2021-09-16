package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Christoffer Grännby
 * Date: 2021-09-16
 * Time: 13:19
 * Project: demo
 * Copyright: MIT
 */

@RestController
@RequestMapping(path="/hello")
public class HelloController  {

    @GetMapping
    public String returnHello () {
        return "Hello World";
    }
}
