package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.*;
import com.springmvc.dao.impl.*;
import com.springmvc.model.*;
import java.util.List;

@Service("validationService")

public class ValidationService {
	
	@Autowired
    StudentDao studentDao;
	
	@Autowired
    TeacherDao teacherDao;
	
	@Autowired
    ColAdminDao colAdminDao;
	
	@Autowired
    UniAdminDao uniAdminDao;
	
	public List<Student> listAllStudents(){
        return studentDao.listAllStudents();
    }
	
	public List<Teacher> listAllTeachers(){
        return teacherDao.listAllTeachers();
    }
	
	public List<ColAdmin> listAllColAdmins(){
        return colAdminDao.listAllColAdmins();
    }
	
	public List<UniAdmin> listAllUniAdmins(){
        return uniAdminDao.listAllUniAdmins();
    }
}