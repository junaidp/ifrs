package com.ifrs.database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.ifrs.shared.BaseDTO;
import com.ifrs.shared.ContractDetailsEntity;
import com.ifrs.shared.Sectors;
import com.ifrs.shared.User;

public class MySQLRdbHelper {

	private SessionFactory sessionFactory;
	Logger logger;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User getAuthentication(String userid, String password) throws Exception {

		User users = null;
		Session session = null;
		try {
			session = sessionFactory.openSession();

			Criteria crit = session.createCriteria(User.class);
			crit.add(Restrictions.eq("name", userid));
			crit.add(Restrictions.eq("password", password));

			List rsList = crit.list();
			for (Iterator it = rsList.iterator(); it.hasNext();) {
				users = (User) it.next();
				System.out.println(users.getPassword());
			}

		} catch (Exception ex) {
			logger.warn(String.format("Exception occured in getAuthentication", ex.getMessage()), ex);
			System.out.println("Exception occured in getAuthentication" + ex.getMessage());

			throw new Exception("Exception occured in getAuthentication");
		} finally {
			session.close();
		}

		return users;
	}

	public String saveRecord(ArrayList<BaseDTO> records) throws Exception {
		Session session = null;

		try {
			session = sessionFactory.openSession();
			for (int i = 0; i < records.size(); i++) {
				session.saveOrUpdate(records.get(i));
				session.flush();
			}
			return "Records Saved";

		} catch (Exception ex) {
			logger.warn(String.format("Exception occured in saving records", ex.getMessage()), ex);
			throw new Exception("Exception occured in save records");
		} finally {
			session.close();
		}
	}

	public ArrayList<Sectors> fetchSectors() throws Exception {
		ArrayList<Sectors> sectorsList = new ArrayList<Sectors>();
		Session session;
		try {
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(Sectors.class);

			List rsList = crit.list();

			for (Iterator it = rsList.iterator(); it.hasNext();) {
				Sectors sector = (Sectors) it.next();
				sectorsList.add(sector);
			}

			return sectorsList;
		} catch (Exception ex) {
			logger.warn(String.format("Exception occured in getting sectorList", ex.getMessage()), ex);
			System.out.println("Exception occured in getiing sectorList" + ex.getMessage());

			throw new Exception("Exception occured in getting SectorList");
		} finally {

		}
	}

	/*
	 * public String saveCompany(ArrayList<Company> company) throws Exception {
	 * Session session = null;
	 * 
	 * try { session = sessionFactory.openSession(); for(int i=0;
	 * i<company.size(); i++){ session.saveOrUpdate(company.get(i));
	 * session.flush(); } return "Record Saved";
	 * 
	 * } catch (Exception ex) {
	 * logger.warn(String.format("Exception occured in saving Company",
	 * ex.getMessage()), ex); throw new
	 * Exception("Exception occured in save company"); } finally {
	 * session.close(); } }
	 */

	// 2019 oct

	public String saveContractDetail(ContractDetailsEntity contractDetail) throws Exception {
		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.saveOrUpdate(contractDetail);
			session.flush();

			return "Contract Saved";

		} catch (Exception ex) {
			logger.warn(String.format("Exception occured in saving contractDetails", ex.getMessage()), ex);
			throw new Exception("Exception occured in save contractDetails");
		} finally {
			session.close();
		}
	}

	public ArrayList<ContractDetailsEntity> fetchContractDetails() throws Exception {
		ArrayList<ContractDetailsEntity> contractDetailsList = new ArrayList<ContractDetailsEntity>();
		Session session;
		try {
			session = sessionFactory.openSession();
			Criteria crit = session.createCriteria(ContractDetailsEntity.class);

			List rsList = crit.list();

			for (Iterator it = rsList.iterator(); it.hasNext();) {
				ContractDetailsEntity contractDetails = (ContractDetailsEntity) it.next();
				contractDetailsList.add(contractDetails);
			}

			return contractDetailsList;
		} catch (Exception ex) {
			logger.warn(String.format("Exception occured in getting contractDetails", ex.getMessage()), ex);
			System.out.println("Exception occured in getiing contractDetails" + ex.getMessage());

			throw new Exception("Exception occured in getting contractDetails");
		} finally {

		}
	}

}
