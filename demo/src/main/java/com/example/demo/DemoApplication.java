package com.example.demo;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类中加入@EnableScheduling来开启定时任务
 * @EnableScheduling  去com.example.demo.configuration.timer.QuartzService类 执行定时的任务
 */
//@EnableScheduling
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.err.println("Spring Boot 启动成功!!!");
    }
}
