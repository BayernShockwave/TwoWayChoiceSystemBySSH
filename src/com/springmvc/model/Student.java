package com.springmvc.model;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
@Table(name="student_ft")
public class Student {
	
	@Id
    @Column(name="Sno")
    private String sno;
    @Column(name="Spwd")
    private String spwd;
    @Column(name="Sname")
    private String sname;
    @Column(name="Scol")
    private String scol;
    @Column(name="Sdis")
    private String sdis;
    @Column(name="Scho1")
    private String scho1;
    @Column(name="Scho2")
    private String scho2;
    @Column(name="Scho3")
    private String scho3;
    @Column(name="Locked")
    private String locked;
    @Column(name="Shob")
    private String shob;
    
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScol() {
		return scol;
	}
	public void setScol(String scol) {
		this.scol = scol;
	}
	public String getSdis() {
		return sdis;
	}
	public void setSdis(String sdis) {
		this.sdis = sdis;
	}
	public String getScho1() {
		return scho1;
	}
	public void setScho1(String scho1) {
		this.scho1 = scho1;
	}
	public String getScho2() {
		return scho2;
	}
	public void setScho2(String scho2) {
		this.scho2 = scho2;
	}
	public String getScho3() {
		return scho3;
	}
	public void setScho3(String scho3) {
		this.scho3 = scho3;
	}
	public String getLocked() {
		return locked;
	}
	public void setLocked(String locked) {
		this.locked = locked;
	}
	public String getShob() {
		return shob;
	}
	public void setShob(String shob) {
		this.shob = shob;
	}
}