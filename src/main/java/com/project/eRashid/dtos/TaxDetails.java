package com.project.eRashid.dtos;

import java.util.Date;

/**
 * <<Description Here>>
 * @author Pranish Dahal
 * 
 */
public class TaxDetails {

	private Date lastTaxPaidDate;
	private String taxToPay;
	private String status;
	private Boolean alreadyPaidForCurrentYear;

	/**
	 * @return the lastTaxPaidDate
	 */
	public Date getLastTaxPaidDate() {
		return lastTaxPaidDate;
	}

	/**
	 * @param lastTaxPaidDate the lastTaxPaidDate to set
	 */
	public void setLastTaxPaidDate(Date lastTaxPaidDate) {
		this.lastTaxPaidDate = lastTaxPaidDate;
	}

	/**
	 * @return the taxToPay
	 */
	public String getTaxToPay() {
		return taxToPay;
	}

	/**
	 * @param taxToPay the taxToPay to set
	 */
	public void setTaxToPay(String taxToPay) {
		this.taxToPay = taxToPay;
	}

	/**
	 * @return the alreadyPaidForCurrentYear
	 */
	public Boolean getAlreadyPaidForCurrentYear() {
		return alreadyPaidForCurrentYear;
	}

	/**
	 * @param alreadyPaidForCurrentYear the alreadyPaidForCurrentYear to set
	 */
	public void setAlreadyPaidForCurrentYear(Boolean alreadyPaidForCurrentYear) {
		this.alreadyPaidForCurrentYear = alreadyPaidForCurrentYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
