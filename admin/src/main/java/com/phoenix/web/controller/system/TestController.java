package com.phoenix.web.controller.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/7/12 14:14
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/abc")
    public String test() {

        return "abc";
    }


}
