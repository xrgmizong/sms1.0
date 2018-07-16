package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Clazz;
import com.briup.app02.service.IClazzService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/clazz")

public class ClazzController {
	@Autowired
	private IClazzService clazzService;

	@GetMapping("findAllClazz")
	public MsgResponse findAllClazz() {
		try {
			List<Clazz> list = clazzService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findClazzById")
	public Clazz findClazzById(long id) {
		try {
			return clazzService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertClazzById")
	public void insertClazzById(Clazz student) {
		try {
			clazzService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateClazzById")
	public String updateClazzById(Clazz student) {
		try {
			clazzService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteClazzById")
	public MsgResponse deleteClazzById(long id) {
		try {
			clazzService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
