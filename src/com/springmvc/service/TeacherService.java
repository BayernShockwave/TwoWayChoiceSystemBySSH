package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.*;
import com.springmvc.dao.impl.*;
import com.springmvc.model.*;
import java.util.List;

@Service("teacherService")
public class TeacherService {
	
	@Autowired
	TeacherDao teacherDao;
	
	public List<Teacher> listTeachersByCol(String col) {
        return teacherDao.queryTeacherByCol(col);
    }
	
	public Teacher queryTeacherById(String id) {
		return teacherDao.queryTeacherById(id);
	}
	
	public void update(Teacher model){
    	teacherDao.update(model);
    }
	
	public List<Teacher> listTeachersByHob(String hob){
        return teacherDao.queryTeacherByHob(hob);
    }
	
	public List<Teacher> listAllTeachers() {
		return teacherDao.listAllTeachers();
	}
	
	public void save(Teacher model) {
    	teacherDao.save(model);
    }
	
	public void delete(String id) {
    	teacherDao.delete(id);
    }
}