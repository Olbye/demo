package com.example.demo.test.dao;

import com.example.demo.test.dto.UserDto;
import com.example.demo.test.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface TestDao {
    List<UserVo> getUsers();
    List<UserVo> getUser(UserDto userDto);
}
