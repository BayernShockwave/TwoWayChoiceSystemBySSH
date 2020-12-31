package com.springmvc.dao;

import java.util.List;
import com.springmvc.dao.base.BaseDao;
import com.springmvc.model.UniAdmin;

public interface UniAdminDao extends BaseDao<UniAdmin> {
	
	public List<UniAdmin> listAllUniAdmins();
    public List<UniAdmin> listPageUniAdmins(int offset,int rows);
    public void save(UniAdmin model);
    public void delete(String id);
    public UniAdmin queryUniAdminById(String id);
    public void update(UniAdmin model);
}