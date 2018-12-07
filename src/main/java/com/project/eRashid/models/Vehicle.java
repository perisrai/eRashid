package com.project.eRashid.models;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.RowId;


@Entity
@Table(name="vehicle")

public class Vehicle {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int vid;
	
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="oid")
	private OwnerInfo owner;
//	
//	
//	public OwnerInfo getOwnerinfo() {
//		return ownerinfo;
//	}
//	public void setOwnerinfo(OwnerInfo ownerinfo) {
//		this.ownerinfo = ownerinfo;
//	}
//	
	
	public OwnerInfo getOwner() {
		return owner;
	}
	public void setOwner(OwnerInfo owner) {
		this.owner = owner;
	}
	
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="cd_id")
	private CustomDuty customduty;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private VehicleType vehicletype;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="rfid_id")
	private Rfid rfid;
	
	
	public Rfid getRfid() {
		return rfid;
	}
	public void setRfid(Rfid rfid) {
		this.rfid = rfid;
	}
	public VehicleType getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(VehicleType vehicletype) {
		this.vehicletype = vehicletype;
	}
	@Column
	private String vno;
	@Column
	private String zone;
	@Column
	private Integer lotno;
	
	public Integer getLotno() {
		return lotno;
	}
	public void setLotno(Integer lotno) {
		this.lotno = lotno;
	}
	@Column
	private String type;
	@Column
	private Integer vnum;
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getVnum() {
		return vnum;
	}
	public void setVnum(Integer vnum) {
		this.vnum = vnum;
	}
	@Column
	private String importer_name;
	@Column
	private String importer_address;
	@Column
	private String manufacturer_name;
	@Column
	private int manufactured_year;
	@Column
	private String vmodel;
	@Column
	private int engine_no;
	@Column
	private int chesis_no;
	@Column
	private int cc;
	@Column
	private int no_of_cylinder;
	@Column
	private  String vcolor;
	@Column
	private String vtype;
	
	@Column
	private int no_of_seats;
	@Column
	private  String fuel;
	
	@Column
	private int total_weight;
	@Column
	private int weight_bearing_capacity;
	
	@Column
	private Date registered_date;
	@Column
	private  String usages;
	@Column
	private  String device_in_vehicle;
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVno() {
		return vno;
	}
	public void setVno(String vno) {
		this.vno = vno;
	}
	public String getImporter_name() {
		return importer_name;
	}
	public void setImporter_name(String importer_name) {
		this.importer_name = importer_name;
	}
	public String getImporter_address() {
		return importer_address;
	}
	public void setImporter_address(String importer_address) {
		this.importer_address = importer_address;
	}
	public String getManufacturer_name() {
		return manufacturer_name;
	}
	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}
	public int getManufactured_year() {
		return manufactured_year;
	}
	public void setManufactured_year(int manufactured_year) {
		this.manufactured_year = manufactured_year;
	}
	public String getVmodel() {
		return vmodel;
	}
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	public int getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(int engine_no) {
		this.engine_no = engine_no;
	}
	public int getChesis_no() {
		return chesis_no;
	}
	public void setChesis_no(int chesis_no) {
		this.chesis_no = chesis_no;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getNo_of_cylinder() {
		return no_of_cylinder;
	}
	public void setNo_of_cylinder(int no_of_cylinder) {
		this.no_of_cylinder = no_of_cylinder;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getTotal_weight() {
		return total_weight;
	}
	public void setTotal_weight(int total_weight) {
		this.total_weight = total_weight;
	}
	public int getWeight_bearing_capacity() {
		return weight_bearing_capacity;
	}
	public void setWeight_bearing_capacity(int weight_bearing_capacity) {
		this.weight_bearing_capacity = weight_bearing_capacity;
	}
	
	public Date getRegistered_date() {
		return registered_date;
	}
	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}
	public String getUsages() {
		return usages;
	}
	public void setUsages(String usages) {
		this.usages = usages;
	}
	public String getDevice_in_vehicle() {
		return device_in_vehicle;
	}
	public void setDevice_in_vehicle(String device_in_vehicle) {
		this.device_in_vehicle = device_in_vehicle;
	}
	public CustomDuty getCustomduty() {
		return customduty;
	}
	public void setCustomduty(CustomDuty customduty) {
		this.customduty = customduty;
	}
	
	
	
	

}
