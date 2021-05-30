package com.project.eRashid.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rfid")
public class Rfid {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rfid_id;
	@Column
	private String uniquekey;
	public int getRfid_id() {
		return rfid_id;
	}
	public void setRfid_id(int rfid_id) {
		this.rfid_id = rfid_id;
	}
	public String getUniquekey() {
		return uniquekey;
	}
	public void setUniquekey(String uniquekey) {
		this.uniquekey = uniquekey;
	}
	

}
