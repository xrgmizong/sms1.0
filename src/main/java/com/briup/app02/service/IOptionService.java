package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Option;

public interface IOptionService {
	List<Option> findAll() throws Exception;

	Option findById(long id) throws Exception;

	void updateById(Option option) throws Exception;

	void insertById(Option option) throws Exception;

	void deleteById(long id) throws Exception;


}
