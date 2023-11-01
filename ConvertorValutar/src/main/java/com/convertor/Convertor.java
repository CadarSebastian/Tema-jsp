package com.convertor;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Convertor extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String lei = req.getParameter("ron");
		req.setAttribute("ron", lei);
		String euro = req.getParameter("EURO");
		req.setAttribute("EURO", euro);
		req.getRequestDispatcher("convertorPage.jsp").forward(req, res);
		
	}
}
