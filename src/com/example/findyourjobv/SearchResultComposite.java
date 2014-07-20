package com.example.findyourjobv;

import com.selectyourjob.models.ResultModel;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Runo;

public class SearchResultComposite extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private Label companyLabel;
	@AutoGenerated
	private Label locationLabel;
	@AutoGenerated
	private Label snipLabel;
	@AutoGenerated
	private Label resultLabel;
	@AutoGenerated
	private Link resultLink;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public SearchResultComposite() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}
	
	public SearchResultComposite(ResultModel result)
	{
		buildMainLayout();
		resultLabel.setContentMode(ContentMode.HTML);
		setCompositionRoot(mainLayout);
		setSearchResult(result);
	}

	public void setSearchResult(ResultModel result)
	{
//		resultLink.setResource(new ExternalResource(result.getUrl()));
//		resultLink.setCaption(result.getJobtitle());
		resultLabel.setValue("<a href=\""+result.getUrl()+"\" onmousedown=\""+result.getOnmousedown()+"\">"+result.getJobtitle()+"</a></p>");
		companyLabel.setValue(result.getCompany());
		locationLabel.setValue(result.getFormattedLocationFull());
		snipLabel.setValue(result.getSnippet());
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("800px");
		mainLayout.setHeight("120px");
		mainLayout.setMargin(true);
		
		// top-level component properties
		setWidth("800px");
		setHeight("120px");
		
//		// resultLink
//		resultLink = new Link();
//		resultLink.setCaption("Link");
//		resultLink.setImmediate(false);
//		resultLink.setWidth("700px");
//		resultLink.setHeight("20px");
//		mainLayout.addComponent(resultLink);
		
		// resultLabel
		resultLabel = new Label();
		resultLabel.setImmediate(false);
		resultLabel.setWidth("700px");
		resultLabel.setHeight("20px");
		resultLabel.setValue("Label");
		resultLabel.setContentMode(ContentMode.HTML);
		mainLayout.addComponent(resultLabel);
		
		// snipLabel
		snipLabel = new Label();
		snipLabel.setImmediate(false);
		snipLabel.setWidth("700px");
		snipLabel.setHeight("65px");
		snipLabel.setValue("Label");
		mainLayout.addComponent(snipLabel);
		
		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1);
		
		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("-1px");
		horizontalLayout_1.setHeight("-1px");
		horizontalLayout_1.setMargin(true);
		
		// locationLabel
		locationLabel = new Label();
		locationLabel.setImmediate(false);
		locationLabel.setWidth("-1px");
		locationLabel.setHeight("15px");
		locationLabel.setValue("Label");
		locationLabel.addStyleName(Runo.LABEL_SMALL);
		horizontalLayout_1.addComponent(locationLabel);
		
		// companyLabel
		companyLabel = new Label();
		companyLabel.setImmediate(false);
		companyLabel.setWidth("-1px");
		companyLabel.setHeight("15px");
		companyLabel.setValue("label");
		companyLabel.addStyleName(Runo.LABEL_SMALL);
		horizontalLayout_1.addComponent(companyLabel);
		
		return horizontalLayout_1;
	}
	

}
