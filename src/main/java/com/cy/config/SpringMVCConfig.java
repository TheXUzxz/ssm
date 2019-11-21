package com.cy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
@ComponentScan("com.cy.controller")
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
		@Override
		public void configureDefaultServletHandling(
				DefaultServletHandlerConfigurer configurer) {
			configurer.enable();
		}
		@Override  //视图解析器
		public void configureViewResolvers(
			ViewResolverRegistry registry) {
			registry.jsp("/WEB-INF/pages/", ".html");
		}
}
