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
	private int vt_id;
	@Column
	private String two_wheeler;
	@Column
	private String three_wheeler;
	@Column
	private String four_wheeler;
	@Column
	private String six_wheeler;
	@Column
	private String eight_wheeler;

}
