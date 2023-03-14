package com.rentcar.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rentcar.controller.Controller;
/**
 * Servlet implementation class RentcarFrontController
 */
@WebServlet("*.do")
public class RentcarFrontController extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		String url = req.getRequestURI();
		String ctx = req.getContextPath();
		String command = url.substring(ctx.length());
		System.out.println("command:" + command); // /memberInsert.do
		Controller controller = null;
		String nextPage = null;
		HandlerMapping mapping = new HandlerMapping();
		controller = mapping.getController(command);
		nextPage = controller.requestHandler(req, resp);
		
		
		if(nextPage != null) {
			if(nextPage.indexOf("redirect:")!= -1) {
				resp.sendRedirect(nextPage.split(":")[1]);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher(ViewResolver.makeView(nextPage));
				rd.forward(req, resp);
			}
		}
		
		
	}
	

}
