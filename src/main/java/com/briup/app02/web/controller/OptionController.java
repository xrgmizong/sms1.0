package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Option;
import com.briup.app02.service.IOptionService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/option")

public class OptionController {
	@Autowired
	private IOptionService optionService;

	@GetMapping("findAllOption")
	public MsgResponse findAllOption() {
		try {
			List<Option> list = optionService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findOptionById")
	public Option findOptionById(long id) {
		try {
			return optionService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertOptionById")
	public void insertOptionById(Option student) {
		try {
			optionService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateOptionById")
	public String updateOptionById(Option student) {
		try {
			optionService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteOptionById")
	public MsgResponse deleteOptionById(long id) {
		try {
			optionService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
