/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usager
 */
public class Controller extends HttpServlet {

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
        String  operateur = request.getParameter("operateur");

//            if (request.getParameter("bEffacer")!=null) {
//                request.getRequestDispatcher("./clear").forward(request, response);
//                return;
//            }
            if (operateur != null)
            {
                char op = operateur.charAt(0);
                //out.println(op1+op+op2);
                
                RequestDispatcher r = null;
                switch (op)
                {
                    case 'A' :  
                                r = request.getRequestDispatcher("./afficherVols?recherche=A"); //ou : r = this.getServletContext().getNamedDispatcher("Addition");
                                r.forward(request, response);
                                break;
                    case 'D' :  
                                r = request.getRequestDispatcher("./afficherVols?recherche=D");
                                r.forward(request, response);
                                break;
                    case 'J' :  
                                r = request.getRequestDispatcher("./afficherVols?recherche=J");
                                r.forward(request, response);
                               break;
                    case 'L' :  
                               r = request.getRequestDispatcher("./afficherVols?recherche=L");
                               r.forward(request, response);
                               break;
//                    case 'E' :  
//                                r = request.getRequestDispatcher("./clear");
//                                r.forward(request, response);
                }
            }
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
