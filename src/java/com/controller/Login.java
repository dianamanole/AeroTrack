package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.AdministrateurAction;
import com.entites.Administrateur;
import com.utils.GestionSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
          PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		Administrateur admin = new Administrateur(id, password);
		GestionSession mySession = new GestionSession();
		boolean connexion = AdministrateurAction.adminExiste(admin);
		System.out.println(connexion);
		request.setAttribute("connexion", connexion);
		if (connexion) {
			mySession.ajouterAdminToSession(request, admin);
			request.getRequestDispatcher("uploadFileAdministrateur.jsp").forward(request, response);
		}
		
		if (!connexion) {
			 out.println("<center><b><font color=red>" + "Le id ou mot de passe invalide" + "</font><b></center>");
			  request.getRequestDispatcher("login.jsp").include(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

