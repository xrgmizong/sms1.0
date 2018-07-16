package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.School;
import com.briup.app02.dao.SchoolMapper;
import com.briup.app02.service.ISchoolService;

@Service
public class SchoolServiceImpl implements ISchoolService {
	@Autowired
	private SchoolMapper schoolMapper;

	@Override
	public List<School> findAll() throws Exception {
		List<School> list = schoolMapper.findAll();

		return list;
	}

	@Override
	public School findById(long id) {
		// TODO Auto-generated method stub
		return schoolMapper.findById(id);
	}

	@Override
	public void updateById(School school) throws Exception {
		// TODO Auto-generated method stub
		schoolMapper.updateById(school);
	}

	@Override
	public void insertById(School school) throws Exception {
		schoolMapper.insertById(school);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		School school = schoolMapper.findById(id);
		if (school != null) {
			schoolMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
