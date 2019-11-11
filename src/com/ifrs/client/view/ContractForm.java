package com.ifrs.client.view;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.GreetingService;
import com.ifrs.client.GreetingServiceAsync;
import com.ifrs.shared.ContractDetailsEntity;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialLoader;
import gwt.material.design.client.ui.MaterialTextBox;

public class ContractForm extends Composite {
	private GreetingServiceAsync rpcService = GWT.create(GreetingService.class);

	@UiField
	MaterialDatePicker picker;
	@UiField
	MaterialTextBox txtClassAsset;
	@UiField
	MaterialTextBox txtLeaseName;
	@UiField
	MaterialTextBox txtLessorName;
	@UiField
	MaterialTextBox txtLocation;
	@UiField
	MaterialTextBox txtCondition;
	@UiField
	MaterialButton btnUploadContract;

	private static NewLeaseCollapsibleUiBinder uiBinder = GWT.create(NewLeaseCollapsibleUiBinder.class);

	interface NewLeaseCollapsibleUiBinder extends UiBinder<Widget, ContractForm> {
	}

	public ContractForm() {
		initWidget(uiBinder.createAndBindUi(this));

		Date minDate = new Date(119, 0, 1);

		picker.setDate(minDate);
		picker.setDateMin(minDate);
		// picker.setDateMin(y);

		btnUploadContract.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.alert("s");
				saveContractDetail();

			}
		});

	}

	private void saveContractDetail() {
		final MaterialLoader loader = new MaterialLoader();
		loader.show();
		ContractDetailsEntity contractDetail = new ContractDetailsEntity();
		contractDetail.setCondition(txtCondition.getText());
		contractDetail.setLeaseName(txtLeaseName.getText());
		contractDetail.setLessorName(txtLessorName.getText());
		contractDetail.setCondition(txtCondition.getText());
		contractDetail.setLocation(txtLocation.getText());
		contractDetail.setAssetClass(txtClassAsset.getText());
		contractDetail.setLeaseDate(picker.getDate());
		rpcService.saveContractDetail(contractDetail, new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
				loader.hide();

			}

			@Override
			public void onFailure(Throwable caught) {
				loader.hide();

			}
		});
	}

}
