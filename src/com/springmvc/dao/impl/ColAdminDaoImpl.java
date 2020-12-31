package com.springmvc.dao.impl;

import org.springframework.stereotype.Repository;
import com.springmvc.dao.ColAdminDao;
import com.springmvc.dao.base.BaseDaoImpl;
import com.springmvc.model.ColAdmin;
import java.util.List;

@Repository("coladminDao")
public class ColAdminDaoImpl extends BaseDaoImpl<ColAdmin> implements ColAdminDao {
	
	public List<ColAdmin> listAllColAdmins() {
        String hql="from ColAdmin";     
        List<ColAdmin> list = this.findAllByHQL(hql);     
        return list;
    }
	
	@Override
   	public List<ColAdmin> listPageColAdmins(int offset, int rows) {
   		return null;
   	}
   
    public void save(ColAdmin entity) {
      super.save(entity);
    }
 
    public void delete(String id) {
        super.delete(id);
    }
 
    public void update(ColAdmin entity) {
       super.update(entity);
    }
    
	@Override
	public ColAdmin queryColAdminById(String id) {
		return super.findById(id);
	} 
}