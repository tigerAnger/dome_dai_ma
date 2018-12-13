package com.example.demo.configuration.listener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听器
 */
@WebListener
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("======销毁监听器========");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("======进入监听器========");

    }
}