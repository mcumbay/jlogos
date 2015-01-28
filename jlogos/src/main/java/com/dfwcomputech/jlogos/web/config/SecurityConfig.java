package com.dfwcomputech.jlogos.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	public static enum ROLE {
		ADMIN, USER;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password")
				.roles("USER").and().withUser("admin").password("admin")
				.roles(ROLE.USER.name(), ROLE.ADMIN.name());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        // all requests are authenticated
        //http.authorizeRequests().anyRequest().authenticated();
        
		http.formLogin().and()
			.authorizeRequests().antMatchers("/mvc/admin/**").hasRole(ROLE.ADMIN.name()).and()
			.authorizeRequests().antMatchers("/mvc/").hasRole(ROLE.USER.name()).and()
		    .authorizeRequests().anyRequest().permitAll();
		http.csrf().disable();

	}
}
