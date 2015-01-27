package com.dfwcomputech.jlogos.web.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.annotation.VaadinUI;
import org.vaadin.spring.events.EventBus;
import org.vaadin.spring.events.EventScope;

import com.dfwcomputech.jlogos.common.model.User;
import com.dfwcomputech.jlogos.web.event.Action;
import com.dfwcomputech.jlogos.web.presenter.LoginPresenter;
import com.dfwcomputech.jlogos.web.presenter.MainPresenter;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;


@VaadinUI
@Title("Logos App")
public class MyUI extends UI {
	private static final long serialVersionUID = 1L;

	@Autowired
	private EventBus eventBus;
	@Autowired
	private MainPresenter mainPresenter;
	@Autowired
	private LoginPresenter loginPresenter;
	
	private User principal;
	
	@Override
	protected void init(VaadinRequest request) {
		
		eventBus.publish(EventScope.SESSION, this,Action.START);
		if(principal== null)
			setContent(loginPresenter.getView());
		else{
			setContent(mainPresenter.getView());
		}	
			
	}

}
