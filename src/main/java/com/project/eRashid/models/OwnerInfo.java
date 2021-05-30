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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.eRashid.dtos.OwnerInfoDto;

@Entity
@Table(name = "ownerinfo")
public class OwnerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer oid;

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
	private Long mobileNumber;
	@Column
	private Integer p_stateno;
	@Column
	private String p_zone;
	@Column
	private String p_district;
	@Column
	private String p_vdc_mun;
	@Column
	private Integer p_wardno;
	@Column
	private String p_tole;
	@Column
	private Integer p_home_no;
	@Column
	private Long p_phone_no;
	@Column
	private Integer t_stateno;
	@Column
	private String t_zone;
	@Column
	private String t_district;
	@Column
	private String t_vdc_mun;
	@Column
	private Integer t_wardno;
	@Column
	private String t_tole;
	@Column
	private Integer t_home_no;
	@Column
	private Long t_phone_no;

	@Column
	private String password;

	@JsonIgnore
	@OneToMany(mappedBy = "owner")
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the oid
	 */
	public Integer getOid() {
		return oid;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setOid(Integer oid) {
		this.oid = oid;
	}

	/**
	 * @return the oname
	 */
	public String getOname() {
		return oname;
	}

	/**
	 * @param oname the oname to set
	 */
	public void setOname(String oname) {
		this.oname = oname;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the gfname
	 */
	public String getGfname() {
		return gfname;
	}

	/**
	 * @param gfname the gfname to set
	 */
	public void setGfname(String gfname) {
		this.gfname = gfname;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobileNumber
	 */

	/**
	 * @return the p_stateno
	 */
	public Integer getP_stateno() {
		return p_stateno;
	}

	

	public void setP_stateno(Integer p_stateno) {
		this.p_stateno = p_stateno;
	}

	public void setP_wardno(Integer p_wardno) {
		this.p_wardno = p_wardno;
	}

	public void setP_home_no(Integer p_home_no) {
		this.p_home_no = p_home_no;
	}

	

	public void setT_stateno(Integer t_stateno) {
		this.t_stateno = t_stateno;
	}

	public void setT_wardno(Integer t_wardno) {
		this.t_wardno = t_wardno;
	}

	public void setT_home_no(Integer t_home_no) {
		this.t_home_no = t_home_no;
	}

	

	/**
	 * @param p_stateno the p_stateno to set
	 */
	public void setP_stateno(int p_stateno) {
		this.p_stateno = p_stateno;
	}

	/**
	 * @return the p_zone
	 */
	public String getP_zone() {
		return p_zone;
	}

	/**
	 * @param p_zone the p_zone to set
	 */
	public void setP_zone(String p_zone) {
		this.p_zone = p_zone;
	}

	/**
	 * @return the p_district
	 */
	public String getP_district() {
		return p_district;
	}

	/**
	 * @param p_district the p_district to set
	 */
	public void setP_district(String p_district) {
		this.p_district = p_district;
	}

	/**
	 * @return the p_vdc_mun
	 */
	public String getP_vdc_mun() {
		return p_vdc_mun;
	}

	/**
	 * @param p_vdc_mun the p_vdc_mun to set
	 */
	public void setP_vdc_mun(String p_vdc_mun) {
		this.p_vdc_mun = p_vdc_mun;
	}

	/**
	 * @return the p_wardno
	 */
	public Integer getP_wardno() {
		return p_wardno;
	}

	/**
	 * @param p_wardno the p_wardno to set
	 */
	public void setP_wardno(int p_wardno) {
		this.p_wardno = p_wardno;
	}

	/**
	 * @return the p_tole
	 */
	public String getP_tole() {
		return p_tole;
	}

	/**
	 * @param p_tole the p_tole to set
	 */
	public void setP_tole(String p_tole) {
		this.p_tole = p_tole;
	}

	/**
	 * @return the p_home_no
	 */
	public Integer getP_home_no() {
		return p_home_no;
	}

	/**
	 * @param p_home_no the p_home_no to set
	 */
	public void setP_home_no(int p_home_no) {
		this.p_home_no = p_home_no;
	}

	
	public Long getP_phone_no() {
		return p_phone_no;
	}

	public Integer getT_stateno() {
		return t_stateno;
	}

	/**
	 * @param t_stateno the t_stateno to set
	 */
	public void setT_stateno(int t_stateno) {
		this.t_stateno = t_stateno;
	}

	/**
	 * @return the t_zone
	 */
	public String getT_zone() {
		return t_zone;
	}

	/**
	 * @param t_zone the t_zone to set
	 */
	public void setT_zone(String t_zone) {
		this.t_zone = t_zone;
	}

	/**
	 * @return the t_district
	 */
	public String getT_district() {
		return t_district;
	}

	/**
	 * @param t_district the t_district to set
	 */
	public void setT_district(String t_district) {
		this.t_district = t_district;
	}

	/**
	 * @return the t_vdc_mun
	 */
	public String getT_vdc_mun() {
		return t_vdc_mun;
	}

	/**
	 * @param t_vdc_mun the t_vdc_mun to set
	 */
	public void setT_vdc_mun(String t_vdc_mun) {
		this.t_vdc_mun = t_vdc_mun;
	}

	/**
	 * @return the t_wardno
	 */
	public Integer getT_wardno() {
		return t_wardno;
	}

	/**
	 * @param t_wardno the t_wardno to set
	 */
	public void setT_wardno(int t_wardno) {
		this.t_wardno = t_wardno;
	}

	/**
	 * @return the t_tole
	 */
	public String getT_tole() {
		return t_tole;
	}

	/**
	 * @param t_tole the t_tole to set
	 */
	public void setT_tole(String t_tole) {
		this.t_tole = t_tole;
	}

	/**
	 * @return the t_home_no
	 */
	public Integer getT_home_no() {
		return t_home_no;
	}

	/**
	 * @param t_home_no the t_home_no to set
	 */
	public void setT_home_no(int t_home_no) {
		this.t_home_no = t_home_no;
	}

	
	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getT_phone_no() {
		return t_phone_no;
	}

	public void setT_phone_no(Long t_phone_no) {
		this.t_phone_no = t_phone_no;
	}

	public void setP_phone_no(Long p_phone_no) {
		this.p_phone_no = p_phone_no;
	}

	/**
	 * @return the vehicles
	 */
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	@Override
	public String toString() {
		return "OwnerInfo [oid=" + oid + ", oname=" + oname + ", fname=" + fname
				+ ", gfname=" + gfname + ", dob=" + dob + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", p_stateno=" + p_stateno
				+ ", p_zone=" + p_zone + ", p_district=" + p_district + ", p_vdc_mun="
				+ p_vdc_mun + ", p_wardno=" + p_wardno + ", p_tole=" + p_tole
				+ ", p_home_no=" + p_home_no + ", p_phone_no=" + p_phone_no
				+ ", t_stateno=" + t_stateno + ", t_zone=" + t_zone + ", t_district="
				+ t_district + ", t_vdc_mun=" + t_vdc_mun + ", t_wardno=" + t_wardno
				+ ", t_tole=" + t_tole + ", t_home_no=" + t_home_no + ", t_phone_no="
				+ t_phone_no + ", password=" + password + ", vehicles=" + vehicles
				+ ", getPassword()=" + getPassword() + ", getOid()=" + getOid()
				+ ", getOname()=" + getOname() + ", getFname()=" + getFname()
				+ ", getGfname()=" + getGfname() + ", getDob()=" + getDob()
				+ ", getEmail()=" + getEmail() + ", getP_stateno()=" + getP_stateno()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getP_zone()="
				+ getP_zone() + ", getP_district()=" + getP_district()
				+ ", getP_vdc_mun()=" + getP_vdc_mun() + ", getP_wardno()="
				+ getP_wardno() + ", getP_tole()=" + getP_tole() + ", getP_home_no()="
				+ getP_home_no() + ", getP_phone_no()=" + getP_phone_no()
				+ ", getT_stateno()=" + getT_stateno() + ", getT_zone()=" + getT_zone()
				+ ", getT_district()=" + getT_district() + ", getT_vdc_mun()="
				+ getT_vdc_mun() + ", getT_wardno()=" + getT_wardno() + ", getT_tole()="
				+ getT_tole() + ", getT_home_no()=" + getT_home_no()
				+ ", getT_phone_no()=" + getT_phone_no() + ", getVehicles()="
				+ getVehicles() + ", getOwner()=" + getOwner() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * @param vehicles the vehicles to set
	 */
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public OwnerInfoDto getOwner() {
		OwnerInfoDto owner = new OwnerInfoDto();
		owner.setOname(oname);
		owner.setGfname(gfname);
		owner.setFname(fname);
		owner.setDob(dob);
		owner.setEmail(email);
		owner.setMobileNumber(mobileNumber);
		owner.setP_stateno(p_stateno);
		owner.setP_zone(p_zone);
		owner.setP_district(p_district);
		owner.setP_vdc_mun(p_vdc_mun);
		owner.setP_wardno(p_wardno);
		owner.setP_tole(p_tole);
		owner.setP_home_no(p_home_no);
		owner.setP_phone_no(p_phone_no);
		owner.setT_stateno(t_stateno);
		owner.setT_zone(t_zone);
		owner.setT_district(t_district);
		owner.setT_vdc_mun(t_vdc_mun);
		owner.setT_wardno(t_wardno);
		owner.setT_tole(t_tole);
		owner.setT_home_no(t_home_no);
		owner.setT_phone_no(t_phone_no);
		owner.setPassword(password);
		return owner;
	}

}
