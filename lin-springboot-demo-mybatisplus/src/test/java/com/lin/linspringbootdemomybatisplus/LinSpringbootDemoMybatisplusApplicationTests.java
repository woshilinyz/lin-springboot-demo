package com.lin.linspringbootdemomybatisplus;

import com.lin.linspringbootdemomybatisplus.entity.User;
import com.lin.linspringbootdemomybatisplus.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LinSpringbootDemoMybatisplusApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void testSelectAll() {
		List<User> userList = userMapper.selectList(null);
		log.info("select All:{}",userList);
	}

}
