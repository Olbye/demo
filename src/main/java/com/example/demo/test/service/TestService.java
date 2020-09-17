package com.example.demo.test.service;

import com.example.demo.test.dao.TestDao;
import com.example.demo.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TestService {

    private TestDao dao;
    @Autowired
    public void setDao(TestDao dao) {
        this.dao = dao;
    }
    public List<TestVo> getUsers() {
        return dao.getUsers();
    }
}
