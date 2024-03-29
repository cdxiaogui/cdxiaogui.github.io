package com.wx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * 启动程序--起飞
 *
 * @author sunyawei3
 * @date 2023/3/22 3:31 下午
 */

@SpringBootApplication
@ComponentScan({"com.wx.*"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
