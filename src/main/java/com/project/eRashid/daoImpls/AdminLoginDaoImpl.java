package com.project.eRashid.daoImpls;

import javax.annotation.Resource;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;



import com.project.eRashid.daos.AdminLoginDao;
import com.project.eRashid.models.Admin;
@Repository
public class AdminLoginDaoImpl implements AdminLoginDao{

	
	
	@Resource
	private SessionFactory sessionFactory;

	
		@Override
		public boolean AdminLogin(String un, String psw) {
			
			Session session = sessionFactory.openSession();
			Criteria crt = session.createCriteria(Admin.class);
			
			crt.add(Restrictions.eq("a_username", un)).add(Restrictions.eq("a_password", psw));
			
			Admin a =(Admin) crt.uniqueResult();
			
			if(a!=null){
				return true;
			}
			
			return false;
		}

		
	}

	
	


