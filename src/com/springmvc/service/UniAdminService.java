package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.dao.*;
import com.springmvc.dao.impl.*;
import com.springmvc.model.*;
import java.util.List;

@Service("uniAdminService")
public class UniAdminService {

	@Autowired
    SysOpenDao sysOpenDao;
	
	public List<SysOpen> listAllSysOpens() {
        return sysOpenDao.listAllSysOpens();
    }
	
	public void update(SysOpen model) {
		sysOpenDao.update(model);
    }
}