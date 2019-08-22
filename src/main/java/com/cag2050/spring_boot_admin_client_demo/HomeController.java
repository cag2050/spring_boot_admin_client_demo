package com.cag2050.spring_boot_admin_client_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    String home() {
        return "Spring Boot Admin Client";
    }
}
