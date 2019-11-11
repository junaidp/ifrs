package com.ifrs.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.presenter.ChoiceSelectionPresenter.Display;

import gwt.material.design.client.ui.MaterialButton;

public class HomeView extends Composite implements Display {

	private static QuestionsUiBinder uiBinder = GWT.create(QuestionsUiBinder.class);

	interface QuestionsUiBinder extends UiBinder<Widget, HomeView> {
	}

	@UiField
	MaterialButton btnNewLease;

	public HomeView() {
		initWidget(uiBinder.createAndBindUi(this));

		btnNewLease.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				History.newItem("admin");

			}
		});
	}

	public HomeView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));

	}

}
