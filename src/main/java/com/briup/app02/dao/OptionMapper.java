package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Option;

public interface OptionMapper {
	List<Option> findAll();

	Option findById(long id);

	void insertById(Option option);

	void updateById( Option option);

	void deleteById(long id);

}
