package com.project.eRashid.dtos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.eRashid.models.CustomDuty;
import com.project.eRashid.models.Rfid;
import com.project.eRashid.models.Vehicle;
import com.project.eRashid.models.VehicleType;

public class VehicleDto {

	private int vid;

	private OwnerInfoDto owner;

	@JsonIgnore
	private CustomDuty customduty;

	@JsonIgnore
	private VehicleType vehicletype;

	@JsonIgnore
	private Rfid rfid;

	private List<OwnershipTransferDto> ownershipDtos;
	private OwnershipTransferDto ownershipDto;
	private List<VehicleTaxDto> taxes;
	private String vno;
	private String zone;
	private Integer lotno;
	private String type;
	private Integer vnum;
	private String importerName;

	private String importerAddress;

	private String manufacturerName;

	private Integer manufacturedYear;

	private String vmodel;

	private Integer engineNo;

	private Integer chesisNo;

	private Integer cc;

	private Integer noOfCylinders;

	private String vcolor;

	private String vtype;

	private Integer noOfSeats;

	private String fuel;

	private Integer totalWeight;

	private Integer weightBearingCapacity;

	private Date registeredDate;

	private String usages;

	private String deviceInVehicle;

	/**
	 * @return the taxes
	 */
	public List<VehicleTaxDto> getTaxes() {
		return taxes;
	}

	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(List<VehicleTaxDto> taxes) {
		this.taxes = taxes;
	}

	public OwnerInfoDto getOwner() {
		return owner;
	}

	public void setOwner(OwnerInfoDto owner) {
		this.owner = owner;
	}

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

	public Integer getLotno() {
		return lotno;
	}

	public void setLotno(Integer lotno) {
		this.lotno = lotno;
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

	public List<OwnershipTransferDto> getOwnershipDtos() {
		return ownershipDtos;
	}

	public void setOwnershipDtos(List<OwnershipTransferDto> ownershipDtos) {
		this.ownershipDtos = ownershipDtos;
	}

	public OwnershipTransferDto getOwnershipDto() {
		return ownershipDto;
	}

	public void setOwnershipDto(OwnershipTransferDto ownershipdto) {
		this.ownershipDto = ownershipdto;
	}

	public String getVmodel() {
		return vmodel;
	}

	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	public Integer getCc() {
		return cc;
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

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getImporterName() {
		return importerName;
	}

	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	public String getImporterAddress() {
		return importerAddress;
	}

	public void setImporterAddress(String importerAddress) {
		this.importerAddress = importerAddress;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
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

	public Integer getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(Integer noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
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

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getDeviceInVehicle() {
		return deviceInVehicle;
	}

	public void setDeviceInVehicle(String deviceInVehicle) {
		this.deviceInVehicle = deviceInVehicle;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

	public String getUsages() {
		return usages;
	}

	public void setUsages(String usages) {
		this.usages = usages;
	}

	public CustomDuty getCustomduty() {
		return customduty;
	}

	@Override
	public String toString() {
		return "VehicleDto [vid=" + vid + ", owner=" + owner + ", customduty="
				+ customduty + ", vehicletype=" + vehicletype + ", rfid=" + rfid
				+ ", ownershipDto=" + ownershipDto + ", taxes=" + taxes + ", vno=" + vno
				+ ", zone=" + zone + ", lotno=" + lotno + ", type=" + type + ", vnum="
				+ vnum + ", importerName=" + importerName + ", importerAddress="
				+ importerAddress + ", manufacturerName=" + manufacturerName
				+ ", manufacturedYear=" + manufacturedYear + ", vmodel=" + vmodel
				+ ", engineNo=" + engineNo + ", chesisNo=" + chesisNo + ", cc=" + cc
				+ ", noOfCylinders=" + noOfCylinders + ", vcolor=" + vcolor + ", vtype="
				+ vtype + ", noOfSeats=" + noOfSeats + ", fuel=" + fuel + ", totalWeight="
				+ totalWeight + ", weightBearingCapacity=" + weightBearingCapacity
				+ ", registeredDate=" + registeredDate + ", usages=" + usages
				+ ", deviceInVehicle=" + deviceInVehicle + ", getTaxes()=" + getTaxes()
				+ ", getOwner()=" + getOwner() + ", getRfid()=" + getRfid()
				+ ", getVehicletype()=" + getVehicletype() + ", getLotno()=" + getLotno()
				+ ", getType()=" + getType() + ", getVnum()=" + getVnum() + ", getVid()="
				+ getVid() + ", getVno()=" + getVno() + ", getOwnershipDto()="
				+ getOwnershipDto() + ", getVmodel()=" + getVmodel() + ", getCc()="
				+ getCc() + ", getVcolor()=" + getVcolor() + ", getVtype()=" + getVtype()
				+ ", getFuel()=" + getFuel() + ", getZone()=" + getZone()
				+ ", getImporterName()=" + getImporterName() + ", getImporterAddress()="
				+ getImporterAddress() + ", getManufacturerName()="
				+ getManufacturerName() + ", getManufacturedYear()="
				+ getManufacturedYear() + ", getEngineNo()=" + getEngineNo()
				+ ", getChesisNo()=" + getChesisNo() + ", getNoOfCylinders()="
				+ getNoOfCylinders() + ", getNoOfSeats()=" + getNoOfSeats()
				+ ", getTotalWeight()=" + getTotalWeight()
				+ ", getWeightBearingCapacity()=" + getWeightBearingCapacity()
				+ ", getRegisteredDate()=" + getRegisteredDate()
				+ ", getDeviceInVehicle()=" + getDeviceInVehicle() + ", getUsages()="
				+ getUsages() + ", getCustomduty()=" + getCustomduty() + ", getVehicle()="
				+ getVehicle() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setCustomduty(CustomDuty customduty) {
		this.customduty = customduty;
	}

	@JsonIgnore
	public Vehicle getVehicle() {
		Vehicle vec = new Vehicle();
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
		vec.setCustomduty(customduty);
		vec.setRfid(rfid);
		vec.setVehicletype(vehicletype);

		return vec;
	}

}
