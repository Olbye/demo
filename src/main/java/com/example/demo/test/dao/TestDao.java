package com.example.demo.test.dao;

import com.example.demo.test.vo.TestVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface TestDao {
    List<TestVo> getUsers();
}
