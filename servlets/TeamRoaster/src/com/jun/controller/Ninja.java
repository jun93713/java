package com.jun.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jun.models.Player;
import com.jun.models.Team;

/**
 * Servlet implementation class Ninja
 */
@WebServlet("/Ninja")
public class Ninja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ninja() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Team> teams = (ArrayList<Team>) request.getSession().getAttribute("teams");
		Integer id = Integer.parseInt(request.getParameter("id"));
		Team team = teams.get(id);
		request.setAttribute("team", team);
		request.setAttribute("id", id);

		
		
		request.getRequestDispatcher("/WEB-INF/views/ninja.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Team> teams = (ArrayList<Team>) request.getSession().getAttribute("teams");
		Integer id = Integer.parseInt(request.getParameter("id"));
		Team team = teams.get(id);
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		Integer age = Integer.parseInt(request.getParameter("age"));
		
		Player player = new Player(fname, lname, age);
		
		team.addPlayer(player);
		
		response.sendRedirect("/TeamRoaster/Home");
	}

}
