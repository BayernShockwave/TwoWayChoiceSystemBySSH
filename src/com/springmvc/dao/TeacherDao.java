package com.springmvc.dao;

import java.util.List;
import com.springmvc.dao.base.BaseDao;
import com.springmvc.model.Teacher;

public interface TeacherDao extends BaseDao<Teacher> {
	
	public List<Teacher> listAllTeachers();
    public List<Teacher> listPageTeachers(int offset,int rows);
    public void save(Teacher model);
    public void delete(String id);
    public Teacher queryTeacherById(String id);
    public void update(Teacher model);
    public List<Teacher> queryTeacherByCol(String col);
    public List<Teacher> queryTeacherByHob(String hob);
}