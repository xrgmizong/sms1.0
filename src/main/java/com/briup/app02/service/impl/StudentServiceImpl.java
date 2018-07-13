package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list = studentMapper.findAll();

		return list;
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return studentMapper.findById(id);
	}

	@Override
	public void updateById(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.updateById(student);
	}

	@Override
	public void insertById(Student student) throws Exception {
		studentMapper.insertById(student);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) throws Exception {
		Student student = studentMapper.findById(id);
		if (student != null) {
			studentMapper.deleteById(id);
			// TODO Auto-generated method stub
		} else {
			throw new Exception("你所要刪除的學生不在");
		}
	}

}
