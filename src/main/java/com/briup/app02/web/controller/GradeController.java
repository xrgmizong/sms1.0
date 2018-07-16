package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Grade;
import com.briup.app02.service.IGradeService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/grade")

public class GradeController {
	@Autowired
	private IGradeService gradeService;

	@GetMapping("findAllGrade")
	public MsgResponse findAllGrade() {
		try {
			List<Grade> list = gradeService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findGradeById")
	public Grade findGradeById(long id) {
		try {
			return gradeService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertGradeById")
	public void insertGradeById(Grade student) {
		try {
			gradeService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateGradeById")
	public String updateGradeById(Grade student) {
		try {
			gradeService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteGradeById")
	public MsgResponse deleteGradeById(long id) {
		try {
			gradeService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
