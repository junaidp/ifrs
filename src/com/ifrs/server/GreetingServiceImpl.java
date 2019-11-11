package com.ifrs.server;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ifrs.client.GreetingService;
import com.ifrs.database.MySQLRdbHelper;
import com.ifrs.shared.BaseDTO;
import com.ifrs.shared.ContractDetailsEntity;
import com.ifrs.shared.Sectors;
import com.ifrs.shared.User;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	HttpSession session;
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	MySQLRdbHelper rdbHelper = (MySQLRdbHelper) ctx.getBean("ManagerExams");

	public String greetServer(String input) throws IllegalArgumentException {
		return "";
	}

	@Override
	public User signIn(String userid, String password) throws Exception {

		User user = (User) rdbHelper.getAuthentication(userid, password);
		if (user != null) {
			session = getThreadLocalRequest().getSession(true);

			session.setAttribute("user", user);

		}
		return user;
	}

	@Override
	public String saveRecord(ArrayList<BaseDTO> records) throws Exception {
		return rdbHelper.saveRecord(records);
	}

	@Override
	public ArrayList<Sectors> fetchSectors() throws Exception {
		return rdbHelper.fetchSectors();
	}

	@Override
	public String saveContractDetail(ContractDetailsEntity contractDetail) throws Exception {

		return rdbHelper.saveContractDetail(contractDetail);
	}

	@Override
	public ArrayList<ContractDetailsEntity> fetchContractDetails() throws Exception {

		return rdbHelper.fetchContractDetails();
	}

	/*
	 * @Override public String saveCompany(ArrayList<Company> company) throws
	 * Exception { // TODO Auto-generated method stub return
	 * rdbHelper.saveCompany(company); }
	 */

}
