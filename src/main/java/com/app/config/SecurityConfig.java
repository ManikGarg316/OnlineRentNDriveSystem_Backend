package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) 
			throws Exception {
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http)
			throws Exception {
		http.authorizeRequests()
		.antMatchers("/","/home","/signup","/login").permitAll()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/bookings").hasAuthority("USER")
//		.antMatchers("/std").hasAnyAuthority("ADMIN,EMPLOYEE")
		.anyRequest().authenticated()

		.and()
		.formLogin()
//		.loginPage("/showlog") //it will show login page
		.loginProcessingUrl("/login") //<form action=''> ,on click Login button
		.defaultSuccessUrl("/home",true)
//		.failureUrl("/showlog?error") //on login failed

		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/showlog?success")//logout success

		.and()
		.exceptionHandling()
//		.accessDeniedPage("/denied")
		;
	}
}
