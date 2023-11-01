package com.laptop;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Brand extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String laptopBrand = req.getParameter("brand");
		//int brandLength = laptopBrand.length();nu mio reusit nicicum asa
		req.setAttribute("brand", laptopBrand);
		//req.setAttribute("brandLength", brandLength);
		
		
		
		
		req.getRequestDispatcher("brandPage.jsp").forward(req, res);
	}
}
