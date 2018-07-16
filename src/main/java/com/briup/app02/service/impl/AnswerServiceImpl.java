package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Answer;
import com.briup.app02.dao.AnswerMapper;
import com.briup.app02.service.IAnswerService;

@Service
public class AnswerServiceImpl implements IAnswerService {
	@Autowired
	private AnswerMapper answerMapper;

	@Override
	public List<Answer> findAll() throws Exception {
		List<Answer> list = answerMapper.findAll();

		return list;
	}

	@Override
	public Answer findById(long id) {
		// TODO Auto-generated method stub
		return answerMapper.findById(id);
	}

	@Override
	public void updateById(Answer answer) throws Exception {
		// TODO Auto-generated method stub
		answerMapper.updateById(answer);
	}

	@Override
	public void insertById(Answer answer) throws Exception {
		answerMapper.insertById(answer);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Answer answer = answerMapper.findById(id);
		if (answer != null) {
			answerMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
