package com.springmvc.dao.impl;

import org.springframework.stereotype.Repository;
import com.springmvc.dao.UniAdminDao;
import com.springmvc.dao.base.BaseDaoImpl;
import com.springmvc.model.UniAdmin;
import java.util.List;

@Repository("uniadminDao")
public class UniAdminDaoImpl extends BaseDaoImpl<UniAdmin> implements UniAdminDao {
	
	public List<UniAdmin> listAllUniAdmins() {
        String hql="from UniAdmin";     
        List<UniAdmin> list = this.findAllByHQL(hql);     
        return list;
    }
	
	@Override
   	public List<UniAdmin> listPageUniAdmins(int offset, int rows) {
   		return null;
   	}
   
    public void save(UniAdmin entity) {
      super.save(entity);
    }
 
    public void delete(String id) {
        super.delete(id);
    }
 
    public void update(UniAdmin entity) {
       super.update(entity);
    }
    
	@Override
	public UniAdmin queryUniAdminById(String id) {
		return super.findById(id);
		
	}
}