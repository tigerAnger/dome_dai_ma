package com.example.demo.configuration.interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//主拦截器，根据拦截不同路径跳转不同自定义拦截器 （实现WebMvcConfigurer方法）
/**
 * 1：添加@Configuration注解
 *
 * 2：实现WebMvcConfigurer接口
 * @WebFilter(filterName = "CustomWebMvcConfigurer", urlPatterns = "/*") 不知道能不能使用
 */
@Configuration

public class CustomWebMvcConfigurer implements WebMvcConfigurer  {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*
        分发子拦截器
         */
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api1/*/**");//地址
//        registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/api2/*/**");

        //.excludePathPatterns("/api2/xxx/**"); //拦截全部 /*/*/**

        WebMvcConfigurer.super.addInterceptors(registry);
    }

}