package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

//@Configuration
//@Import({
//        DispatcherServletAutoConfiguration.class,
//        //EmbeddedServletContainerAutoConfiguration.class,
//        ErrorMvcAutoConfiguration.class,
//        HttpEncodingAutoConfiguration.class,
//        HttpMessageConvertersAutoConfiguration.class,
//       JacksonAutoConfiguration.class,
//       //ServerPropertiesAutoConfiguration.class,
//        PropertyPlaceholderAutoConfiguration.class,
//        ThymeleafAutoConfiguration.class,
//        WebMvcAutoConfiguration.class,
//        //WebSocketAutoConfiguration.class,
//
//})

@SpringBootApplication
public class RestServiceApplication extends SpringBootServletInitializer {
    //Something from the internet to run servlet server
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RestServiceApplication.class);
    }

//    @Profile("local")

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
