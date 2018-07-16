package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.School;

public interface SchoolMapper {
	List<School> findAll();

	School findById(long id);

	void insertById(School school);

	void updateById( School school);

	void deleteById(long id);

}
