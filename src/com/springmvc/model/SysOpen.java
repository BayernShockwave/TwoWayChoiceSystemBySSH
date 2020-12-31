package com.springmvc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
 
@Entity
@Table(name="sysopen")
public class SysOpen {
	
	@Id
	@Column(name="tid")
	private String tid;
    @Column(name="sysbegin")
    private String sysbegin;
    @Column(name="sysend")
    private String sysend;
    
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getSysbegin() {
		return sysbegin;
	}
	public void setSysbegin(String sysbegin) {
		this.sysbegin = sysbegin;
	}
	public String getSysend() {
		return sysend;
	}
	public void setSysend(String sysend) {
		this.sysend = sysend;
	}
}