package com.br.geo60.poco.artesianos.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/webjars/**", "/css/**", "/img/**", "/js/**").permitAll()
				.antMatchers("/", "/home").permitAll()
				// adm
				//.antMatchers("/adm/**").hasAuthority("ADMIN")
				// usuarios
				// .antMatchers("/adm/**").hasAuthority("USER")
				.anyRequest().authenticated();
				//.and().formLogin()
				//.defaultSuccessUrl("/adm/dashboard", true).failureUrl("/login-error").permitAll().and().logout()
				//.logoutSuccessUrl("/");
	}

}
