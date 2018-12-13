package com.example.demo.configuration.timer;

import com.example.demo.DruidConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * spring boot的定时任务
 */
@Component
public class ScheduledService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Cron表达式在线工具
     * http://www.pppet.net/
     */
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled(){
        logger.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        logger.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 5000)
    public void scheduled2() {
        logger.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
    }

}

