package com.example.mybatisdemo;

/**
 * @author 听风
 * @create 2021-05-26 19:58
 **/
public interface UserDao {

	@Select("select * from user")
	void query();
}
