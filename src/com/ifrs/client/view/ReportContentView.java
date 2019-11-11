package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.base.AbstractValueWidget;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSwitch;

public class ReportContentView extends Composite {

	@UiField
	MaterialRow companyRow;
	@UiField
	MaterialRow sectorRow;
	@UiField
	MaterialRow subDomainRow;
	@UiField
	MaterialRow domRow;	
	@UiField
	MaterialLabel lblAmount;
	@UiField
	MaterialLabel lDomain;
	@UiField
	MaterialLabel lSector;
	@UiField
	MaterialLabel lSubDomain;
	@UiField
	MaterialLabel lblCompany;
	@UiField
	MaterialIcon iconDel;
	@UiField
	MaterialLabel lblDomain;
	@UiField
	MaterialLabel lblDescription;
	@UiField
	MaterialSwitch switchDesc;

	@UiField
	MaterialLabel lblSector;
	@UiField
	MaterialLabel lblSubDomain;
 int id = 0;

	private static ReportContentViewUiBinder uiBinder = GWT.create(ReportContentViewUiBinder.class);

	interface ReportContentViewUiBinder extends UiBinder<Widget, ReportContentView> {
	}

	public ReportContentView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public MaterialLabel getLblAmount() {
		return lblAmount;
	}

	public void setLblAmount(MaterialLabel lblAmount) {
		this.lblAmount = lblAmount;
	}

	public MaterialLabel getLblCompany() {
		return lblCompany;
	}

	public void setLblCompany(MaterialLabel lblCompany) {
		this.lblCompany = lblCompany;
	}

	public MaterialLabel getLblDomain() {
		return lblDomain;
	}

	public void setLblDomain(MaterialLabel lblDomain) {
		this.lblDomain = lblDomain;
	}

	public MaterialLabel getLblSector() {
		return lblSector;
	}

	public void setLblSector(MaterialLabel lblSector) {
		this.lblSector = lblSector;
	}

	public MaterialLabel getLblSubDomain() {
		return lblSubDomain;
	}

	public void setLblSubDomain(MaterialLabel lblSubDomain) {
		this.lblSubDomain = lblSubDomain;
	}


	public MaterialLabel getLblDescription() {
		return lblDescription;
	}

	public void setLblDescription(MaterialLabel lblDescription) {
		this.lblDescription = lblDescription;
	}
 

	public MaterialSwitch getSwitchDesc() {
		// TODO Auto-generated method stub
		return switchDesc;
	}

	public MaterialIcon getIconDel() {
		return iconDel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MaterialLabel getlDomain() {
		return lDomain;
	}

	public MaterialLabel getlSubDomain() {
		return lSubDomain;
	}

	public MaterialLabel getlSector() {
		return lSector;
	}

	public MaterialRow getDomRow() {
		return domRow;
	}

	public void setDomRow(MaterialRow domRow) {
		this.domRow = domRow;
	}

	public MaterialRow getCompanyRow() {
		return companyRow;
	}

	public MaterialRow getSectorRow() {
		return sectorRow;
	}

	public MaterialRow getSubDomainRow() {
		return subDomainRow;
	}


}
