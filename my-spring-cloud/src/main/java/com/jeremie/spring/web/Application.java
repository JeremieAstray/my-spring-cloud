package com.jeremie.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guanhong 15/7/27 下午6:58.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
//@EnableDiscoveryClient
public class Application {

    @Value("${config.name}")
    String name = "World";

    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }

    @RequestMapping("/html")
    public String html() {
        return "test.html";
    }

    @RequestMapping("/velocity")
    public String velocity(Model model) {
        model.addAttribute("vmtest", "guanhong!");
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}