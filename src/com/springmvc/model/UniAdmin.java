package com.springmvc.model;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
@Table(name="uniadmin_ft")
public class UniAdmin {
	
	@Id
    @Column(name="Uno")
    private String uno;
    @Column(name="Upwd")
    private String upwd;
    @Column(name="Uname")
    private String uname;
    @Column(name="Locked")
    private String locked;
    
	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLocked() {
		return locked;
	}
	public void setLocked(String locked) {
		this.locked = locked;
	}
}