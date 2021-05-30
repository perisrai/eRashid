package com.project.eRashid.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.eRashid.models.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	Admin findByUsernameAndPassword(String un, String psw);

}
