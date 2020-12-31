package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.model.*;
import com.springmvc.service.*;
import java.util.List;

@Controller
@RequestMapping("/login/coladmin")
public class ColAdminController {
	
	@Autowired
	ColAdminService colAdminService;
	
	@RequestMapping("/index")
	public String index(ModelMap map) {
		List<ColAdmin> colAdmins = colAdminService.listAllColAdmins();
		map.put("list",colAdmins);
		return "colAdmins";
	}
	
	@RequestMapping("/delete")
	public String deleteColAdminByID(String id) {
		colAdminService.delete(id);
		return "redirect:index"; 
	}
	
	@RequestMapping("/edit")
	public String editColAdminByID(String id,ModelMap map) {
		ColAdmin c=colAdminService.queryColAdminById(id);
		map.put("ca",c);
		return "edit";
	}
	
	@RequestMapping("/add")
	public String addColAdmin() {	
		return "add";
	}
	
	@RequestMapping("/save")
	public String saveColAdmin(String cno,String cpwd,String cname,String ccol,ModelMap map) {
		ColAdmin c = new ColAdmin();
		c.setCno(cno);
		c.setCpwd(cpwd);
		c.setCname(cname);
		c.setCcol(ccol);
		colAdminService.save(c);
		return "redirect:index"; 
	}
	
	@RequestMapping("/update")
	public String updateColAdmin(String cno,String cpwd,String cname,String ccol,ModelMap map) {
		ColAdmin c = new ColAdmin();
		c.setCno(cno);
		c.setCpwd(cpwd);
		c.setCname(cname);
		c.setCcol(ccol);
		colAdminService.update(c);
		return "redirect:index"; 
	}
}