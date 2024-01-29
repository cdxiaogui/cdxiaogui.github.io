package com.wx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试的controller
 *
 * @author sunyawei3
 * @date 2023/3/20 6:14 下午
 */
@RestController
@Slf4j
public class AllController {

    @RequestMapping("/hellow")
    public String testBean1() {
        log.info("hellow");
        return "hellow";
    }

    @RequestMapping("/*")
    public String testBean2() {
        log.info("MmJZRjx9K0BU0T4j");
        return "MmJZRjx9K0BU0T4j";
    }


}
