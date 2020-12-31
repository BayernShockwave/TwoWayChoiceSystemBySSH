package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.model.*;
import com.springmvc.service.ValidationService;
import java.util.List;

@Controller
@RequestMapping("/login")
public class ValidationController {
	
	@Autowired
	ValidationService validationService;
	
	@RequestMapping("/rs")
	public String validateUser(String userid,String password,String identity,ModelMap map) {
		List<Student> students = validationService.listAllStudents();
		List<Teacher> teachers = validationService.listAllTeachers();
		List<ColAdmin> colAdmins = validationService.listAllColAdmins();
		List<UniAdmin> uniAdmins = validationService.listAllUniAdmins();
		if(identity.equals("stu")) {
			for(Student stu : students) {
				if(stu.getSno().equals(userid) && stu.getSpwd().equals(password)) {
					map.put("stuid",stu.getSno());
					return "stu_frm";
				}
			}
		}
		else if(identity.equals("tea")) {
			for(Teacher tea : teachers) {
				if(tea.getTno().equals(userid) && tea.getTpwd().equals(password)) {
					map.put("teaid",tea.getTno());
					return "tea_frm";
				}
			}
		}
		else if(identity.equals("ca")) {
			for(ColAdmin ca : colAdmins) {
				if(ca.getCno().equals(userid) && ca.getCpwd().equals(password)) {
					map.put("ccol",ca.getCcol());
					return "ca_frm";
				}
			}
		}
		else if(identity.equals("ua")) {
			for(UniAdmin ua : uniAdmins) {
				if(ua.getUno().equals(userid) && ua.getUpwd().equals(password)) {
					return "ua_frm";
				}
			}
		}
		else {
			return "http://localhost:8080/TWCS/login.jsp";
		}
		return null;
	}
}