package com.phoenix.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 16:01
 */
@Controller
public class SysLoginController {

    @GetMapping("/login")
    public String login() {

        return "login";
    }


}
