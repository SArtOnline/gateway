package com.gateway.mapper;

import com.gateway.mapper.entity.ApiMock;

public interface ApiMockMapper {
    public abstract ApiMock selectApiMock(String urlPattern);

}
