package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.presenter.HeaderPresenter.Display;

import gwt.material.design.client.ui.MaterialLink;

public class HeaderView extends Composite implements Display {

	private static HeaderViewUiBinder uiBinder = GWT.create(HeaderViewUiBinder.class);

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}
	@UiField
	MaterialLink addUser;
    @UiField 
	MaterialLink logOff;

	@UiField
	MaterialLink admin;

	public HeaderView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public void adminView(){

		//changePassword.setVisible(true);
		
		admin.setVisible(false);
		logOff.setVisible(true);
		//addCompany.setVisible(true);
		addUser.setVisible(true);
	}
	public void userView(){
		//changePassword.setVisible(true);
		
		admin.setVisible(true);
		logOff.setVisible(true);
	//	addCompany.setVisible(false);
		addUser.setVisible(false);
	}
	@Override
	public MaterialLink getaddUser() {
		return addUser;
	}



	@Override
	public MaterialLink getlogOff() {
		return logOff;
	}





	public MaterialLink getadmin() {
		return admin;
	}








}
