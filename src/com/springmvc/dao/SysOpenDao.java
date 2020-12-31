package com.springmvc.dao;

import java.util.List;

import com.springmvc.dao.base.BaseDao;
import com.springmvc.model.SysOpen;

public interface SysOpenDao {
	
	public List<SysOpen> listAllSysOpens();
	public void update(SysOpen model);
}