package com.ifrs.client.presenter;

import java.util.logging.Logger;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.GreetingServiceAsync;

public class ChoiceSelectionPresenter implements Presenter

{

	private final GreetingServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private Logger logger = Logger.getLogger("ChoiceSelectionPresenter");

	public interface Display {
		Widget asWidget();

	}

	public ChoiceSelectionPresenter(GreetingServiceAsync rpcService, HandlerManager eventBus, Display view) {
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

	}

}
