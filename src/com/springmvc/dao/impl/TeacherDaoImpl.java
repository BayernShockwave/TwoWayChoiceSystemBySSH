package com.springmvc.dao.impl;

import org.springframework.stereotype.Repository;
import com.springmvc.dao.TeacherDao;
import com.springmvc.dao.base.BaseDaoImpl;
import com.springmvc.model.Teacher;
import java.util.List;

@Repository("teacherDao")
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao {
	
	public List<Teacher> listAllTeachers() {
        String hql="from Teacher";     
        List<Teacher> list = this.findAllByHQL(hql);     
        return list;
    }
	
	@Override
   	public List<Teacher> listPageTeachers(int offset, int rows) {
   		return null;
   	}
   
    public void save(Teacher entity) {
      super.save(entity);
    }
 
    public void delete(String id) {
        super.delete(id);
    }
 
    public void update(Teacher entity) {
       super.update(entity);
    }
    
	@Override
	public Teacher queryTeacherById(String id) {
		return super.findById(id);
		
	}
	
	@Override
	public List<Teacher> queryTeacherByCol(String col) {
		String hql="from Teacher where Tcol = ?";
        List<Teacher> list = this.findByHQL(hql, col);
        return list;
	}
	
	@Override
	public List<Teacher> queryTeacherByHob(String hob) {
		String hql="from Teacher where Thob = ?";
        List<Teacher> list = this.findByHQL(hql, hob);
        return list;
	}
}