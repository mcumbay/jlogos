package com.dfwcomputech.jlogos.web.ui;

import org.vaadin.spring.annotation.VaadinUI;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@VaadinUI
public class MyUI extends UI {
	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		setContent(new Label("This is Vaadin"));
	}

}
