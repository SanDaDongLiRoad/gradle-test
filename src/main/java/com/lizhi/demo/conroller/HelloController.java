package com.lizhi.demo.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author xulizhi-lenovo
 * @date 2019/7/30
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public  String Home() {
        return "Hello";
    }
}
