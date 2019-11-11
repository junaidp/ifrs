package com.ifrs.shared;

import java.io.Serializable;
import java.util.ArrayList;

public class RecordDTO implements Serializable {
	
	private ArrayList<Company> companies;
	private ArrayList<Domains> domains;
	private ArrayList<SubDomains> subDomains;
	private ArrayList<Sectors> sectors;
	public ArrayList<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(ArrayList<Company> companies) {
		this.companies = companies;
	}
	public ArrayList<Domains> getDomains() {
		return domains;
	}
	public void setDomains(ArrayList<Domains> domains) {
		this.domains = domains;
	}
	public ArrayList<SubDomains> getSubDomains() {
		return subDomains;
	}
	public void setSubDomains(ArrayList<SubDomains> subDomains) {
		this.subDomains = subDomains;
	}
	public ArrayList<Sectors> getSectors() {
		return sectors;
	}
	public void setSectors(ArrayList<Sectors> sectors) {
		this.sectors = sectors;
	}
	

}
