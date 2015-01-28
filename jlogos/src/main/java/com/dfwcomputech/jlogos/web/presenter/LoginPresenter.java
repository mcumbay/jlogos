package com.dfwcomputech.jlogos.web.presenter;

import org.vaadin.spring.navigator.Presenter;
import org.vaadin.spring.navigator.annotation.VaadinPresenter;

import com.dfwcomputech.jlogos.web.view.LoginView;

@VaadinPresenter(viewName = LoginView.NAME)
public class LoginPresenter extends Presenter<LoginView> {

}
