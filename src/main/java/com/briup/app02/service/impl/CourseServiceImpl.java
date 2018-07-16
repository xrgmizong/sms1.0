package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> findAll() throws Exception {
		List<Course> list = courseMapper.findAll();

		return list;
	}

	@Override
	public Course findById(long id) {
		// TODO Auto-generated method stub
		return courseMapper.findById(id);
	}

	@Override
	public void updateById(Course course) throws Exception {
		// TODO Auto-generated method stub
		courseMapper.updateById(course);
	}

	@Override
	public void insertById(Course course) throws Exception {
		courseMapper.insertById(course);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Course course = courseMapper.findById(id);
		if (course != null) {
			courseMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
