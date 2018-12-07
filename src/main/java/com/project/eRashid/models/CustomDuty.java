package com.project.eRashid.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customduty")
public class CustomDuty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int cd_id;
	@Column
	private String cd_name;
	@Column
	private String cd_address;
	@Column
	private int bill_no;
	@Column
	private Date bill_date;
	@Column
	private int pragyapan_no;
	public int getCd_id() {
		return cd_id;
	}
	public void setCd_id(int cd_id) {
		this.cd_id = cd_id;
	}
	public String getCd_name() {
		return cd_name;
	}
	public void setCd_name(String cd_name) {
		this.cd_name = cd_name;
	}
	public String getCd_address() {
		return cd_address;
	}
	public void setCd_address(String cd_address) {
		this.cd_address = cd_address;
	}
	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	public Date getBill_date() {
		return bill_date;
	}
	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}
	public int getPragyapan_no() {
		return pragyapan_no;
	}
	public void setPragyapan_no(int pragyapan_no) {
		this.pragyapan_no = pragyapan_no;
	}
	
	

}
