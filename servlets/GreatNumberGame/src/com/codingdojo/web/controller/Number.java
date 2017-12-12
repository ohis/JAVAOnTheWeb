package com.codingdojo.web.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Number
 */
@WebServlet("/Number")
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Number() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Random num = new Random();
		Integer answer = (Integer) session.getAttribute("answer");
		String result = (String) session.getAttribute("result");
		System.out.println(answer);
		if(answer == null) {
			Integer randomNumber = num.nextInt(100) + 1;
			session.setAttribute("answer", randomNumber);
			
		}
		
		if(result == null) {
			session.setAttribute("result", "");
		}
				
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String restart = (String)request.getParameter("restart");
		System.out.println("am in post restart " + restart);
		if(restart != null) {
			session.setAttribute("answer", null);
			System.out.println("am in post answer");
			session.setAttribute("result", null);
		}else {
			Integer guess = Integer.parseInt(request.getParameter("guess"));
			Integer answer = (Integer)session.getAttribute("answer");
			
			if(guess > answer) {
				session.setAttribute("result", "Too high");
			}else if(guess < answer) {
				session.setAttribute("result","Too low");
			}else {
				session.setAttribute("result", "Correct");
			}
			
		}
		 response.sendRedirect("/GreatNumberGame/Number");
		//doGet(request, response);
	}

}
