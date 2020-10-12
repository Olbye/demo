package com.example.demo.test.service;

import com.example.demo.test.dao.TestDao;
import com.example.demo.test.dto.UserDto;
import com.example.demo.test.vo.UserVo;
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
    public List<UserVo> getUsers() {
        return dao.getUsers();
    }
    public List<UserVo> getUser(UserDto userDto) {
        return dao.getUser(userDto);
    }
}
