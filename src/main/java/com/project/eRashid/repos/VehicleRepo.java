package com.project.eRashid.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.eRashid.models.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

	List<Vehicle> findByVnoContaining(String vno);

	Vehicle findByVno(String vno);
		
	List<Vehicle> findAll();

	Vehicle findByVid(Integer vid);

	@Query("select v from Vehicle v , Rfid r where r.uniquekey=?1 and r.rfid_id=v.rfid.rfid_id")
	public Vehicle findByRfid(String rfid);
	
	
	
		
	

}
