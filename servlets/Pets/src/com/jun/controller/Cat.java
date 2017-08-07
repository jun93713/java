package com.jun.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jun.models.Cats;

@WebServlet("/Cat")
public class Cat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cat() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		Double weight = Double.parseDouble(request.getParameter("weight"));

		Cats cat = new Cats(name, breed, weight);
		
		request.setAttribute("cat", cat);
		
		request.getRequestDispatcher("/WEB-INF/views/cat.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
