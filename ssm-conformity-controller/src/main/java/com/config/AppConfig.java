package com.config;


import com.nf.demo.interceptors.FirstInterceptors;
import config.EnableMybatisSpring;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
//扫描dao层
@MapperScan("com.nf.demo.dao")


//扫描service ，controller 等。。。   切面  过滤器
@ComponentScan(value = {"com.nf.demo.service","com.nf.demo.controller","com.nf.demo.interceptors"})
@EnableMybatisSpring

//WebMvcConfigurer 这里面有很多默认实现的接口，
//例如下面的格式化，拦截器，静态资源处理等
public class AppConfig implements WebMvcConfigurer {

    //这是格式化
    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    //这是拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        InterceptorRegistration interceptorRegistry = registry.addInterceptor(new FirstInterceptors());
        interceptorRegistry.addPathPatterns("/**");
    }

    //这是静态资源
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration registration = registry.addResourceHandler("/static/**");
        registration.addResourceLocations("classpath:/static/");
    }
}
