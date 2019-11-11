package com.ifrs.client.presenter;

import java.util.logging.Logger;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.GreetingServiceAsync;
import com.ifrs.shared.User;

import gwt.material.design.client.ui.MaterialLoader;
import gwt.material.design.client.ui.MaterialTextBox;

public class LoginPresenter implements Presenter

{
	private final GreetingServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private Logger logger = Logger.getLogger("DashBoardPresenter");

	public interface Display {
		Widget asWidget();

		Object getHtmlErrorMessage = null;

		MaterialTextBox getTxtPassword();

		MaterialTextBox getTxtUserName();

		HasClickHandlers getBtnSubmit();

		// MaterialListBox getListYears();
		Label getLblError();

	}

	public LoginPresenter(GreetingServiceAsync rpcService, HandlerManager eventBus, Display view) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.display = view;
	}

	public void go(HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
		bind();
	}

	private void bind() {

		display.getBtnSubmit().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				if (display.getTxtUserName().getText().equals("") || display.getTxtPassword().getText().equals("")) {
					display.getLblError().setVisible(true);
					display.getLblError().setText("username / password cannot be empty");
				} else {

					signIn(display.getTxtUserName().getText(), display.getTxtPassword().getText());

				}
			}

		});

	}

	public void signIn(String userName, String password) {
		MaterialLoader.progress(true);

		rpcService.signIn(userName, password, new AsyncCallback<User>()

		{
			public void onFailure(Throwable ex) {
				Window.alert(ex.getStackTrace().toString());
				MaterialLoader.progress(false);
			}

			public void onSuccess(User user) {
				if (user != null) {

					display.getLblError().setVisible(false);
					History.newItem("choices");
				} else {
					display.getLblError().setVisible(true);
					display.getLblError().setText("username / password invalid");
				}

				MaterialLoader.progress(false);
			}
		});

	}
}
