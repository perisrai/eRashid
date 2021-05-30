package com.project.eRashid.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.eRashid.models.VehicleTax;

@Repository
public interface VehicleTaxRepo extends JpaRepository<VehicleTax, Integer> {

}
