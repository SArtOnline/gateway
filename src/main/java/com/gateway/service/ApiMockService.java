package com.gateway.service;

import com.gateway.mapper.ApiMockMapper;
import com.gateway.mapper.entity.ApiMock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiMockService {
    private static final Logger logger = LoggerFactory.getLogger(ApiMockService.class);

    @Autowired
    ApiMockMapper apiMockMapper;

    public ApiMock getApiMock(String urlPattern) {
        return apiMockMapper.selectApiMock(urlPattern);
    }
}
