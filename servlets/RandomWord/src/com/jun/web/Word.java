package com.jun.web;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Word")
public class Word extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Word() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer counter = (Integer) session.getAttribute("counter");
		Random random = new Random();
		String word = "";
		String[] alphaNum = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String time = (String) session.getAttribute("time");
		Date date = new Date();
		
		if(counter==null) {
			session.setAttribute("counter", 0);
		}
		else {
			session.setAttribute("counter", ++counter);
		}
		
		if(time==null) {
			time = "You haven't generated a word yet";
			session.setAttribute("time", date.toString());
		}else {
			session.setAttribute("time", date.toString());
		}

		
		for(int i = 0; i < 10; i ++) {
			word += alphaNum[random.nextInt(alphaNum.length)];
		}
		
		
		
		request.setAttribute("counter", counter);
		request.setAttribute("time", time);
		request.setAttribute("word", word);
		
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
