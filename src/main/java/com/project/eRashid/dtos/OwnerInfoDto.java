package com.project.eRashid.dtos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.project.eRashid.models.OwnerInfo;

public class OwnerInfoDto {

	private Integer oid;

	private String oname;

	private String fname;

	private String oldOwner;

	private String gfname;

	private Date dob;

	private String email;

	private Long mobileNumber;

	private Integer p_stateno;

	private String p_zone;

	private String p_district;

	private String p_vdc_mun;

	private Integer p_wardno;

	private String p_tole;

	private Integer p_home_no;

	private Long p_phone_no;

	private Integer t_stateno;

	private String t_zone;

	private String t_district;

	private String t_vdc_mun;

	private Integer t_wardno;

	private String t_tole;

	private Integer t_home_no;
	private String password;

	private Long t_phone_no;

	private List<VehicleDto> vehicles = new ArrayList<VehicleDto>();

	public List<VehicleDto> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<VehicleDto> vehicles) {
		this.vehicles = vehicles;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGfname() {
		return gfname;
	}

	public void setGfname(String gfname) {
		this.gfname = gfname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getP_phone_no() {
		return p_phone_no;
	}

	public void setP_phone_no(Long p_phone_no) {
		this.p_phone_no = p_phone_no;
	}

	public Long getT_phone_no() {
		return t_phone_no;
	}

	public void setT_phone_no(Long t_phone_no) {
		this.t_phone_no = t_phone_no;
	}

	public String getP_zone() {
		return p_zone;
	}

	public void setP_zone(String p_zone) {
		this.p_zone = p_zone;
	}

	public String getP_district() {
		return p_district;
	}

	public void setP_district(String p_district) {
		this.p_district = p_district;
	}

	public String getP_vdc_mun() {
		return p_vdc_mun;
	}

	public void setP_vdc_mun(String p_vdc_mun) {
		this.p_vdc_mun = p_vdc_mun;
	}

	public String getP_tole() {
		return p_tole;
	}

	public void setP_tole(String p_tole) {
		this.p_tole = p_tole;
	}

	public String getT_zone() {
		return t_zone;
	}

	public void setT_zone(String t_zone) {
		this.t_zone = t_zone;
	}

	public String getT_district() {
		return t_district;
	}

	public void setT_district(String t_district) {
		this.t_district = t_district;
	}

	public String getT_vdc_mun() {
		return t_vdc_mun;
	}

	public void setT_vdc_mun(String t_vdc_mun) {
		this.t_vdc_mun = t_vdc_mun;
	}

	public String getT_tole() {
		return t_tole;
	}

	public void setT_tole(String t_tole) {
		this.t_tole = t_tole;
	}

	public Integer getP_stateno() {
		return p_stateno;
	}

	public void setP_stateno(Integer p_stateno) {
		this.p_stateno = p_stateno;
	}

	public Integer getP_wardno() {
		return p_wardno;
	}

	public void setP_wardno(Integer p_wardno) {
		this.p_wardno = p_wardno;
	}

	public Integer getP_home_no() {
		return p_home_no;
	}

	public void setP_home_no(Integer p_home_no) {
		this.p_home_no = p_home_no;
	}

	

	public Integer getT_stateno() {
		return t_stateno;
	}

	public void setT_stateno(Integer t_stateno) {
		this.t_stateno = t_stateno;
	}

	public Integer getT_wardno() {
		return t_wardno;
	}

	public void setT_wardno(Integer t_wardno) {
		this.t_wardno = t_wardno;
	}

	public Integer getT_home_no() {
		return t_home_no;
	}

	public void setT_home_no(Integer t_home_no) {
		this.t_home_no = t_home_no;
	}

	

	public String getOldOwner() {
		return oldOwner;
	}

	public void setOldOwner(String oldOwner) {
		this.oldOwner = oldOwner;
	}

	public OwnerInfo getOwner() {
		OwnerInfo owner = new OwnerInfo();
		owner.setOid(oid);
		owner.setOname(oname);
		owner.setDob(dob);
		owner.setFname(fname);
		owner.setGfname(gfname);
		owner.setMobileNumber(mobileNumber);
		owner.setEmail(email);
		owner.setP_district(p_district);
		owner.setP_home_no(p_home_no);
		owner.setP_phone_no(p_phone_no);
		owner.setP_stateno(p_stateno);
		owner.setP_tole(p_tole);
		owner.setP_wardno(p_wardno);
		owner.setP_vdc_mun(p_vdc_mun);
		owner.setT_district(t_district);
		owner.setT_home_no(t_home_no);
		owner.setT_phone_no(t_phone_no);
		owner.setT_stateno(t_stateno);
		owner.setT_tole(t_tole);
		owner.setT_vdc_mun(t_vdc_mun);
		owner.setT_wardno(t_wardno);
		owner.setPassword(password);
		// owner.set(
		// expect vehicle
		return owner;

	}

	@Override
	public String toString() {
		return "OwnerInfoDto [oid=" + oid + ", oname=" + oname + ", fname=" + fname + ", oldOwner=" + oldOwner
				+ ", gfname=" + gfname + ", dob=" + dob + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", p_stateno=" + p_stateno + ", p_zone=" + p_zone + ", p_district=" + p_district + ", p_vdc_mun="
				+ p_vdc_mun + ", p_wardno=" + p_wardno + ", p_tole=" + p_tole + ", p_home_no=" + p_home_no
				+ ", p_phone_no=" + p_phone_no + ", t_stateno=" + t_stateno + ", t_zone=" + t_zone + ", t_district="
				+ t_district + ", t_vdc_mun=" + t_vdc_mun + ", t_wardno=" + t_wardno + ", t_tole=" + t_tole
				+ ", t_home_no=" + t_home_no + ", password=" + password + ", t_phone_no=" + t_phone_no + ", vehicles="
				+ vehicles + ", getVehicles()=" + getVehicles() + ", getOid()=" + getOid() + ", getPassword()="
				+ getPassword() + ", getOname()=" + getOname() + ", getFname()=" + getFname() + ", getGfname()="
				+ getGfname() + ", getDob()=" + getDob() + ", getEmail()=" + getEmail() + ", getMobileNumber()="
				+ getMobileNumber() + ", getP_phone_no()=" + getP_phone_no() + ", getT_phone_no()=" + getT_phone_no()
				+ ", getP_zone()=" + getP_zone() + ", getP_district()=" + getP_district() + ", getP_vdc_mun()="
				+ getP_vdc_mun() + ", getP_tole()=" + getP_tole() + ", getT_zone()=" + getT_zone()
				+ ", getT_district()=" + getT_district() + ", getT_vdc_mun()=" + getT_vdc_mun() + ", getT_tole()="
				+ getT_tole() + ", getP_stateno()=" + getP_stateno() + ", getP_wardno()=" + getP_wardno()
				+ ", getP_home_no()=" + getP_home_no() + ", getT_stateno()=" + getT_stateno() + ", getT_wardno()="
				+ getT_wardno() + ", getT_home_no()=" + getT_home_no() + ", getOldOwner()=" + getOldOwner()
				+ ", getOwner()=" + getOwner() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	

}
