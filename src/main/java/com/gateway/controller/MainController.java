package com.gateway.controller;

import com.gateway.common.Req;
import com.gateway.mapper.entity.ApiMock;
import com.gateway.service.ApiMockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    ApiMockService apiMockService;

    @PostMapping("/mgw.htm")
    public ApiMock doPost(@RequestBody Req req) {
        logger.info("request data: " + req.getReferUrl());
        return apiMockService.getApiMock(req.getReferUrl());
    }

    @GetMapping("/getUser")
    public String doGet() {
        return "";
    }
}
