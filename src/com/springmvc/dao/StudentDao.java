package com.springmvc.dao;

import java.util.List;
import com.springmvc.dao.base.BaseDao;
import com.springmvc.model.Student;

public interface StudentDao extends BaseDao<Student> {
	
	public List<Student> listAllStudents();
    public List<Student> listPageStudents(int offset,int rows);
    public void save(Student model);
    public void delete(String id);
    public Student queryStudentById(String id);
    public void update(Student model);
    public List<Student> queryStudentByCol(String col);
}