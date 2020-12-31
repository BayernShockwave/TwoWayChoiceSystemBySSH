package com.springmvc.dao;

import java.util.List;
import com.springmvc.dao.base.BaseDao;
import com.springmvc.model.ColAdmin;

public interface ColAdminDao extends BaseDao<ColAdmin> {
 
    public List<ColAdmin> listAllColAdmins();
    public List<ColAdmin> listPageColAdmins(int offset,int rows);
    public void save(ColAdmin model);
    public void delete(String id);
    public ColAdmin queryColAdminById(String id);
    public void update(ColAdmin model);
}
