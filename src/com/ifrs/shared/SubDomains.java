package com.ifrs.shared;

import java.io.Serializable;

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

@Table(name = "subdomains")
public class SubDomains implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subdomainid")
    private int subDomainId;

    @Column(name = "subdomainname")
    private String subDomainName;

    @Column(name = "domainid")
    private int domainId;

      public SubDomains() {
    }

	public int getSubDomainId() {
		return subDomainId;
	}

	public void setSubDomainId(int subDomainId) {
		this.subDomainId = subDomainId;
	}

	public String getSubDomainName() {
		return subDomainName;
	}

	public void setSubDomainName(String subDomainName) {
		this.subDomainName = subDomainName;
	}

	public int getDomainId() {
		return domainId;
	}

	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}

  
	
}
