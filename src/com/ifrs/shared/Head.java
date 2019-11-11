package com.ifrs.shared;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "head")
public class Head extends BaseDTO implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "headid")
	    private int headID;

	    @Column(name = "headname")
	    private String headName;
	  
	    
	    public  Head() {
			
		}

		public int getHeadID() {
			return headID;
		}

		public void setHeadID(int headID) {
			this.headID = headID;
		}

		public String getHeadName() {
			return headName;
		}

		public void setHeadName(String headName) {
			this.headName = headName;
		}



}
