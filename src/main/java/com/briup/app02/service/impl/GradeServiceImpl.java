package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Grade;
import com.briup.app02.dao.GradeMapper;
import com.briup.app02.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService {
	@Autowired
	private GradeMapper gradeMapper;

	@Override
	public List<Grade> findAll() throws Exception {
		List<Grade> list = gradeMapper.findAll();

		return list;
	}

	@Override
	public Grade findById(long id) {
		// TODO Auto-generated method stub
		return gradeMapper.findById(id);
	}

	@Override
	public void updateById(Grade grade) throws Exception {
		// TODO Auto-generated method stub
		gradeMapper.updateById(grade);
	}

	@Override
	public void insertById(Grade grade) throws Exception {
		gradeMapper.insertById(grade);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Grade grade = gradeMapper.findById(id);
		if (grade != null) {
			gradeMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
