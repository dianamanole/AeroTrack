package com.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entites.Administrateur;



public class GestionSession {
	
public void ajouterAdminToSession(HttpServletRequest request,Administrateur admin ){
		
		HttpSession mySession = request.getSession(); 
		mySession.setAttribute(Constante.clefSession,admin);
		
		
	}
public static void detruireSession(HttpServletRequest request,HttpServletResponse response) {
	
	HttpSession session=request.getSession();
	session.invalidate();
	
	
}


}
