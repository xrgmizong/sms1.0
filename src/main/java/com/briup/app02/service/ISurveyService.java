package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Survey;

public interface ISurveyService {
	List<Survey> findAll() throws Exception;

	Survey findById(long id) throws Exception;

	void updateById(Survey survey) throws Exception;

	void insertById(Survey servey) throws Exception;

	void deleteById(long id) throws Exception;


}
