package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.*;
import com.springmvc.dao.impl.*;
import com.springmvc.model.*;
import java.util.List;

@Service("colAdminService")
public class ColAdminService {
 
    @Autowired
    ColAdminDao colAdminDao;
 
    public List<ColAdmin> listAllColAdmins() {
        return colAdminDao.listAllColAdmins();
    }
 
    public List<ColAdmin> listPageUser(int offset,int rows) {
        return colAdminDao.listPageColAdmins(offset,rows);
    }
 
    public void save(ColAdmin model) {
    	colAdminDao.save(model);
    }
 
    public void update(ColAdmin model) {
    	colAdminDao.update(model);
    }
 
    public void delete(String id) {
    	colAdminDao.delete(id);
    }
    
    public ColAdmin queryColAdminById(String id) {
		return colAdminDao.queryColAdminById(id);
	}  
}