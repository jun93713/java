package com.jun.web;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Home() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random();
		HttpSession session = request.getSession();
		session.setAttribute("number", random.nextInt(99) + 1);
		session.setAttribute("result", null);
		
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer guess = Integer.parseInt(request.getParameter("guess"));
		Integer number = (Integer) session.getAttribute("number");
		
		if(guess < number ) {
			session.setAttribute("result", "low");
		}
		else if( guess > number ) {
			session.setAttribute("result", "high");
		}
		else {
			session.setAttribute("result", "equal");
		}
		
		
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

}
