package com.model.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.model.User;

public interface UserDao {
	//增加用户
	@Insert(" 		INSERT	INTO user(name,pwd,state)	VALUES(#{name},#{pwd},#{state})")
	void addUser(User u);
	 
	//删除用户
	@Update(" 		UPDATE user	SET	state=#{state}	WHERE	id=#{id}")
	void deleteUser(User u);
	 
	//更新用户信息
	@Update(" 		UPDATE user	SET	name=#{name}	WHERE	id=#{id}")
	void updateUser(User u);
	 
	//的到用户信息
	@Select(" 		SELECT	* FROM user	WHERE	id= #{id}")
	User getUserById(int id);
	
	//得到用户信息
	@Select(" SELECT * FROM user WHERE name=#{name}")
	User getUserByName(String name);
	 
	//得到用户数目
	@Select(" 		SELECT	COUNT(*)	FROM user")
	int getUserNum();

}
