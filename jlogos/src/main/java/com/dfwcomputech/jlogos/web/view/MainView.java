package com.dfwcomputech.jlogos.web.view;

import javax.annotation.PostConstruct;

import org.vaadin.spring.annotation.VaadinUIScope;
import org.vaadin.spring.navigator.annotation.VaadinView;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


@VaadinView(name=MainView.NAME)
@VaadinUIScope
public class MainView extends VerticalLayout implements View{

	private static final long serialVersionUID = 1L;
	public static final String NAME="main";
	
	@PostConstruct
	private void init(){
		
        setMargin(true);
        setSpacing(true);
        setSizeFull();
        addComponent(new Label("WELCOME TO JLOGOS!"));

	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
