package com.spboot.ang.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/assets/css/"); //my css are in src/resources/assets/css that's why given like this.
//        registry.addResourceHandler("/emp/**").addResourceLocations("classpath:/emp/");
//        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/assets/images/");
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/assets/js/");
//    }
}

