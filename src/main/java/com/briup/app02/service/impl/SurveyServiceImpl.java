package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Survey;
import com.briup.app02.dao.SurveyMapper;
import com.briup.app02.service.ISurveyService;

@Service
public class SurveyServiceImpl implements ISurveyService {
	@Autowired
	private SurveyMapper surveyMapper;

	@Override
	public List<Survey> findAll() throws Exception {
		List<Survey> list = surveyMapper.findAll();

		return list;
	}

	@Override
	public Survey findById(long id) {
		// TODO Auto-generated method stub
		return surveyMapper.findById(id);
	}

	@Override
	public void updateById(Survey survey) throws Exception {
		// TODO Auto-generated method stub
		surveyMapper.updateById(survey);
	}

	@Override
	public void insertById(Survey survey) throws Exception {
		surveyMapper.insertById(survey);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Survey survey = surveyMapper.findById(id);
		if (survey != null) {
			surveyMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
