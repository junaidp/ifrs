package com.ifrs.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ifrs.shared.Sectors;
import com.ifrs.shared.User;
import com.ifrs.shared.BaseDTO;
import com.ifrs.shared.Company;;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
	void signIn(String userid, String password, AsyncCallback<User> callback);
	void saveRecord(ArrayList<BaseDTO> records, AsyncCallback<String> callback);
	void fetchSectors(AsyncCallback<ArrayList<Sectors>> callback);
//	void saveCompany(ArrayList<Company> company, AsyncCallback<String> callback);

}
