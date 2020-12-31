package com.springmvc.model;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
@Table(name="teacher_ft")
public class Teacher {
	
	@Id
    @Column(name="Tno")
    private String tno;
    @Column(name="Tpwd")
    private String tpwd;
    @Column(name="Tname")
    private String tname;
    @Column(name="Tcol")
    private String tcol;
    @Column(name="Tdis")
    private String tdis;
	@Column(name="Tcho1")
    private String tcho1;
    @Column(name="Tcho2")
    private String tcho2;
    @Column(name="Tcho3")
    private String tcho3;
    @Column(name="Tmax")
    private String tmax;
    @Column(name="Tcho")
    private String tcho;
    @Column(name="Tleft")
    private String tleft;
    @Column(name="Twan1")
    private String twan1;
    @Column(name="Twan2")
    private String twan2;
    @Column(name="Twan3")
    private String twan3;
    @Column(name="Tcho4")
    private String tcho4;
    @Column(name="Tcho5")
    private String tcho5;
    @Column(name="Tcho6")
    private String tcho6;
    @Column(name="Tcho7")
    private String tcho7;
    @Column(name="Tcho8")
    private String tcho8;
    @Column(name="Tcho9")
    private String tcho9;
    @Column(name="Tcho10")
    private String tcho10;
    @Column(name="Twan4")
    private String twan4;
    @Column(name="Twan5")
    private String twan5;
    @Column(name="Twan6")
    private String twan6;
    @Column(name="Twan7")
    private String twan7;
    @Column(name="Twan8")
    private String twan8;
    @Column(name="Twan9")
    private String twan9;
    @Column(name="Twan10")
    private String twan10;
    @Column(name="Locked")
    private String locked;
    @Column(name="Thob")
    private String thob;
    
    public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTpwd() {
		return tpwd;
	}
	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTcol() {
		return tcol;
	}
	public void setTcol(String tcol) {
		this.tcol = tcol;
	}
	public String getTdis() {
		return tdis;
	}
	public void setTdis(String tdis) {
		this.tdis = tdis;
	}
	public String getTcho1() {
		return tcho1;
	}
	public void setTcho1(String tcho1) {
		this.tcho1 = tcho1;
	}
	public String getTcho2() {
		return tcho2;
	}
	public void setTcho2(String tcho2) {
		this.tcho2 = tcho2;
	}
	public String getTcho3() {
		return tcho3;
	}
	public void setTcho3(String tcho3) {
		this.tcho3 = tcho3;
	}
	public String getTmax() {
		return tmax;
	}
	public void setTmax(String tmax) {
		this.tmax = tmax;
	}
	public String getTcho() {
		return tcho;
	}
	public void setTcho(String tcho) {
		this.tcho = tcho;
	}
	public String getTleft() {
		return tleft;
	}
	public void setTleft(String tleft) {
		this.tleft = tleft;
	}
	public String getTwan1() {
		return twan1;
	}
	public void setTwan1(String twan1) {
		this.twan1 = twan1;
	}
	public String getTwan2() {
		return twan2;
	}
	public void setTwan2(String twan2) {
		this.twan2 = twan2;
	}
	public String getTwan3() {
		return twan3;
	}
	public void setTwan3(String twan3) {
		this.twan3 = twan3;
	}
	public String getTcho4() {
		return tcho4;
	}
	public void setTcho4(String tcho4) {
		this.tcho4 = tcho4;
	}
	public String getTcho5() {
		return tcho5;
	}
	public void setTcho5(String tcho5) {
		this.tcho5 = tcho5;
	}
	public String getTcho6() {
		return tcho6;
	}
	public void setTcho6(String tcho6) {
		this.tcho6 = tcho6;
	}
	public String getTcho7() {
		return tcho7;
	}
	public void setTcho7(String tcho7) {
		this.tcho7 = tcho7;
	}
	public String getTcho8() {
		return tcho8;
	}
	public void setTcho8(String tcho8) {
		this.tcho8 = tcho8;
	}
	public String getTcho9() {
		return tcho9;
	}
	public void setTcho9(String tcho9) {
		this.tcho9 = tcho9;
	}
	public String getTcho10() {
		return tcho10;
	}
	public void setTcho10(String tcho10) {
		this.tcho10 = tcho10;
	}
	public String getTwan4() {
		return twan4;
	}
	public void setTwan4(String twan4) {
		this.twan4 = twan4;
	}
	public String getTwan5() {
		return twan5;
	}
	public void setTwan5(String twan5) {
		this.twan5 = twan5;
	}
	public String getTwan6() {
		return twan6;
	}
	public void setTwan6(String twan6) {
		this.twan6 = twan6;
	}
	public String getTwan7() {
		return twan7;
	}
	public void setTwan7(String twan7) {
		this.twan7 = twan7;
	}
	public String getTwan8() {
		return twan8;
	}
	public void setTwan8(String twan8) {
		this.twan8 = twan8;
	}
	public String getTwan9() {
		return twan9;
	}
	public void setTwan9(String twan9) {
		this.twan9 = twan9;
	}
	public String getTwan10() {
		return twan10;
	}
	public void setTwan10(String twan10) {
		this.twan10 = twan10;
	}
	public String getLocked() {
		return locked;
	}
	public void setLocked(String locked) {
		this.locked = locked;
	}
	public String getThob() {
		return thob;
	}
	public void setThob(String thob) {
		this.thob = thob;
	}
}