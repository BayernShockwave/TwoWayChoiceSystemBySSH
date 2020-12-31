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
@RequestMapping("/login/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/checkinfo")
	public String index(String stuid,ModelMap map) {
		Student stubyid = studentService.queryStudentById(stuid);
		map.put("stubyid",stubyid);
		return "studentself";
	}
	
	@RequestMapping("/changepwd")
	public String chpwd(String stuid,ModelMap map) {
		Student stubyid = studentService.queryStudentById(stuid);
		map.put("stubyid",stubyid);
		return "stu_change_pwd";
	}
	
	@RequestMapping("/changepwd_rs")
	public String chpwdrs(String stuid,String oldpassword,String newpassword,String check_newpassword,ModelMap map) {
		Student stubyid = studentService.queryStudentById(stuid);
		if(oldpassword.equals(stubyid.getSpwd()) && newpassword.equals(check_newpassword)) {
			stubyid.setSpwd(newpassword);
			studentService.update(stubyid);
		}
		map.put("stuid",stubyid.getSno());
		return "redirect:checkinfo"; 
	}
	
	@RequestMapping("/checktea")
	public String checktea(String stuid,String col,ModelMap map) {
		Student stubyid = studentService.queryStudentById(stuid);
		col = stubyid.getScol();
		List<Teacher> teachers = teacherService.listTeachersByCol(col);
		map.put("list",teachers);
		map.put("stuid",stuid);
		return "checktea";
	}
	
	@RequestMapping("/choose")
	public String choosetea(String stuid,String teaid) {
		Teacher t = teacherService.queryTeacherById(teaid);
		String cho = t.getTcho();
		String left = t.getTleft();
		int c = Integer.parseInt(cho)+1;
		int l = Integer.parseInt(left)-1;
//		System.out.println(c);
//		System.out.println(l);
		String newcho = String.valueOf(c);
		String newleft = String.valueOf(l);
		t.setTcho(newcho);
		t.setTleft(newleft);
		teacherService.update(t);
		Student s = studentService.queryStudentById(stuid);
		if(s.getScho1().equals("")) {
			s.setScho1(teaid);
		}
		else if(!s.getScho1().equals("") && s.getScho2().equals("")) {
			s.setScho2(teaid);
		}
		else if(!s.getScho1().equals("") && !s.getScho2().equals("") && s.getScho3().equals("")) {
			s.setScho3(teaid);
		}
		studentService.update(s);
		if(t.getTcho1().equals("")) {
			t.setTcho1(stuid);
		}
		else if(!t.getTcho1().equals("") && t.getTcho2().equals("")) {
			t.setTcho2(stuid);
		}
		else if(!t.getTcho1().equals("") && !t.getTcho2().equals("") && t.getTcho3().equals("")) {
			t.setTcho3(stuid);
		}
		teacherService.update(t);
		return "redirect:checktea?stuid="+stuid+"";
	}
	
	@RequestMapping("/smartmatch")
	public String smtea(String stuid,String hob,ModelMap map) {
		Student stubyid = studentService.queryStudentById(stuid);
		hob = stubyid.getShob();
		List<Teacher> teachers = teacherService.listTeachersByHob(hob);
		map.put("list",teachers);
		map.put("stuid",stuid);
		return "smartmatch";
	}
	
	@RequestMapping("/checkwish")
	public String cw(String stuid,ModelMap map) {
		Student stubyid = studentService.queryStudentById(stuid);
		map.put("stu",stubyid);
		return "checkwish";
	}
	
	@RequestMapping("/editwish1")
	public String ew1(String stuid,String teaid,ModelMap map) {
		Student s = studentService.queryStudentById(stuid);
		Teacher t = teacherService.queryTeacherById(teaid);
		s.setScho1("");
		studentService.update(s);
		String cho = t.getTcho();
		String left = t.getTleft();
		int c = Integer.parseInt(cho)-1;
		int l = Integer.parseInt(left)+1;
		String newcho = String.valueOf(c);
		String newleft = String.valueOf(l);
		t.setTcho(newcho);
		t.setTleft(newleft);
		String tcho1 = t.getTcho1();
		String tcho2 = t.getTcho2();
		String tcho3 = t.getTcho3();
		if(tcho1.equals(stuid)) {
			t.setTcho1("");
		}
		else if(tcho2.equals(stuid)) {
			t.setTcho2("");
		}
		else if(tcho3.equals(stuid)) {
			t.setTcho3("");
		}
		teacherService.update(t);
		return "redirect:checktea?stuid="+stuid+"";
	}
	
	@RequestMapping("/editwish2")
	public String ew2(String stuid,String teaid,ModelMap map) {
		Student s = studentService.queryStudentById(stuid);
		Teacher t = teacherService.queryTeacherById(teaid);
		s.setScho2("");
		studentService.update(s);
		String cho = t.getTcho();
		String left = t.getTleft();
		int c = Integer.parseInt(cho)-1;
		int l = Integer.parseInt(left)+1;
		String newcho = String.valueOf(c);
		String newleft = String.valueOf(l);
		t.setTcho(newcho);
		t.setTleft(newleft);
		String tcho1 = t.getTcho1();
		String tcho2 = t.getTcho2();
		String tcho3 = t.getTcho3();
		if(tcho1.equals(stuid)) {
			t.setTcho1("");
		}
		else if(tcho2.equals(stuid)) {
			t.setTcho2("");
		}
		else if(tcho3.equals(stuid)) {
			t.setTcho3("");
		}
		teacherService.update(t);
		return "redirect:checktea?stuid="+stuid+"";
	}
	
	@RequestMapping("/editwish3")
	public String ew3(String stuid,String teaid,ModelMap map) throws NumberFormatException {
		Student s = studentService.queryStudentById(stuid);
		Teacher t = teacherService.queryTeacherById(teaid);
		s.setScho3("");
		studentService.update(s);
		String cho = t.getTcho();
		String left = t.getTleft();
		int c = Integer.parseInt(cho)-1;
		int l = Integer.parseInt(left)+1;
		String newcho = String.valueOf(c);
		String newleft = String.valueOf(l);
		t.setTcho(newcho);
		t.setTleft(newleft);
		String tcho1 = t.getTcho1();
		String tcho2 = t.getTcho2();
		String tcho3 = t.getTcho3();
		if(tcho1.equals(stuid)) {
			t.setTcho1("");
		}
		else if(tcho2.equals(stuid)) {
			t.setTcho2("");
		}
		else if(tcho3.equals(stuid)) {
			t.setTcho3("");
		}
		teacherService.update(t);
		return "redirect:checktea?stuid="+stuid+"";
	}
	
	@RequestMapping("/index")
	public String index_ua(ModelMap map) {
		List<Student> students = studentService.listAllStudents();
		map.put("list",students);
		return "students_ua";
	}
	
	@RequestMapping("/index_ca")
	public String index_ca(String col,ModelMap map) {
		List<Student> students = studentService.listStudentsByCol(col);
		map.put("col",col);
		map.put("list",students);
		return "students_ca";
	}
	
	@RequestMapping("/delete")
	public String deleteStudentByID_ua(String id) {
		studentService.delete(id);
		return "redirect:index"; 
	}
	
	@RequestMapping("/delete_ca")
	public String deleteStudentByID_ca(String id) {
		studentService.delete(id);
		return "redirect:index_ca"; 
	}
	
	@RequestMapping("/edit")
	public String editStudentByID_ua(String id,ModelMap map) {
		Student s=studentService.queryStudentById(id);
		map.put("s",s);
		return "editstu";
	}
	
	@RequestMapping("/edit_ca")
	public String editStudentByID_ca(String id,ModelMap map) {
		Student s=studentService.queryStudentById(id);
		map.put("s",s);
		return "editstu_ca";
	}
	
	@RequestMapping("/add")
	public String addStudent_ua() {	
		return "addstu";
	}
	
	@RequestMapping("/add_ca")
	public String addStudent_ca(String col,ModelMap map) {	
		map.put("col",col);
		return "addstu_ca";
	}
	
	@RequestMapping("/save")
	public String saveStudent_ua(String sno,String spwd,String sname,String scol,String sdis,String shob,ModelMap map) {
		Student s = new Student();
		s.setSno(sno);
		s.setSpwd(spwd);
		s.setSname(sname);
		s.setScol(scol);
		s.setSdis(sdis);
		s.setLocked("off");
		s.setShob(shob);
		studentService.save(s);
		return "redirect:index"; 
	}
	
	@RequestMapping("/save_ca")
	public String saveStudent_ca(String sno,String spwd,String sname,String scol,String sdis,String shob,ModelMap map) throws UnsupportedEncodingException {
		Student s = new Student();
		s.setSno(sno);
		s.setSpwd(spwd);
		s.setSname(sname);
		s.setScol(scol);
		s.setSdis(sdis);
		s.setLocked("off");
		s.setShob(shob);
		studentService.save(s);
		return "redirect:index_ca?col="+URLEncoder.encode(scol,"UTF-8")+"";//解决重定向时URL中的中文乱码问题
	}
	
	@RequestMapping("/update")
	public String updateStudent_ua(String sno,String spwd,String sname,String scol,String sdis,String shob,ModelMap map) {
		Student s = new Student();
		s.setLocked("on");
		s.setSno(sno);
		s.setSpwd(spwd);
		s.setSname(sname);
		s.setScol(scol);
		s.setSdis(sdis);
		s.setShob(shob);
		s.setLocked("off");
		studentService.update(s);
		return "redirect:index";
	}
	
	@RequestMapping("/update_ca")
	public String updateStudent_ca(String sno,String spwd,String sname,String scol,String sdis,String shob,ModelMap map) throws UnsupportedEncodingException {
		Student s = new Student();
		s.setLocked("on");
		s.setSno(sno);
		s.setSpwd(spwd);
		s.setSname(sname);
		s.setScol(scol);
		s.setSdis(sdis);
		s.setShob(shob);
		s.setLocked("off");
		studentService.update(s);
		return "redirect:index_ca?col="+URLEncoder.encode(scol,"UTF-8")+"";//解决重定向时URL中的中文乱码问题
	}
}