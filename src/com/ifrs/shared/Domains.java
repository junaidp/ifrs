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

@Table(name = "domains")
public class Domains implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "domainid")
    private int domainId;

    @Column(name = "domainname")
    private String domainName;

   

      public Domains() {
    }



	public int getDomainId() {
		return domainId;
	}



	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}



	public String getDomainName() {
		return domainName;
	}



	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

  
	
}
