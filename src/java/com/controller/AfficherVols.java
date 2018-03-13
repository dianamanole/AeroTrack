/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.services.VolsService;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.entites.*;

/**
 *
 * @author usager
 */
public class AfficherVols extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String op1 = request.getParameter("recherche");
        if(op1.equals("A")|| op1.equals("D")){
          if ( !VolsService.afficherVols(request, response, op1)){
                 request.setAttribute("message", "On ne peut pas afficher le vol , un probleme de serveur");
            }
        }
        else{
            HttpSession session =request.getSession(true); 
            ArrayList<Vol> mesVols = (ArrayList<Vol>)session.getAttribute("mesVols");
            if(!VolsService.afficherParJour( request, mesVols, op1))
               request.setAttribute("message", "On ne peut pas afficher les vols, un probleme de serveur est survenue");
        
        }
         //   String pilote = this.getServletContext().getInitParameter("pilote");
            RequestDispatcher r = request.getRequestDispatcher("./afficherVols.jsp");
            r.forward(request, response);     
            
            //        try {
//                request.getRequestDispatcher("afficherVols.jsp").forward(request, response);
//        } catch (ServletException | IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//        }
                    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
