package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;

public class DifferencesWidget extends Composite {

	private static DifferencesWidgetUiBinder uiBinder = GWT.create(DifferencesWidgetUiBinder.class);

	interface DifferencesWidgetUiBinder extends UiBinder<Widget, DifferencesWidget> {
	}
	@UiField
	MaterialTextBox txtBoxAmount;
	@UiField
	MaterialListBox companyListBox;
	@UiField
	MaterialListBox domainListBox;
	@UiField
	MaterialListBox subDomainListBox;
	@UiField
	MaterialIcon iconDel;
	@UiField
	MaterialTextArea descriptionTextArea;
	

	public DifferencesWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public MaterialTextBox getTxtBoxAmount() {
		return txtBoxAmount;
	}

	public void setTxtBoxAmount(MaterialTextBox txtBoxAmount) {
		this.txtBoxAmount = txtBoxAmount;
	}

	public MaterialListBox getCompanyListBox() {
		return companyListBox;
	}

	public void setCompanyListBox(MaterialListBox companyListBox) {
		this.companyListBox = companyListBox;
	}

	public MaterialIcon getIconDel() {
		return iconDel;
	}

	public void setIconDel(MaterialIcon iconDel) {
		this.iconDel = iconDel;
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

	public MaterialTextArea getDescriptionTextArea() {
		return descriptionTextArea;
	}

	public void setDescriptionTextArea(MaterialTextArea descriptionTextArea) {
		this.descriptionTextArea = descriptionTextArea;
	}

}
