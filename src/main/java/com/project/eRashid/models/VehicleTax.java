package com.project.eRashid.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.project.eRashid.dtos.VehicleTaxDto;

@Entity
public class VehicleTax {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private Date paidDate;
	@Column
	private Integer amount;
	@Column
	private String status;

	@JoinColumn(name = "vehicle")
	@ManyToOne(fetch = FetchType.EAGER)
	private Vehicle vehicle;

	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the paidDate
	 */
	public Date getPaidDate() {
		return paidDate;
	}

	/**
	 * @param paidDate
	 *            the paidDate to set
	 */
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public VehicleTaxDto getTax() {
		VehicleTaxDto tax = new VehicleTaxDto();
		tax.setAmount(amount);
		tax.setPaidDate(paidDate);
		tax.setStatus(status);
		return tax;
	}

	public static List<VehicleTaxDto> getTaxes(List<VehicleTax> vehicleTaxes) {
		List<VehicleTaxDto> taxes = new ArrayList<>();
		for (VehicleTax t : vehicleTaxes) {
			taxes.add(t.getTax());
		}
		return taxes;
	}

}
