package com.springmvc.model;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
@Table(name="coladmin_ft")
public class ColAdmin implements Serializable {
	
	@Id
    @Column(name="Cno")
    private String cno;
    @Column(name="Cpwd")
    private String cpwd;
    @Column(name="Cname")
    private String cname;
    @Column(name="Ccol")
    private String ccol;
    @Column(name="Locked")
    private String locked;
    
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcol() {
		return ccol;
	}
	public void setCcol(String ccol) {
		this.ccol = ccol;
	}
	public String getLocked() {
		return locked;
	}
	public void setLocked(String locked) {
		this.locked = locked;
	}
}