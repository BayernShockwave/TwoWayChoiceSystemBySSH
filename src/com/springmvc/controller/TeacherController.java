package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.model.*;
import com.springmvc.service.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/login/teacher")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/checkinfo")
	public String index(String teaid,ModelMap map) {
		Teacher teabyid = teacherService.queryTeacherById(teaid);
		map.put("teabyid",teabyid);
		return "teacherself";
	}
	
	@RequestMapping("/changepwd")
	public String chpwd(String teaid,ModelMap map) {
		Teacher teabyid = teacherService.queryTeacherById(teaid);
		map.put("teabyid",teabyid);
		return "tea_change_pwd";
	}
	
	@RequestMapping("/changepwd_rs")
	public String chpwdrs(String teaid,String oldpassword,String newpassword,String check_newpassword,ModelMap map) {
		Teacher teabyid = teacherService.queryTeacherById(teaid);
		if(oldpassword.equals(teabyid.getTpwd()) && newpassword.equals(check_newpassword)) {
			teabyid.setTpwd(newpassword);
			teacherService.update(teabyid);
		}
		map.put("teaid",teabyid.getTno());
		return "redirect:checkinfo"; 
	}
	
	@RequestMapping("/checkalready")
	public String checkalready(String teaid,ModelMap map) {
		Teacher teabyid = teacherService.queryTeacherById(teaid);
		map.put("teabyid",teabyid);
		return "checkalready";
	}
	
	@RequestMapping("/checkstu")
	public String checkstu(String teaid,ModelMap map) {
		Teacher teabyid = teacherService.queryTeacherById(teaid);
		map.put("teabyid",teabyid);
		map.put("teaid",teaid);
		return "checkstu";
	}
	
	@RequestMapping("/choose")
	public String choose(String teaid,String stuid) {
		Teacher t = teacherService.queryTeacherById(teaid);
		if(t.getTwan1().equals("")) {
			t.setTwan1(stuid);
		}
		else if(!t.getTwan1().equals("") && t.getTwan2().equals("")) {
			t.setTwan2(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && t.getTwan3().equals("")) {
			t.setTwan3(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && t.getTwan4().equals("")) {
			t.setTwan4(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && !t.getTwan4().equals("") && t.getTwan5().equals("")) {
			t.setTwan5(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && !t.getTwan4().equals("") && !t.getTwan5().equals("") && t.getTwan6().equals("")) {
			t.setTwan6(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && !t.getTwan4().equals("") && !t.getTwan5().equals("") && !t.getTwan6().equals("") && t.getTwan7().equals("")) {
			t.setTwan7(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && !t.getTwan4().equals("") && !t.getTwan5().equals("") && !t.getTwan6().equals("") && !t.getTwan7().equals("") && t.getTwan8().equals("")) {
			t.setTwan8(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && !t.getTwan4().equals("") && !t.getTwan5().equals("") && !t.getTwan6().equals("") && !t.getTwan7().equals("") && !t.getTwan8().equals("") && t.getTwan9().equals("")) {
			t.setTwan9(stuid);
		}
		else if(!t.getTwan1().equals("") && !t.getTwan2().equals("") && !t.getTwan3().equals("") && !t.getTwan4().equals("") && !t.getTwan5().equals("") && !t.getTwan6().equals("") && !t.getTwan7().equals("") && !t.getTwan8().equals("") && !t.getTwan9().equals("") && t.getTwan10().equals("")) {
			t.setTwan10(stuid);
		}
		teacherService.update(t);
		return "redirect:checkalready?teaid="+teaid+"";
	}
	
	@RequestMapping("/index")
	public String index_ua(ModelMap map) {
		List<Teacher> teachers = teacherService.listAllTeachers();
		map.put("list",teachers);
		return "teachers_ua";
	}
	
	@RequestMapping("/delete")
	public String deleteTeacherByID_ua(String id) {
		teacherService.delete(id);
		return "redirect:index"; 
	}
	
	@RequestMapping("/edit")
	public String editTeacherByID_ua(String id,ModelMap map) {
		Teacher t=teacherService.queryTeacherById(id);
		map.put("t",t);
		return "edittea";
	}
	
	@RequestMapping("/update")
	public String updateTeacher_ua(String tno,String tpwd,String tname,String tcol,String tdis,String tmax,String thob,ModelMap map) throws NumberFormatException {
		Teacher t = new Teacher();
		t.setLocked("on");
		t.setTno(tno);
		t.setTpwd(tpwd);
		t.setTname(tname);
		t.setTcol(tcol);
		t.setTdis(tdis);
		String oldmax = t.getTmax();
		String choose = t.getTcho();
		String left = t.getTleft();
		int m = 0;
		int o = 0;
		int c = 0;
		int l = 0;
		try {
			m = Integer.parseInt(tmax);
			c = Integer.parseInt(choose);
			o = Integer.parseInt(oldmax);
			l = Integer.parseInt(left);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		if(m >= o) {
			l = l + m - o;
			choose = String.valueOf(c);
			left = String.valueOf(l);
			t.setTmax(tmax);
			t.setTcho(choose);
			t.setTleft(left);
		}
		else if(m < o) {
			if(l > 0) {
				l = l + m - o;
				choose = String.valueOf(c);
				left=String.valueOf(l);
				t.setTmax(tmax);
				t.setTcho(choose);
				t.setTleft(left);
			}
		}
		t.setThob(thob);
		t.setLocked("off");
		teacherService.update(t);
		return "redirect:index";
	}
	
	@RequestMapping("/add")
	public String addTeacher_ua() {	
		return "addtea";
	}
	
	@RequestMapping("/save")
	public String saveTeacher_ua(String tno,String tpwd,String tname,String tcol,String tdis,String tmax,String thob,ModelMap map) {
		Teacher t = new Teacher();
		t.setTno(tno);
		t.setTpwd(tpwd);
		t.setTname(tname);
		t.setTcol(tcol);
		t.setTdis(tdis);
		t.setTmax(tmax);
		t.setTcho("0");
		t.setTleft(tmax);
		t.setLocked("off");
		t.setThob(thob);
		teacherService.save(t);
		return "redirect:index"; 
	}
	
	@RequestMapping("/index_ca")
	public String index_ca(String col,ModelMap map) {
		List<Teacher> teachers = teacherService.listTeachersByCol(col);
		map.put("col",col);
		map.put("list",teachers);
		return "teachers_ca";
	}
	
	@RequestMapping("/delete_ca")
	public String deleteTeacherByID_ca(String id) {
		teacherService.delete(id);
		return "redirect:index_ca"; 
	}
	
	@RequestMapping("/edit_ca")
	public String editTeacherByID_ca(String id,ModelMap map) {
		Teacher t=teacherService.queryTeacherById(id);
		map.put("t",t);
		return "edittea_ca";
	}
	
	@RequestMapping("/update_ca")
	public String updateTeacher_ca(String tno,String tpwd,String tname,String tcol,String tdis,String tmax,String thob,ModelMap map) throws NumberFormatException,UnsupportedEncodingException {
		Teacher t = new Teacher();
		t.setLocked("on");
		t.setTno(tno);
		t.setTpwd(tpwd);
		t.setTname(tname);
		t.setTcol(tcol);
		t.setTdis(tdis);
		String oldmax = t.getTmax();
		String choose = t.getTcho();
		String left = t.getTleft();
		int m = 0;
		int o = 0;
		int c = 0;
		int l = 0;
		try {
			m = Integer.parseInt(tmax);
			c = Integer.parseInt(choose);
			o = Integer.parseInt(oldmax);
			l = Integer.parseInt(left);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		if(m >= o) {
			l = l + m - o;
			choose = String.valueOf(c);
			left = String.valueOf(l);
			t.setTmax(tmax);
			t.setTcho(choose);
			t.setTleft(left);
		}
		else if(m < o) {
			if(l > 0) {
				l = l + m - o;
				choose = String.valueOf(c);
				left=String.valueOf(l);
				t.setTmax(tmax);
				t.setTcho(choose);
				t.setTleft(left);
			}
		}
		t.setThob(thob);
		t.setLocked("off");
		teacherService.update(t);
		return "redirect:index_ca?col="+URLEncoder.encode(tcol,"UTF-8")+"";
	}
	
	@RequestMapping("/add_ca")
	public String addTeacher_ca(String col,ModelMap map) {	
		map.put("col",col);
		return "addtea_ca";
	}
	
	@RequestMapping("/save_ca")
	public String saveTeacher_ca(String tno,String tpwd,String tname,String tcol,String tdis,String tmax,String thob,ModelMap map) throws UnsupportedEncodingException {
		Teacher t = new Teacher();
		t.setTno(tno);
		t.setTpwd(tpwd);
		t.setTname(tname);
		t.setTcol(tcol);
		t.setTdis(tdis);
		t.setTmax(tmax);
		t.setTcho("0");
		t.setTleft(tmax);
		t.setLocked("off");
		t.setThob(thob);
		teacherService.save(t);
		return "redirect:index_ca?col="+URLEncoder.encode(tcol,"UTF-8")+"";
	}
}