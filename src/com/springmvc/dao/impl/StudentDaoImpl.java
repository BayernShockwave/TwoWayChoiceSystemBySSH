package com.springmvc.dao.impl;

import org.springframework.stereotype.Repository;
import com.springmvc.dao.StudentDao;
import com.springmvc.dao.base.BaseDaoImpl;
import com.springmvc.model.Student;
import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {
	
	public List<Student> listAllStudents() {
        String hql="from Student";     
        List<Student> list = this.findAllByHQL(hql);     
        return list;
    }
	
	@Override
   	public List<Student> listPageStudents(int offset, int rows) {
   		return null;
   	}
   
    public void save(Student entity) {
      super.save(entity);
    }
 
    public void delete(String id) {
        super.delete(id);
    }
 
    public void update(Student entity) {
       super.update(entity);
    }
    
	@Override
	public Student queryStudentById(String id) {
		return super.findById(id);
		
	}
	
	@Override
	public List<Student> queryStudentByCol(String col) {
		String hql="from Student where Scol = ?";
        List<Student> list = this.findByHQL(hql, col);
        return list;
	}
}