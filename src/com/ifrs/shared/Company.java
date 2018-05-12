package com.ifrs.shared;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity

@Table(name = "company")
public class Company extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "companyid")
    private int companyId;

    @Column(name = "companyname")
    private String companyName;

   
    @JoinColumn(name = "companysector")
	@ManyToOne(fetch = FetchType.EAGER)
	private Sectors companySector;

      public Company() {
    }

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Sectors getCompanySector() {
		return companySector;
	}

	public void setCompanySector(Sectors companySector) {
		this.companySector = companySector;
	}

	
	
}
