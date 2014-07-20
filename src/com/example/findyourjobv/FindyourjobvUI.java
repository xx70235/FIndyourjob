package com.example.findyourjobv;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("findyourjobv")
@SuppressWarnings("serial")
@JavaScript({"http://gdc.indeed.com/ads/apiresults.js"})
public class FindyourjobvUI extends UI {

	
	
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		
		layout.setMargin(true);
		setContent(layout);
		layout.setSizeFull();
		FindYourJobComposite fyjc = new FindYourJobComposite();
		layout.addComponent(fyjc);
//		Button button = new Button("Click Me");
//		button.addClickListener(new Button.ClickListener() {
//			public void buttonClick(ClickEvent event) {
//				layout.addComponent(new Label("Thank you for clicking"));
//			}
//		});
//		layout.addComponent(button);
	}
	
	

}