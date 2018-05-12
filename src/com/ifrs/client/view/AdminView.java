package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.presenter.AdminPresenter.Display;

public class AdminView extends Composite implements Display {

	private static AdminViewUiBinder uiBinder = GWT.create(AdminViewUiBinder.class);
		
	@UiField
	TabWidget tabWidget;
	
	interface AdminViewUiBinder extends UiBinder<Widget, AdminView> {
	}

	public AdminView() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	public TabWidget getTabWidget() {
		return tabWidget;
	}
	
}
