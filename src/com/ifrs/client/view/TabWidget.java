package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;

public class TabWidget extends Composite {

	private static TabWidgetUiBinder uiBinder = GWT.create(TabWidgetUiBinder.class);

	interface TabWidgetUiBinder extends UiBinder<Widget, TabWidget> {
	}
	@UiField
	MaterialColumn containerSector;
	@UiField
	MaterialColumn containerCompany;
	@UiField
	MaterialColumn containerDomain;
	@UiField
	MaterialColumn containerSubDomain;
	@UiField
	MaterialButton btnAddSector;
	@UiField
	MaterialButton btnAddCompany;
	@UiField
	MaterialButton btnSaveSector;
	@UiField
	MaterialButton btnSaveCompany;

	public TabWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}


	public MaterialColumn getContainerSector() {
		return containerSector;
	}


	public void setContainerSector(MaterialColumn containerSector) {
		this.containerSector = containerSector;
	}


	public MaterialColumn getContainerCompany() {
		return containerCompany;
	}


	public void setContainerCompany(MaterialColumn containerCompany) {
		this.containerCompany = containerCompany;
	}


	public MaterialColumn getContainerDomain() {
		return containerDomain;
	}


	public void setContainerDomain(MaterialColumn containerDomain) {
		this.containerDomain = containerDomain;
	}


	public MaterialColumn getContainerSubDomain() {
		return containerSubDomain;
	}


	public void setContainerSubDomain(MaterialColumn containerSubDomain) {
		this.containerSubDomain = containerSubDomain;
	}


	public MaterialButton getBtnAddSector() {
		return btnAddSector;
	}


	public void setBtnAddSector(MaterialButton btnAddSector) {
		this.btnAddSector = btnAddSector;
	}


	public MaterialButton getBtnAddCompany() {
		return btnAddCompany;
	}


	public void setBtnAddCompany(MaterialButton btnAddCompany) {
		this.btnAddCompany = btnAddCompany;
	}


	public MaterialButton getBtnSaveSector() {
		return btnSaveSector;
	}


	public void setBtnSaveSector(MaterialButton btnSaveSector) {
		this.btnSaveSector = btnSaveSector;
	}


	public MaterialButton getBtnSaveCompany() {
		return btnSaveCompany;
	}


	public void setBtnSaveCompany(MaterialButton btnSaveCompany) {
		this.btnSaveCompany = btnSaveCompany;
	}


	

}
