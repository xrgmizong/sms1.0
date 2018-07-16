package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.service.ISurveyService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/survey")

public class SurveyController {
	@Autowired
	private ISurveyService SurveyService;

	@GetMapping("findAllSurvey")
	public MsgResponse findAllSurvey() {
		try {
			List<Survey> list = SurveyService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findSurveyById")
	public Survey findSurveyById(long id) {
		try {
			return SurveyService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertSurveyById")
	public void insertSurveyById(Survey student) {
		try {
			SurveyService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateSurveyById")
	public String updateSurveyById(Survey student) {
		try {
			SurveyService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteSurveyById")
	public MsgResponse deleteSurveyById(long id) {
		try {
			SurveyService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
