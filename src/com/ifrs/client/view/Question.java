package com.ifrs.client.view;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialCardAction;
import gwt.material.design.client.ui.MaterialCardContent;
import gwt.material.design.client.ui.MaterialCardTitle;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialRow;

public class Question extends MaterialCard

{
	protected MaterialButton btnSubmit = new MaterialButton("Submit");
	MaterialRadioButton radioYes = new MaterialRadioButton();
	MaterialRadioButton radioNo = new MaterialRadioButton();
	protected int id;
	protected String name;

	public Question(int id, String name) {
		setWidth("800px");
		this.id = id;
		this.name = name;
		MaterialCardTitle cardTitle = new MaterialCardTitle();
		cardTitle.setText("Question" + id);
		MaterialCardContent content = new MaterialCardContent();
		MaterialLabel quesiton = new MaterialLabel(name);
		content.add(quesiton);

		MaterialCardAction cardAction = new MaterialCardAction();

		radioNo.setText("No");
		radioYes.setText("Yes");
		radioNo.setName("question");
		radioYes.setName("question");

		radioYes.setEnabled(false);
		radioNo.setEnabled(false);

		MaterialRow rowRadio = new MaterialRow();
		MaterialRow rowBtn = new MaterialRow();
		rowRadio.add(radioYes);
		rowRadio.add(radioNo);
		rowBtn.add(btnSubmit);

		cardAction.add(rowRadio);
		cardAction.add(rowBtn);

		add(cardTitle);
		add(content);
		add(cardAction);

	}

	public MaterialRadioButton getRadioYes() {
		return radioYes;
	}

	public void setRadioYes(MaterialRadioButton radioYes) {
		this.radioYes = radioYes;
	}

	public MaterialRadioButton getRadioNo() {
		return radioNo;
	}

	public void setRadioNo(MaterialRadioButton radioNo) {
		this.radioNo = radioNo;
	}

}
