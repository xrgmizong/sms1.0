package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Qq;
import com.briup.app02.service.IQqService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/qq")

public class QqController {
	@Autowired
	private IQqService qqService;

	@GetMapping("findAllQq")
	public MsgResponse findAllQq() {
		try {
			List<Qq> list = qqService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findQqById")
	public Qq findQqById(long id) {
		try {
			return qqService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertQqById")
	public void insertQqById(Qq student) {
		try {
			qqService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateQqById")
	public String updateQqById(Qq student) {
		try {
			qqService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteQqById")
	public MsgResponse deleteQqById(long id) {
		try {
			qqService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
