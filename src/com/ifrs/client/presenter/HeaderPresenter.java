package com.ifrs.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.GreetingServiceAsync;
import com.ifrs.shared.User;

import gwt.material.design.client.ui.MaterialLink;

public class HeaderPresenter implements Presenter

{
	private final GreetingServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private User LoggedInUser = new User();



	public interface Display {
		Widget asWidget();
		MaterialLink getaddUser();
		MaterialLink getlogOff();
		MaterialLink getadmin();
	}

	public HeaderPresenter(GreetingServiceAsync rpcService, HandlerManager eventBus, Display view, User loggedInUser) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.display = view;
		this.LoggedInUser = loggedInUser;
		
			display.getaddUser().setVisible(false);
	
	}

	public void go(HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
		bind();
	}

	public void bind() {
		
	
		display.getlogOff().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				History.newItem("login");

				
			}
		});
		

	}


}



