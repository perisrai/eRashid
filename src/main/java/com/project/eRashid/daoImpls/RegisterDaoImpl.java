package com.project.eRashid.daoImpls;

import javax.annotation.Resource;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.eRashid.controllers.AdminLoginController;

import com.project.eRashid.daos.RegisterDao;
import com.project.eRashid.models.CustomDuty;

import com.project.eRashid.models.Vehicle;


@Repository
public class RegisterDaoImpl implements RegisterDao{
	@Resource
	private SessionFactory sessionFactory;
	private static final Logger Logger = LoggerFactory.getLogger(AdminLoginController.class);
	
	
	@Override
	@Transactional
	public void registerVehicleInfo(Vehicle v) {
		Session session = sessionFactory.getCurrentSession();
		
		
			// TODO Auto-generated method stub
			Logger.info("insert sucessful");
			
			String vno= v.getZone()+v.getLotno()+v.getType()+v.getVnum();
			
			v.setVno(vno);
			//session.save(cd);
			
			session.save(v);	
			
	}
	
	
			
		
			
	
	}
	
	


