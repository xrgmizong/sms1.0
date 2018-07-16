package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/question")

public class QuestionController {
	@Autowired
	private IQuestionService questionService;

	@GetMapping("findAllQuestion")
	public MsgResponse findAllVQuestion() {
		try {
			List<Question> list = questionService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findQuestionById")
	public Question findQuestionById(long id) {
		try {
			return questionService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertQuestionById")
	public void insertQuestionById(Question student) {
		try {
			questionService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateQuestionById")
	public String updateQuestionById(Question student) {
		try {
			questionService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteQuestionById")
	public MsgResponse deleteQuestionById(long id) {
		try {
			questionService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
