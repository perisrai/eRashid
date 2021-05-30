package com.project.eRashid.daoImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.eRashid.daos.AdminLoginDao;
import com.project.eRashid.models.Admin;
import com.project.eRashid.repos.AdminRepo;

@Repository
public class AdminLoginDaoImpl implements AdminLoginDao {

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public boolean AdminLogin(String un, String psw) {

		Admin admin = adminRepo.findByUsernameAndPassword(un, psw);
		return admin != null;

		// Session session = sessionFactory.openSession();
		// Criteria crt = session.createCriteria(Admin.class);
		//
		// crt.add(Restrictions.eq("a_username", un)).add(Restrictions.eq("a_password",
		// psw));
		//
		// Admin a =(Admin) crt.uniqueResult();
		//
		// if(a!=null){
		// return true;
		// }

		// return false;
	}

}
