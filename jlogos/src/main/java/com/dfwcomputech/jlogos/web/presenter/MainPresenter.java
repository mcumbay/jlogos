package com.dfwcomputech.jlogos.web.presenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.spring.events.Event;
import org.vaadin.spring.events.EventScope;
import org.vaadin.spring.events.annotation.EventBusListenerMethod;
import org.vaadin.spring.navigator.Presenter;
import org.vaadin.spring.navigator.annotation.VaadinPresenter;

import com.dfwcomputech.jlogos.web.event.Action;
import com.dfwcomputech.jlogos.web.event.StartupFilter;
import com.dfwcomputech.jlogos.web.view.MainView;

@VaadinPresenter(viewName = MainView.NAME)
public class MainPresenter extends Presenter<MainView> {

	private Logger log = LoggerFactory.getLogger(getClass());

	@EventBusListenerMethod(scope=EventScope.SESSION,filter=StartupFilter.class)
	public void onStartup(Event<Action> event) {
		log.debug("starting up Presenter....");
	}
}
