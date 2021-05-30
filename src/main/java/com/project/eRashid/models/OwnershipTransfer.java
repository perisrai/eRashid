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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.eRashid.dtos.OwnershipTransferDto;

@Entity
@Table(name = "ownershipTransfer")
public class OwnershipTransfer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String purpose;
	@Column
	private Date transferDate;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "vid")
	private Vehicle vehicle;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "old_owner")
	private OwnerInfo oldOwner;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "new_owner")
	private OwnerInfo newOwner;

	/**
	 * @return the oldOwner
	 */
	public OwnerInfo getOldOwner() {
		return oldOwner;
	}

	/**
	 * @param oldOwner the oldOwner to set
	 */
	public void setOldOwner(OwnerInfo oldOwner) {
		this.oldOwner = oldOwner;
	}

	/**
	 * @return the newOwner
	 */
	public OwnerInfo getNewOwner() {
		return newOwner;
	}

	/**
	 * @param newOwner the newOwner to set
	 */
	public void setNewOwner(OwnerInfo newOwner) {
		this.newOwner = newOwner;
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "OwnershipTransfer [id=" + id + ", purpose=" + purpose + ", transferDate="
				+ transferDate + ",  vehicle=" + vehicle + "]";
	}

	public OwnershipTransferDto getOwnershipTransfer() {
		OwnershipTransferDto ot = new OwnershipTransferDto();
		ot.setPurpose(purpose);
		ot.setTransferDate(transferDate);
		ot.setNewOwner(newOwner.getOwner());
		ot.setOldOwner(oldOwner.getOwner());
		ot.setVehicle(vehicle);
		return ot;

	}

	public static List<OwnershipTransferDto> getOwnerTransfer(
			List<OwnershipTransfer> ownershipTransfer) {
		List<OwnershipTransferDto> ownership = new ArrayList<>();
		for (OwnershipTransfer ot : ownershipTransfer) {

			ownership.add(ot.getOwnershipTransfer());

		}

		return ownership;

	}

}
