package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/getAllBranches")).and()
                .authorizeRequests()
                .antMatchers("/getAllBranches").access("hasRole('ROLE_USER')").and().formLogin().defaultSuccessUrl("/getAllBranches")
                .failureUrl("/logUser")
                .loginPage("/logUser").and().logout().permitAll();

    }


}