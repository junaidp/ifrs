package com.ifrs.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.ifrs.client.presenter.AdminPresenter;
import com.ifrs.client.presenter.ChoiceSelectionPresenter;
import com.ifrs.client.presenter.HeaderPresenter;
import com.ifrs.client.presenter.LoginPresenter;
import com.ifrs.client.presenter.Presenter;
import com.ifrs.client.view.AdminView;
import com.ifrs.client.view.HeaderView;
import com.ifrs.client.view.LoginMaterial;
import com.ifrs.client.view.HomeView;
import com.ifrs.shared.User;

public class AppController implements Presenter, ValueChangeHandler<String> {
	private final HandlerManager eventBus;

	private final GreetingServiceAsync rpcService;
	private HasWidgets container, headerContainer;
	private User loggedInUser;
	private VerticalPanel centerPanel;
	private HasWidgets mainContainer;
	Presenter presenter = null;

	public AppController(GreetingServiceAsync rpcService, HandlerManager eventBus) {
		this.eventBus = eventBus;
		this.rpcService = rpcService;

		bind();
	}

	private void bind() {
		History.addValueChangeHandler(this);

	}

	public void go(final HasWidgets container, HasWidgets headerContainer) {
		this.container = container;
		this.headerContainer = headerContainer;

		if (centerPanel == null) {
			centerPanel = new VerticalPanel();
		}

		presenter = new HeaderPresenter(rpcService, eventBus, new HeaderView(), loggedInUser);
		presenter.go(headerContainer);

		if ("".equals(History.getToken())) {
			History.newItem("choices");
		} else {
			History.fireCurrentHistoryState();
		}
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();

		if (token != null) {
			presenter = null;

			// if (loggedInUser == null && !token.equals("login")) {
			// History.newItem("login");
			// }

			if (token.equals("login")) {
				presenter = new LoginPresenter(rpcService, eventBus, new LoginMaterial());
				presenter.go(container);
			}

			else if (token.equals("admin")) {
				presenter = new AdminPresenter(rpcService, eventBus, new AdminView());
				presenter.go(container);
			}

			else if (token.equals("choices")) {
				presenter = new ChoiceSelectionPresenter(rpcService, eventBus, new HomeView());
				presenter.go(container);
			}

		}
	}

	private void setContainer(HasWidgets container) {
		this.container = container;
		this.container.clear();
	}

	@Override
	public void go(HasWidgets container) {
		// TODO Auto-generated method stub

	}
}
