package com.project.eRashid.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicletype")
public class VehicleType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vtId;
	@Column
	private String twoWheeler;
	
	@Column
	private String fourWheeler;


	public int getVtId() {
		return vtId;
	}

	public void setVtId(int vtId) {
		this.vtId = vtId;
	}

	public String getTwoWheeler() {
		return twoWheeler;
	}

	public void setTwoWheeler(String twoWheeler) {
		this.twoWheeler = twoWheeler;
	}

	public String getFourWheeler() {
		return fourWheeler;
	}

	public void setFourWheeler(String fourWheeler) {
		this.fourWheeler = fourWheeler;
	}
	

}
