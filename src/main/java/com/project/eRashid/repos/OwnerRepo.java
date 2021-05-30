package com.project.eRashid.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.eRashid.models.OwnerInfo;

/**
 * <<Description Here>>
 * @author Pranish Dahal
 * 
 */
@Repository
public interface OwnerRepo extends JpaRepository<OwnerInfo, Integer> {

	@Query(value = "SELECT owner FROM OwnerInfo owner , Vehicle v where owner.password=?2 and v.vno=?1 and v.owner.oid=owner.oid")
	OwnerInfo findByVehicleNoAndPassword(String vno, String psw);

}
