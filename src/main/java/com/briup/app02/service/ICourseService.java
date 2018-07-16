package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Course;

public interface ICourseService {
	List<Course> findAll() throws Exception;

	Course findById(long id) throws Exception;

	void updateById(Course course) throws Exception;

	void insertById(Course course) throws Exception;

	void deleteById(long id) throws Exception;


}
