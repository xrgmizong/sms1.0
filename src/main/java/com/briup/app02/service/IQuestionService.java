package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Question;

public interface IQuestionService {
	List<Question> findAll() throws Exception;

	Question findById(long id) throws Exception;

	void updateById(Question question) throws Exception;

	void insertById(Question question) throws Exception;

	void deleteById(long id) throws Exception;


}
