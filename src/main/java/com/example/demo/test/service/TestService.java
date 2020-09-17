package com.example.demo.test.service;

import com.example.demo.test.dao.TestDao;
import com.example.demo.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestDao dao;

    public List<TestVo> getUsers() {
        return dao.getUsers();
    }
}
