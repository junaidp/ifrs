package com.ifrs.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ifrs.shared.BaseDTO;
import com.ifrs.shared.Company;
import com.ifrs.shared.Sectors;
import com.ifrs.shared.User;




/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
	User signIn(String userid, String password) throws Exception;
	String saveRecord(ArrayList<BaseDTO> records) throws Exception;
	ArrayList<Sectors> fetchSectors () throws Exception;
	//String saveCompany(ArrayList<Company> company) throws Exception;


}
