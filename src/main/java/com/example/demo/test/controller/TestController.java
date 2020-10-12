package com.example.demo.test.controller;

import com.example.demo.test.dto.UserDto;
import com.example.demo.test.service.TestService;
import com.example.demo.test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
public class TestController {

    private TestService service;
    @Autowired
    public void setService(TestService service) {
        this.service = service;
    }

    @GetMapping
    public @ResponseBody List<UserVo> getUsers() {
        return service.getUsers();
    }
    @PostMapping
    public @ResponseBody List<UserVo> getUser(@RequestBody UserDto userDto) {
        return service.getUser(userDto);
    }
}
