package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.model.*;
import com.springmvc.service.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/login/uniadmin")
public class UniAdminController {
	
	@Autowired
	UniAdminService uniAdminService;
	
	@RequestMapping("/time")
	public String getTime(ModelMap map) {
		List<SysOpen> sysOpens = uniAdminService.listAllSysOpens();
		map.put("list",sysOpens);
		return "sysOpens";
	}
	
	@RequestMapping("/edittime")
	public String editTime(String tid,ModelMap map) {
		List<SysOpen> sysOpens = uniAdminService.listAllSysOpens();
		map.put("tid",tid);
		map.put("list",sysOpens);
		return "editTimes";
	}
	
	@RequestMapping("/updatetime")
	public String updateTime(String tid,String year,String month,String day,String hour,String minute,String second,String year2,String month2,String day2,String hour2,String minute2,String second2,ModelMap map) {
		SysOpen s = new SysOpen();
		String begin=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
		String end=year2+"-"+month2+"-"+day2+" "+hour2+":"+minute2+":"+second2;
		System.out.println(tid);
		System.out.println(begin);
		System.out.println(end);
		s.setTid(tid);
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date sysbegin=null;
//		Date sysend=null;
//		try {
//			sysbegin=sdf.parse(begin);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			sysend=sdf.parse(end);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		s.setSysbegin(sdf.format(sysbegin));
//		s.setSysend(sdf.format(sysend));
		s.setSysbegin(begin);
		s.setSysend(end);
		uniAdminService.update(s);
		return "redirect:time"; 
	}
}