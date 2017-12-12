package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.models.Roster;
import com.codingdojo.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teamId = request.getParameter("id");
		System.out.println("This is the id "+teamId);
		if(teamId == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/NewTeam.jsp");
			view.forward(request, response);
		} else {
			int id = Integer.valueOf(teamId);
			System.out.println("Checking what value of is "+id);
			request.setAttribute("teamId", teamId);
			request.setAttribute("team", Roster.allTeams.get(id));
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/TeamInfo.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String teamName = request.getParameter("name");
			Team t = new Team(teamName);
			Roster.allTeams.add(t);
			response.sendRedirect("/Roster/Home");
	}

}
