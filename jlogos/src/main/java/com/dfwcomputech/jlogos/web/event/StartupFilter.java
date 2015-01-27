package com.dfwcomputech.jlogos.web.event;

import org.vaadin.spring.events.EventBusListenerMethodFilter;

public class StartupFilter implements EventBusListenerMethodFilter{

	@Override
	public boolean filter(Object payload) {
	       boolean result = false;
	        if (Action.class.isAssignableFrom(payload.getClass())) {
	            Action action = (Action) payload;
	            if (action.equals(Action.START)) {
	                result = true;
	            }
	        }
	        return result;
	}

}
