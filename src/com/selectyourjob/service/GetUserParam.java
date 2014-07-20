package com.selectyourjob.service;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletService;

public class GetUserParam {

	
	public static String getUSerParam()
	{
			// TODO Auto-generated method stub
			VaadinRequest request =	VaadinServletService.getCurrentRequest();
//			HttpServletRequest request = this.getThreadLocalRequest();
			String useragent =URLEncoder.encode(request.getHeader("user-agent"));
			String userIp = request.getRemoteAddr();
		   
			String userParas = useragent+"###"+userIp;
			return userParas;
	}
}
