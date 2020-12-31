package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.*;
import com.springmvc.dao.impl.*;
import com.springmvc.model.*;
import java.util.List;

@Service("studentService")

public class StudentService {
	
	@Autowired
    StudentDao studentDao;
	
	public List<Student> listAllStudents() {
        return studentDao.listAllStudents();
    }
 
    public List<Student> listPageUser(int offset,int rows) {
        return studentDao.listPageStudents(offset,rows);
    }
 
    public void save(Student model) {
    	studentDao.save(model);
    }
 
    public void update(Student model) {
    	studentDao.update(model);
    }
 
    public void delete(String id) {
    	studentDao.delete(id);
    }
    
    public Student queryStudentById(String id) {
		return studentDao.queryStudentById(id);
	}
    
    public List<Student> listStudentsByCol(String col) {
    	return studentDao.queryStudentByCol(col);
    }
}