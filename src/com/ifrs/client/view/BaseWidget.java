package com.ifrs.client.view;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextBox;

public class BaseWidget extends Composite implements BaseInterface {
		@UiField
		MaterialTextBox txtBox;
		@UiField
		MaterialIcon iconDel;
		@UiField
		MaterialListBox listBox;

	private static SectorWidgetUiBinder uiBinder = GWT.create(SectorWidgetUiBinder.class);

	interface SectorWidgetUiBinder extends UiBinder<Widget, BaseWidget> {
	}

	public BaseWidget(boolean showListBox, String textBoxPlaceHolder) {
		initWidget(uiBinder.createAndBindUi(this));
		listBox.setVisible(showListBox);
		txtBox.setPlaceholder(textBoxPlaceHolder);
	}

	@Override
	public MaterialIcon getIconDel() {
		return iconDel;
	}

	@Override
	public MaterialTextBox getTxtBox() {
		return txtBox;
	}

	@Override
	public MaterialListBox getListBox() {
		return listBox;
	}


	
}
