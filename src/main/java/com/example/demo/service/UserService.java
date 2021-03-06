package com.example.demo.service;


import com.example.demo.model.CreateMallMerchantParam;

import javax.servlet.http.HttpServletResponse;

public interface UserService {
    String getUserById(String userId);

    String testRedisSet(String userId);

    String testRedisTemplateAdd(String userId);

    String testZAdd(String userId);

    String testZReverseRange(String userId);

    String testValid(CreateMallMerchantParam param, HttpServletResponse response);
}
