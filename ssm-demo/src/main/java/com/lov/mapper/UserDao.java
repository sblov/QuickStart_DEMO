package com.lov.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lov.bean.User;

@Repository
public interface UserDao {

	@Select("select id,username,password from tb_user where username = #{username}")
	public User findUserByName(String username);
	
}
