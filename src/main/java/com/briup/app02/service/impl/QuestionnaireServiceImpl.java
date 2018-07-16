package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.dao.QuestionnaireMapper;
import com.briup.app02.service.IQuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
	@Autowired
	private QuestionnaireMapper questionnaireMapper;

	@Override
	public List<Questionnaire> findAll() throws Exception {
		List<Questionnaire> list = questionnaireMapper.findAll();

		return list;
	}

	@Override
	public Questionnaire findById(long id) {
		// TODO Auto-generated method stub
		return questionnaireMapper.findById(id);
	}

	@Override
	public void updateById(Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.updateById(questionnaire);
	}

	@Override
	public void insertById(Questionnaire questionnaire) throws Exception {
		questionnaireMapper.insertById(questionnaire);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Questionnaire questionnaire = questionnaireMapper.findById(id);
		if (questionnaire != null) {
			questionnaireMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
