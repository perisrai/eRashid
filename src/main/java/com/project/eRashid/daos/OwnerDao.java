package com.project.eRashid.daos;

import com.project.eRashid.dtos.OwnerLogin;
import com.project.eRashid.dtos.TaxDetails;
import com.project.eRashid.models.Vehicle;

/**
 * <<Description Here>>
 * @author 
 * 
 */
public interface OwnerDao {
	public boolean login(String un, String psw);

	/**
	 * <<Add description here>>
	 * @param vno
	 * @return
	 * @author 
	 * @since , Modified In: @version, By @author
	 */
	public Vehicle getVehicle(String vno);

	/**
	 * <<Add description here>>
	 * @param vno
	 * @return
	 * @author 
	 * @since , Modified In: @version, By @author
	 */
	public TaxDetails getTaxDetails(String vno);

	/**
	 *<<Add description here>>
	 * @param owner
	 * @author 
	 * @since , Modified In: @version, By @author
	 */
	public void payForOwner(OwnerLogin owner);

	/**
	 *<<Add description here>>
	 * @param rfid
	 * @return
	 * @author 
	 * @since , Modified In: @version, By @author
	 */
	public Vehicle getVehicleForPi(String rfid);

}
