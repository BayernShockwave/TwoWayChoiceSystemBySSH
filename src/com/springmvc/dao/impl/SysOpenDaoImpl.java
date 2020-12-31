package com.springmvc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.springmvc.dao.SysOpenDao;
import com.springmvc.dao.base.BaseDaoImpl;
import com.springmvc.model.SysOpen;

@Repository("sysOpenDao")
public class SysOpenDaoImpl extends BaseDaoImpl<SysOpen> implements SysOpenDao {
	
	public List<SysOpen> listAllSysOpens() {
		String hql="from SysOpen";     
        List<SysOpen> list = this.findAllByHQL(hql);     
        return list;
	}
	
	public void update(SysOpen entity) {
		super.update(entity);
	}
}