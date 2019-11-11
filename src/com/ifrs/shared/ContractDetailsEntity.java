
package com.ifrs.shared;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "contractdetails")
public class ContractDetailsEntity extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contractDetailsId")
	private int contractDetailsId;

	@Column(name = "leaseDate")
	private Date leaseDate;

	@Column(name = "assetClass")
	private String assetClass;

	@Column(name = "leaseName")
	private String leaseName;

	@Column(name = "lessorName")
	private String lessorName;

	@Column(name = "leaseLocation")
	private String location;

	@Column(name = "leaseCondition")
	private String condition;

	public ContractDetailsEntity() {
	}

	public Date getLeaseDate() {
		return leaseDate;
	}

	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}

	public String getLeaseName() {
		return leaseName;
	}

	public void setLeaseName(String leaseName) {
		this.leaseName = leaseName;
	}

	public String getLessorName() {
		return lessorName;
	}

	public void setLessorName(String lessorName) {
		this.lessorName = lessorName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

}
