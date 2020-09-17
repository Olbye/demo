package com.example.demo.test.controller;

import com.example.demo.test.service.TestService;
import com.example.demo.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/users")
public class TestController {

    private TestService service;
    @Autowired
    public void setService(TestService service) {
        this.service = service;
    }

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    public @ResponseBody List<TestVo> getUsers() {
        return service.getUsers();
    }
}
