
package com.mvc2.viewrsolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Component
public class ViewResolver extends InternalResourceViewResolver{
	
	public ViewResolver() {
		this.setPrefix("/");
		this.setSuffix(".jsp") ;
	}
}
