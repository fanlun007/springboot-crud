package com.fanlun.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//使用 WebMvcConfigurer 扩展 SpringMVC 的 功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //相当于 view-controller : 直接转发页面 不经过controller
        registry.addViewController("/fanlun").setViewName("success");
    }
}
