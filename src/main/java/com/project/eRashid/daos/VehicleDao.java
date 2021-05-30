package com.project.eRashid.daos;

import java.util.List;

import com.project.eRashid.dtos.VehicleDto;

public interface VehicleDao {
	public List<VehicleDto> searchVehicle(String vno);
	public VehicleDto getById(int vid);
	public List<VehicleDto> getAllVehicle();
	public void updateVehicle(VehicleDto v);
	
	public Object getHistoryById(int vid);
	
	

}
