package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.service.ICourseService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/course")

public class CourseController {
	@Autowired
	private ICourseService courseService;

	@GetMapping("findAllCourse")
	public MsgResponse findAllCourse() {
		try {
			List<Course> list = courseService.findAll();
			return MsgResponse.success("查詢成功", list);

		}

		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			// TODO: handle exception
		}
	}

	@GetMapping("findCourseById")
	public Course findCourseById(long id) {
		try {
			return courseService.findById(id);

		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}

	}

	@PostMapping("insertCourseById")
	public void insertCourseById(Course student) {
		try {
			courseService.insertById(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("updateCourseById")
	public String updateCourseById(Course student) {
		try {
			courseService.updateById(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PostMapping("deleteCourseById")
	public MsgResponse deleteCourseById(long id) {
		try {
			courseService.deleteById(id);
			return MsgResponse.success("刪除成功", null);

		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
