package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Question;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.service.IQuestionService;

@Service
public class QuestionServiceImpl implements IQuestionService {
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public List<Question> findAll() throws Exception {
		List<Question> list = questionMapper.findAll();

		return list;
	}

	@Override
	public Question findById(long id) {
		// TODO Auto-generated method stub
		return questionMapper.findById(id);
	}

	@Override
	public void updateById(Question question) throws Exception {
		// TODO Auto-generated method stub
		questionMapper.updateById(question);
	}

	@Override
	public void insertById(Question question) throws Exception {
		questionMapper.insertById(question);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Question question = questionMapper.findById(id);
		if (question != null) {
			questionMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
