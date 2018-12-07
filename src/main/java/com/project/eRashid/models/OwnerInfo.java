package com.project.eRashid.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.RowId;



@Entity
@Table(name="ownerinfo")

public class OwnerInfo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private int oid;
	//@OneToOne(mappedBy="ownerinfo", cascade=CascadeType.ALL , fetch=FetchType.EAGER)

	@Column
	private String oname;
	@Column
	private String fname;
	@Column
	private String gfname;
	@Column
	private Date dob;
	@Column
	private String email;
	@Column
	private int mobile_number;
	@Column
	private int p_stateno;
	@Column
	private String p_zone;
	@Column
	private String p_district;
	@Column
	private String p_vdc_mun;
	@Column
	private int p_wardno;
	@Column
	private String p_tole;
	@Column
	private int p_home_no;
	@Column
	private int p_phone_no;
	@Column
	private int t_stateno;
	@Column
	private String t_zone;
	@Column
	private String t_district;
	@Column
	private String t_vdc_mun;
	@Column
	private int t_wardno;
	@Column
	private String t_tole;
	@Column
	private int t_home_no;
	@Column
	private int t_phone_no;
	
	@OneToMany(mappedBy="owner")
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
//	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ownerinfo", targetEntity=Vehicle.class)
//	private Vehicle vehicle;
//	
//	
//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
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

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public int getP_stateno() {
		return p_stateno;
	}

	public void setP_stateno(int p_stateno) {
		this.p_stateno = p_stateno;
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

	public int getP_wardno() {
		return p_wardno;
	}

	public void setP_wardno(int p_wardno) {
		this.p_wardno = p_wardno;
	}

	public String getP_tole() {
		return p_tole;
	}

	public void setP_tole(String p_tole) {
		this.p_tole = p_tole;
	}

	public int getP_home_no() {
		return p_home_no;
	}

	public void setP_home_no(int p_home_no) {
		this.p_home_no = p_home_no;
	}

	public int getP_phone_no() {
		return p_phone_no;
	}

	public void setP_phone_no(int p_phone_no) {
		this.p_phone_no = p_phone_no;
	}

	public int getT_stateno() {
		return t_stateno;
	}

	public void setT_stateno(int t_stateno) {
		this.t_stateno = t_stateno;
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

	public int getT_wardno() {
		return t_wardno;
	}

	public void setT_wardno(int t_wardno) {
		this.t_wardno = t_wardno;
	}

	public String getT_tole() {
		return t_tole;
	}

	public void setT_tole(String t_tole) {
		this.t_tole = t_tole;
	}

	public int getT_home_no() {
		return t_home_no;
	}

	public void setT_home_no(int t_home_no) {
		this.t_home_no = t_home_no;
	}

	public int getT_phone_no() {
		return t_phone_no;
	}

	public void setT_phone_no(int t_phone_no) {
		this.t_phone_no = t_phone_no;
	}

	
	
	
	
	

}
