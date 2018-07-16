package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.User;

public interface IUserService {
	List<User> findAll() throws Exception;

	User findById(long id) throws Exception;

	void updateById(User user) throws Exception;

	void insertById(User user) throws Exception;

	void deleteById(long id) throws Exception;


}
