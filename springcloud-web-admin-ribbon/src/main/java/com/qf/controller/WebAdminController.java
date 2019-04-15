package com.qf.controller;

import com.qf.service.WebAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAdminController {
    @Autowired
    private WebAdminService webAdminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String hello(@RequestParam String message){

        return  webAdminService.sayhello(message);
    }
}
