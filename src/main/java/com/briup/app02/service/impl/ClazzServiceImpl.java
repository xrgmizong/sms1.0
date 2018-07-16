package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.dao.ClazzMapper;
import com.briup.app02.service.IClazzService;

@Service
public class ClazzServiceImpl implements IClazzService {
	@Autowired
	private ClazzMapper clazzMapper;

	@Override
	public List<Clazz> findAll() throws Exception {
		List<Clazz> list = clazzMapper.findAll();

		return list;
	}

	@Override
	public Clazz findById(long id) {
		// TODO Auto-generated method stub
		return clazzMapper.findById(id);
	}

	@Override
	public void updateById(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		clazzMapper.updateById(clazz);
	}

	@Override
	public void insertById(Clazz clazz) throws Exception {
		clazzMapper.insertById(clazz);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Clazz clazz = clazzMapper.findById(id);
		if (clazz != null) {
			clazzMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
