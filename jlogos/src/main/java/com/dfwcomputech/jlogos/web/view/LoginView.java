package com.dfwcomputech.jlogos.web.view;

import javax.annotation.PostConstruct;

import org.vaadin.spring.annotation.VaadinUIScope;
import org.vaadin.spring.navigator.annotation.VaadinView;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@VaadinView(name = LoginView.NAME)
@VaadinUIScope
public class LoginView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	public static final String NAME = "login";

	private TextField user;
	private PasswordField password;
	private Button login;
	private Button forgotPassword;
	
	@PostConstruct
	public void init() {
		FormLayout loginForm = new FormLayout();
		
		loginForm.addComponent(user=new TextField("User"));
		loginForm.addComponent(password= new PasswordField("Password"));
		
		CssLayout buttons = new CssLayout();
		buttons.addComponent(login= new Button("Login"));
		buttons.addComponent(forgotPassword= new Button("Forgot Password"));
		loginForm.addComponent(buttons);
		
		addComponent(loginForm);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
