package com.dfwcomputech.jlogos.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.vaadin.spring.servlet.SpringAwareVaadinServlet;

public class AppInitializer implements WebApplicationInitializer {

	private static final String CONFIG_LOCATION = "com.dfwcomputech.jlogos.web.config";
	private static final String MVC_MAPPING_URL = "/mvc/*";
	private static final String VAADIN_MAPPING_URL = "/ui/*";
	private static final String VAADIN_STATIC_MAPPING_URL="/VAADIN/*";
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		WebApplicationContext context = getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		
		//Spring MVC Servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
				"DispatcherServlet", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping(MVC_MAPPING_URL);
		
		//Vaadin Servlet
		dispatcher = servletContext.addServlet("VaadinServlet", new SpringAwareVaadinServlet());
		dispatcher.setLoadOnStartup(2);
		dispatcher.addMapping(VAADIN_MAPPING_URL);
		dispatcher.addMapping(VAADIN_STATIC_MAPPING_URL);
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation(CONFIG_LOCATION);
		return context;
	}

}
