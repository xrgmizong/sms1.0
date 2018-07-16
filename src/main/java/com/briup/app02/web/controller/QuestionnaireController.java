package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.service.IQuestionnaireService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/questionnaire")

public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService QuestionnaireService;

	@GetMapping("findAllQuestionnaire")
	public MsgResponse findAllQuestionnaire() {
		try {
			List<Questionnaire> list = QuestionnaireService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findQuestionnaireById")
	public Questionnaire findQuestionnaireById(long id) {
		try {
			return QuestionnaireService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertQuestionnaireById")
	public void insertQuestionnaireById(Questionnaire student) {
		try {
			QuestionnaireService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateQuestionnaireById")
	public String updateQuestionnaireById(Questionnaire student) {
		try {
			QuestionnaireService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteQuestionnaireById")
	public MsgResponse deleteQuestionnaireById(long id) {
		try {
			QuestionnaireService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
