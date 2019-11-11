package com.ifrs.client.presenter;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.ifrs.client.GreetingService;
import com.ifrs.client.GreetingServiceAsync;
import com.ifrs.client.view.BaseInterface;
import com.ifrs.client.view.ContractListViewTable;
import com.ifrs.client.view.ContractForm;
import com.ifrs.client.view.TabWidget;
import com.ifrs.shared.BaseDTO;
import com.ifrs.shared.Sectors;

public class AdminPresenter implements Presenter

{
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
	private final GreetingServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private Logger logger = Logger.getLogger("DashBoardPresenter");

	private ArrayList<BaseInterface> recordsList = new ArrayList<BaseInterface>();
	private ArrayList<Sectors> sectors = new ArrayList<Sectors>();

	public interface Display {
		Widget asWidget();

		TabWidget getTabWidget();

		Object getHtmlErrorMessage = null;

	}

	public AdminPresenter(GreetingServiceAsync rpcService, HandlerManager eventBus, Display view) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.display = view;
	}

	public void go(HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
		bind();
		fetchSectors();

	}

	private void bind() {
		display.getTabWidget().getContainerAddContract().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ContractForm addContract = new ContractForm();
				display.getTabWidget().getContainerAddContract().add(addContract);
			}
		});
		display.getTabWidget().getContainerContractList().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ContractListViewTable contractList = new ContractListViewTable();
				display.getTabWidget().getContainerContractList().add(contractList);

			}
		});
		// display.getTabWidget().getBtnSaveSector().addClickHandler(new
		// ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		// ArrayList<BaseDTO> sectorsList = new ArrayList<BaseDTO>();
		// for (int i = 0; i < recordsList.size(); i++) {
		// if (recordsList.get(i) instanceof SectorWidget) {
		// SectorWidget sectorWidget = (SectorWidget) recordsList.get(i);
		// if (!sectorWidget.getTxtBox().getText().isEmpty()) {
		// Sectors sector = new Sectors();
		// sector.setSectorName(sectorWidget.getTxtBox().getValue());
		// sectorsList.add(sector);
		// }
		// }
		// }
		// saveSector(sectorsList);
		// }
		//
		// });

		//
		// display.getTabWidget().getBtnAddSector().addClickHandler(new
		// ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		//
		// SectorWidget sectorwidget = new SectorWidget(false, "Enter Sector
		// Name");
		// display.getTabWidget().getContainerSector().add(sectorwidget);
		// recordsList.add(sectorwidget);
		// sectorwidget.getIconDel().addClickHandler(new ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		// display.getTabWidget().getContainerSector().remove(sectorwidget);
		// recordsList.remove(sectorwidget);
		// //sectorwidget.removeFromParent();
		//
		// }
		// });
		// }
		// });
		//
		// display.getTabWidget().getBtnAddCompany().addClickHandler(new
		// ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		//
		//
		// CompanyWidget companywidget = new CompanyWidget(true, "Enter Company
		// Name");
		// for(int i=0; i< sectors.size(); i++){
		// companywidget.getListBox().addItem(sectors.get(i).getSectorId()+"",
		// sectors.get(i).getSectorName());
		// }
		// display.getTabWidget().getContainerCompany().add(companywidget);
		// recordsList.add(companywidget);
		// companywidget.getIconDel().addClickHandler(new ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		// display.getTabWidget().getContainerCompany().remove(companywidget);
		// recordsList.remove(companywidget);
		// //sectorwidget.removeFromParent();
		//
		// }
		// });
		//
		// }
		//
		//
		// });
		// display.getTabWidget().getBtnSaveCompany().addClickHandler(new
		// ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		// Window.alert("company click");
		//
		// ArrayList<BaseDTO> companysList = new ArrayList<BaseDTO>();
		// for (int i = 0; i < recordsList.size(); i++) {
		// if(recordsList.get(i) instanceof CompanyWidget){
		// CompanyWidget companywidget = (CompanyWidget) recordsList.get(i);
		// if(! companywidget.getTxtBox().getText().isEmpty()){
		// Company company = new Company();
		// company.setCompanyName(companywidget.getTxtBox().getValue());
		// Sectors sector = new Sectors();
		// sector.setSectorId(Integer.parseInt(companywidget.getListBox().getSelectedValue()));
		// company.setCompanySector(sector);
		//
		// companysList.add(company);
		// }
		// }
		// }
		// saveCompany(companysList);
		//
		// }
		//
		//
		// });
		//

	}

	private void fetchSectors() {
		greetingService.fetchSectors(new AsyncCallback<ArrayList<Sectors>>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onSuccess(ArrayList<Sectors> result) {

				sectors = result;
			}
		});
	}

	private void saveSector(ArrayList<BaseDTO> sectorsList) {
		greetingService.saveRecord(sectorsList, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail");

			}

			@Override
			public void onSuccess(String result) {
				Window.alert(result);

			}

		});

	}

	private void saveCompany(ArrayList<BaseDTO> company) {
		greetingService.saveRecord(company, new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fail");

			}

			@Override
			public void onSuccess(String result) {
				Window.alert(result);

			}
		});

	}
}
