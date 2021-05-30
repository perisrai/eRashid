package com.project.eRashid.dtos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.eRashid.models.OwnershipTransfer;
import com.project.eRashid.models.Vehicle;

public class OwnershipTransferDto {

	private int id;

	private String purpose;

	private Date transferDate;

	private OwnerInfoDto oldOwner;

	private OwnerInfoDto newOwner;

	@JsonIgnore
	private Vehicle vehicle;

	private List<OwnershipTransferDto> ownershipTransferDto;

	public List<OwnershipTransferDto> getOwnershipTransferDto() {
		return ownershipTransferDto;
	}

	public void setOwnershipTransferDto(List<OwnershipTransferDto> ownershipTransferDto) {
		this.ownershipTransferDto = ownershipTransferDto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public OwnerInfoDto getOldOwner() {
		return oldOwner;
	}

	public void setOldOwner(OwnerInfoDto oldOwner) {
		this.oldOwner = oldOwner;
	}

	public OwnerInfoDto getNewOwner() {
		return newOwner;
	}

	public void setNewOwner(OwnerInfoDto newOwner) {
		this.newOwner = newOwner;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "OwnershipTransferDto [id=" + id + ", purpose=" + purpose
				+ ", transferDate=" + transferDate + ", oldOwner=" + oldOwner
				+ ", newOwner=" + newOwner + ", vehicle=" + vehicle + "]";
	}

	public OwnershipTransfer getOwnershipTransfer() {
		OwnershipTransfer ot = new OwnershipTransfer();
		ot.setPurpose(purpose);
		ot.setTransferDate(transferDate);
		// ot.setOldOwner(oldOwner);
		// ot.setNewOwner(newOwner);

		return ot;

	}

}
