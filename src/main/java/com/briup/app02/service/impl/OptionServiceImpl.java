package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Option;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.service.IOptionService;

@Service
public class OptionServiceImpl implements IOptionService {
	@Autowired
	private OptionMapper optionMapper;

	@Override
	public List<Option> findAll() throws Exception {
		List<Option> list = optionMapper.findAll();

		return list;
	}

	@Override
	public Option findById(long id) {
		// TODO Auto-generated method stub
		return optionMapper.findById(id);
	}

	@Override
	public void updateById(Option option) throws Exception {
		// TODO Auto-generated method stub
		optionMapper.updateById(option);
	}

	@Override
	public void insertById(Option option) throws Exception {
		optionMapper.insertById(option);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Option option = optionMapper.findById(id);
		if (option != null) {
			optionMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
