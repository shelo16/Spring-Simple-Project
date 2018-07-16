package com.tornikeshelia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "com.tornikeshelia")
@Configuration
public class WebConfig {

    public static final String RESOLVER_PREFIX = "/WEB-INF/views/";
    public static final String RESOLVER_SUFFIX = ".jsp";

    @Bean
    public ViewResolver viewResolver(){
        UrlBasedViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(RESOLVER_SUFFIX);
        resolver.setPrefix(RESOLVER_PREFIX);
        return resolver;
    }

}
