package com.ifrs.client.view;

import javax.swing.ButtonGroup;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCardContent;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialRadioButton;

public class ReportWidget extends Composite {

	private static ReportWidgetUiBinder uiBinder = GWT.create(ReportWidgetUiBinder.class);

	interface ReportWidgetUiBinder extends UiBinder<Widget, ReportWidget> {
	}
@UiField
MaterialListBox companyListBox;
@UiField
MaterialListBox  sectorListBox;
@UiField
MaterialListBox domainListBox;
@UiField
MaterialListBox subDomainListBox;
@UiField
MaterialButton btnGenerateReport;
//@UiField
//ChartTest chart;
@UiField
MaterialRadioButton radioBtnCompany;
@UiField
MaterialRadioButton radioBtnSector;
@UiField
MaterialRadioButton radioBtnDomain;
@UiField
MaterialRadioButton radioBtnSubDomain;


	public ReportWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	
	}
	


	

	public MaterialListBox getCompanyListBox() {
		return companyListBox;
	}

	public void setCompanyListBox(MaterialListBox companyListBox) {
		this.companyListBox = companyListBox;
	}

	public MaterialListBox getSectorListBox() {
		return sectorListBox;
	}

	public void setSectorListBox(MaterialListBox sectorListBox) {
		this.sectorListBox = sectorListBox;
	}

	public MaterialListBox getDomainListBox() {
		return domainListBox;
	}

	public void setDomainListBox(MaterialListBox domainListBox) {
		this.domainListBox = domainListBox;
	}

	public MaterialListBox getSubDomainListBox() {
		return subDomainListBox;
	}

	public void setSubDomainListBox(MaterialListBox subDomainListBox) {
		this.subDomainListBox = subDomainListBox;
	}

	public MaterialButton getBtnGenerateReport() {
		return btnGenerateReport;
	}

	public void setBtnGenerateReport(MaterialButton btnGenerateReport) {
		this.btnGenerateReport = btnGenerateReport;
	}





	public MaterialRadioButton getRadioBtnCompany() {
		return radioBtnCompany;
	}





	public MaterialRadioButton getRadioBtnSector() {
		return radioBtnSector;
	}





	public MaterialRadioButton getRadioBtnDomain() {
		return radioBtnDomain;
	}





	public MaterialRadioButton getRadioBtnSubDomain() {
		return radioBtnSubDomain;
	}





//	public ChartTest getChart() {
//		return chart;
//	}
//
//
//
//
//
//	public void setChart(ChartTest chart) {
//		this.chart = chart;
//	}







}
