package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.User;
import com.briup.app02.service.IUserService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/user")

public class UserContoller {
	@Autowired
	private IUserService userService;

	@GetMapping("findAllUser")
	public MsgResponse findAllUser() {
		try {
			List<User> list = userService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findUserById")
	public User findUserById(long id) {
		try {
			return userService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertUserById")
	public void insertUserById(User student) {
		try {
			userService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateUserById")
	public String updateUserById(User student) {
		try {
			userService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteUserById")
	public MsgResponse deleteUserById(long id) {
		try {
			userService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
