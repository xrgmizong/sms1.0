package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Qq;
import com.briup.app02.dao.QqMapper;
import com.briup.app02.service.IQqService;

@Service
public class QqServiceImpl implements IQqService {
	@Autowired
	private QqMapper QqtMapper;

	@Override
	public List<Qq> findAll() throws Exception {
		List<Qq> list = QqtMapper.findAll();

		return list;
	}

	@Override
	public Qq findById(long id) {
		// TODO Auto-generated method stub
		return QqtMapper.findById(id);
	}

	@Override
	public void updateById(Qq qq) throws Exception {
		// TODO Auto-generated method stub
		QqtMapper.updateById(qq);
	}

	@Override
	public void insertById(Qq qq) throws Exception {
		QqtMapper.insertById(qq);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Qq qq = QqtMapper.findById(id);
		if (qq != null) {
			QqtMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
