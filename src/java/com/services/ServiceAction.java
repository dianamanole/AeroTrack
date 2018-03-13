package com.services;

import com.DAO.ClientDAO;
import static com.DAO.ClientDAO.getClient;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.entities.Pays;
import com.DAO.ManagerDAO;
import com.DAO.VolDAO;
import com.entites.Client;
import com.entites.Vol;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServiceAction {
	
//	public static boolean getAllCountry(HttpServletRequest request) {
//		boolean bol=false;
//		ArrayList<Pays> list = ManagerDAO.getAllPays();
//		if(list!=null) {
//                    HttpSession session =request.getSession(true);                    
//			session.setAttribute("list", list);
//			bol=true;
//		}				
//		return bol;		
//	}        
    public static boolean enregistreClient(HttpServletRequest request, HttpServletResponse response, String phone, String vol) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Client cl;
        String url="";
        if(ClientDAO.isExist(phone)){
            cl=ClientDAO.getClient(phone);  
            if(!ClientDAO.existClientVol(cl, vol)){
                if(ClientDAO.setClientVol(cl, vol))
                       //url="./enregistrement.jsp"; 
                    return true;
          } else{ 
            request.setAttribute("confirm","Vous etez deja inscrit pour recevoir des notifications pour le vol "+vol);
            //url="./enregistrement.jsp";
            return true;
            }  
        }else if(ClientDAO.setNewClient(phone)){  
            Client precedant =ClientDAO.getClient(phone);
                if(ClientDAO.setClientVol(precedant, vol)){
                    out.println("<center><b><font color=red>" + "Vous etez inscrit avec succes" + "</font><b></center>");
                     //url="./enregistrement.jsp"; 
                     return true;
                }
            }
       // request.getRequestDispatcher(url).forward(request, response);
       return true;
    }  
}
