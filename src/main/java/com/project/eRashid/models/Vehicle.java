package com.project.eRashid.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.eRashid.dtos.VehicleDto;

@Entity
@Table(name = "vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int vid;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "oid")
	private OwnerInfo owner;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cd_id")
	@JsonIgnore
	private CustomDuty customduty;

	@JsonIgnore
	@OneToMany(mappedBy = "vehicle", fetch = FetchType.EAGER)
	private List<VehicleTax> vehicleTaxes;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinColumn(name = "vtId")
	private VehicleType vehicletype;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "rfid_id")
	private Rfid rfid;

	@JsonIgnore
	@OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
	private List<OwnershipTransfer> ownershipTransfer;

	@Column
	private String vno;
	@Column
	private String zone;
	@Column
	private Integer lotno;

	@Column
	private String type;
	@Column
	private Integer vnum;

	@Column
	private String importerName;
	@Column
	private String importerAddress;
	@Column
	private String manufacturerName;
	@Column
	private Integer manufacturedYear;
	@Column
	private String vmodel;
	@Column
	private Integer engineNo;
	@Column
	private Integer chesisNo;
	@Column
	private Integer cc;
	@Column
	private Integer noOfCylinders;
	@Column
	private String vcolor;
	@Column
	private String vtype;

	@Column
	private Integer noOfSeats;

	@Column
	private String fuel;

	@Column
	private Integer totalWeight;
	@Column
	private Integer weightBearingCapacity;

	@Column
	private Date registeredDate;
	@Column
	private String usages;
	@Column
	private String deviceInVehicle;

	/**
	 * @return the vehicleTaxes
	 */
	public List<VehicleTax> getVehicleTaxes() {
		return vehicleTaxes;
	}

	/**
	 * @param vehicleTaxes
	 *            the vehicleTaxes to set
	 */
	public void setVehicleTaxes(List<VehicleTax> vehicleTaxes) {
		this.vehicleTaxes = vehicleTaxes;
	}

	/**
	 * @return the vid
	 */
	public int getVid() {
		return vid;
	}

	/**
	 * @param vid
	 *            the vid to set
	 */
	public void setVid(int vid) {
		this.vid = vid;
	}

	/**
	 * @return the owner
	 */
	public OwnerInfo getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(OwnerInfo owner) {
		this.owner = owner;
	}

	public CustomDuty getCustomduty() {
		return customduty;
	}

	public void setCustomduty(CustomDuty customduty) {
		this.customduty = customduty;
	}

	/**
	 * @return the rfid
	 */
	public Rfid getRfid() {
		return rfid;
	}

	/**
	 * @return the vehicleType
	 */

	public VehicleType getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(VehicleType vehicletype) {
		this.vehicletype = vehicletype;
	}

	public List<OwnershipTransfer> getOwnershipTransfer() {
		return ownershipTransfer;
	}

	public void setOwnershipTransfer(List<OwnershipTransfer> ownershipTransfer) {
		this.ownershipTransfer = ownershipTransfer;
	}

	/**
	 * @param rfid
	 *            the rfid to set
	 */
	public void setRfid(Rfid rfid) {
		this.rfid = rfid;
	}

	/**
	 * @return the vno
	 */
	public String getVno() {
		return vno;
	}

	/**
	 * @param vno
	 *            the vno to set
	 */
	public void setVno(String vno) {
		this.vno = vno;
	}

	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * @param zone
	 *            the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}

	/**
	 * @return the lotno
	 */
	public Integer getLotno() {
		return lotno;
	}

	/**
	 * @param lotno
	 *            the lotno to set
	 */
	public void setLotno(Integer lotno) {
		this.lotno = lotno;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the vnum
	 */
	public Integer getVnum() {
		return vnum;
	}

	/**
	 * @param vnum
	 *            the vnum to set
	 */
	public void setVnum(Integer vnum) {
		this.vnum = vnum;
	}

	/**
	 * @return the importerName
	 */
	public String getImporterName() {
		return importerName;
	}

	/**
	 * @param importerName
	 *            the importerName to set
	 */
	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	/**
	 * @return the importerAddress
	 */
	public String getImporterAddress() {
		return importerAddress;
	}

	/**
	 * @param importerAddress
	 *            the importerAddress to set
	 */
	public void setImporterAddress(String importerAddress) {
		this.importerAddress = importerAddress;
	}

	/**
	 * @return the manufacturerName
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * @param manufacturerName
	 *            the manufacturerName to set
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * @return the manufacturedYear
	 */

	public String getVmodel() {
		return vmodel;
	}

	/**
	 * @param vmodel
	 *            the vmodel to set
	 */
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	/**
	 * @return the vcolor
	 */
	public String getVcolor() {
		return vcolor;
	}

	/**
	 * @param vcolor
	 *            the vcolor to set
	 */
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}

	/**
	 * @return the vtype
	 */
	public String getVtype() {
		return vtype;
	}

	/**
	 * @param vtype
	 *            the vtype to set
	 */
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public String getFuel() {
		return fuel;
	}

	/**
	 * @param fuel
	 *            the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public Integer getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(Integer manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public Integer getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(Integer engineNo) {
		this.engineNo = engineNo;
	}

	public Integer getChesisNo() {
		return chesisNo;
	}

	public void setChesisNo(Integer chesisNo) {
		this.chesisNo = chesisNo;
	}

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Integer getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Integer getWeightBearingCapacity() {
		return weightBearingCapacity;
	}

	public void setWeightBearingCapacity(Integer weightBearingCapacity) {
		this.weightBearingCapacity = weightBearingCapacity;
	}

	public Integer getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(Integer noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	/**
	 * @param registeredDate
	 *            the registeredDate to set
	 */
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	/**
	 * @return the usages
	 */
	public String getUsages() {
		return usages;
	}

	/**
	 * @param usages
	 *            the usages to set
	 */
	public void setUsages(String usages) {
		this.usages = usages;
	}

	/**
	 * @return the deviceInVehicle
	 */
	public String getDeviceInVehicle() {
		return deviceInVehicle;
	}

	/**
	 * @param deviceInVehicle
	 *            the deviceInVehicle to set
	 */
	public void setDeviceInVehicle(String deviceInVehicle) {
		this.deviceInVehicle = deviceInVehicle;
	}
	
	

	public VehicleDto getVehicle() {
		VehicleDto vec = new VehicleDto();
		vec.setVid(vid);
		vec.setVno(vno);
		vec.setZone(zone);
		vec.setLotno(lotno);
		vec.setVnum(vnum);
		vec.setImporterName(importerName);
		vec.setImporterAddress(importerAddress);
		vec.setManufacturerName(manufacturerName);
		vec.setManufacturedYear(manufacturedYear);
		vec.setVmodel(vmodel);
		vec.setEngineNo(engineNo);
		vec.setChesisNo(chesisNo);
		vec.setCc(cc);
		vec.setNoOfCylinders(noOfCylinders);
		vec.setVcolor(vcolor);
		vec.setVtype(vtype);
		vec.setNoOfSeats(noOfSeats);
		vec.setFuel(fuel);
		vec.setTotalWeight(totalWeight);
		vec.setWeightBearingCapacity(weightBearingCapacity);
		vec.setRegisteredDate(registeredDate);
		vec.setUsages(usages);
		vec.setDeviceInVehicle(deviceInVehicle);
		if (vehicleTaxes != null)
			vec.setTaxes(VehicleTax.getTaxes(vehicleTaxes));
		if (owner != null)
			vec.setOwner(owner.getOwner());
		vec.setCustomduty(customduty);
		vec.setRfid(rfid);
		vec.setVehicletype(vehicletype);		
		if(ownershipTransfer!=null) {
			vec.setOwnershipDtos(OwnershipTransfer.getOwnerTransfer(ownershipTransfer));
		
		}
		return vec;
	}

}
