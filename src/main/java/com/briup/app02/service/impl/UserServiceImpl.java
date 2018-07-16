package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.User;
import com.briup.app02.dao.UserMapper;
import com.briup.app02.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() throws Exception {
		List<User> list = userMapper.findAll();

		return list;
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}

	@Override
	public void updateById(User user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.updateById(user);
	}

	@Override
	public void insertById(User user) throws Exception {
		userMapper.insertById(user);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		User user = userMapper.findById(id);
		if (user != null) {
			userMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
