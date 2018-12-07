package com.project.eRashid.daoImpls;



import java.util.List;

import javax.annotation.Resource;


import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.project.eRashid.controllers.VehicleController;
import com.project.eRashid.daos.VehicleDao;
import com.project.eRashid.models.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao{
	@Resource
	
	private SessionFactory SessionFactory;
	private static final Logger Logger= LoggerFactory.getLogger(VehicleController.class);

	
	


		@Override
		@Transactional
		public List<Vehicle> searchVehicle(String vno) {
			Vehicle v = new Vehicle();
			Logger.info("search by vno sucessful");
			Session session = SessionFactory.openSession();			
			Criteria criteria = session.createCriteria(Vehicle.class);
			criteria.setFetchMode("CustomDuty", FetchMode.JOIN).setFetchMode("OwnerInfo", FetchMode.JOIN).add(Restrictions.eq("vno", vno));
			@SuppressWarnings("unchecked")
			List<Vehicle> results = criteria.list();
		return results;
			
		}


		@Override
		@Transactional
		public List<Vehicle> getAllVehicle() {
			
			Session session = SessionFactory.openSession();

			Criteria c = session.createCriteria(Vehicle.class);
			
			c.setFetchMode("CustomDuty", FetchMode.JOIN);

			c.setFetchMode("OwnerInfo", FetchMode.JOIN);
			@SuppressWarnings("unchecked")
			List<Vehicle> vehiclelist = c.list();
			return  vehiclelist;
		}


		@Override
		@Transactional
		public void updateVehicle(Vehicle v) {
			// TODO Auto-generated method stub
		Session session= SessionFactory.getCurrentSession();
		session.update(v);
		}


		@Override
		@Transactional
		public Vehicle getById(int vid) {
			Session session= SessionFactory.getCurrentSession();
			Vehicle v = (Vehicle)session.get(Vehicle.class, vid);
			Logger.info("calyo");
			return v;
		}
	

}
