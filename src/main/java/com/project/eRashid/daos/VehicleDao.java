package com.project.eRashid.daos;

import java.util.List;


import com.project.eRashid.models.Vehicle;

public interface VehicleDao {
	public List<Vehicle> searchVehicle(String vno);
	public Vehicle getById(int vid);
	public List<Vehicle> getAllVehicle();
	

	public void updateVehicle(Vehicle v);
	

}
