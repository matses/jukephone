package com.sescosse.jukephone.back.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String[] AUTH_WHITELIST = {

            // -- swagger ui
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**", 
            "/api/jukephone/**",
            "/login",
            "/user"
    };
	
	
	
	public void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers(HttpMethod.POST).permitAll()
				.antMatchers(AUTH_WHITELIST).permitAll()
				//.anyRequest().authenticated()
			.and()
			.csrf().disable();
//				.anyRequest().authenticated();
//				.and()
//			.formLogin().and()
//			.httpBasic();
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("user").password("user").roles("USER").and()
				.withUser("user2").password("user2").roles("USER").and()
				.withUser("owner").password("owner").roles("OWNER").and()
				.withUser("owner2").password("owner").roles("OWNER").and()
				.withUser("admin").password("admin").roles("ADMIN");
		
	}
}
