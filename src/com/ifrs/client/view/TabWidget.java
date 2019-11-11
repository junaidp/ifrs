package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialColumn;

public class TabWidget extends Composite {

	private static TabWidgetUiBinder uiBinder = GWT.create(TabWidgetUiBinder.class);
	private StackPanel panel = new StackPanel();

	interface TabWidgetUiBinder extends UiBinder<Widget, TabWidget> {
	}

	@UiField
	MaterialColumn containerAddContract;
	@UiField
	MaterialColumn containerContractList;
	@UiField
	MaterialColumn containerQuestionair;
	@UiField
	MaterialColumn containerSubDomain;

	@UiField
	MaterialColumn containerNewLease;

	public TabWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		ContractForm c = new ContractForm();
		containerAddContract.add(c);

		ContractListViewTable contractView = new ContractListViewTable();
		containerContractList.add(contractView);
		panel.add(c, "Add Contract");
		panel.add(contractView, "Contract List");

		panel.setWidth("900px");

		containerNewLease.add(panel);

		QuestionairView question = new QuestionairView();
		containerSubDomain.add(question);
		containerQuestionair.add(question);

	}

	public MaterialColumn getContainerSubDomain() {
		return containerSubDomain;
	}

	public void setContainerSubDomain(MaterialColumn containerSubDomain) {
		this.containerSubDomain = containerSubDomain;
	}

	public MaterialColumn getContainerAddContract() {
		return containerAddContract;
	}

	public void setContainerAddContract(MaterialColumn containerAddContract) {
		this.containerAddContract = containerAddContract;
	}

	public MaterialColumn getContainerContractList() {
		return containerContractList;
	}

	public void setContainerContractList(MaterialColumn containerContractList) {
		this.containerContractList = containerContractList;
	}

	public MaterialColumn getContainerQuestionair() {
		return containerQuestionair;
	}

	public void setContainerQuestionair(MaterialColumn containerQuestionair) {
		this.containerQuestionair = containerQuestionair;
	}

	public MaterialColumn getContainerNewLease() {
		return containerNewLease;
	}

	public void setContainerNewLease(MaterialColumn containerNewLease) {
		this.containerNewLease = containerNewLease;
	}

}
