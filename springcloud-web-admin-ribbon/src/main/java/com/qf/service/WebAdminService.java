package com.qf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WebAdminService {
    @Autowired
    private RestTemplate restTemplate;


    public String sayhello(String message){
        return restTemplate.getForObject("http://springcloud-service-admin/hi?message="+message,String.class);
    }
}
