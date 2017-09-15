package com.bdgolka.tutorial.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String emailSupport1;

	public InitParamServlet() {

	}

	// This method is always called once after the Servlet object is called
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		// Get the value if the initialization parameter of the Servlet
		// (According to the Configuration of the Sevlet in web.xml)
		this.emailSupport1 = config.getInitParameter("emailSupport1");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {

		// Get the initialization parameters value in a different way
		String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");

		ServletOutputStream out = responce.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Init Param</title></head>");

		out.println("<body>");
		out.println("<h3>Init Param</h3>");
		out.println("<p>emailSupport1 = " + this.emailSupport1 + "</p>");
		out.println("<p>emailSupport2 = " + emailSupport2 + "</p>");
		out.println("</body>");
		out.println("<html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse responce) throws ServletException, IOException {
			super.doGet(request, responce);
	}
}
