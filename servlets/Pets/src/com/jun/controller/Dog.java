package com.jun.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jun.models.Cats;
import com.jun.models.Dogs;

@WebServlet("/Dog")
public class Dog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Dog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		Double weight = Double.parseDouble(request.getParameter("weight"));

		Dogs dog = new Dogs(name, breed, weight);
		
		request.setAttribute("dog", dog);
		
		request.getRequestDispatcher("/WEB-INF/views/dog.jsp").forward(request, response);	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
