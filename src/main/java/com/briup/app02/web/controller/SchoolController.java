package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.School;
import com.briup.app02.service.ISchoolService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/school")

public class SchoolController {
	@Autowired
	private ISchoolService SchoolService;

	@GetMapping("findAllQq")
	public MsgResponse findAllQq() {
		try {
			List<School> list = SchoolService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findSchoolById")
	public School findSchoolById(long id) {
		try {
			return SchoolService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertSchoolById")
	public void insertSchoolById(School student) {
		try {
			SchoolService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateSchoolById")
	public String updateSchoolById(School student) {
		try {
			SchoolService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteSchoolById")
	public MsgResponse deleteSchoolById(long id) {
		try {
			SchoolService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
