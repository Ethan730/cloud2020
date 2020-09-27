package com.ethan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ConfigClientController
 * @Author : ethan
 * @Date: 2020-09-25 21:44
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${server.port")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}