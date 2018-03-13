/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

/**
 *
 * @author usager
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.entites.*;
import com.DAO.*;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import com.entites.Vol;
import java.io.FileNotFoundException;
import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class VolsService {
    
    public static boolean  afficherVols(HttpServletRequest request, HttpServletResponse response, String recherche)
    throws ServletException, IOException{
        ArrayList<Vol> mesVols ;
        if(recherche.equals("A")){
           mesVols = VolDAO.getParArrives();
        
        }
        else {
          mesVols = VolDAO.getParDepart();
        }
	if(mesVols != null){
            HttpSession session =request.getSession(true);
            session.setAttribute("mesVols", mesVols);
          return true;
        }
        else
            return false; 	
	} 
public static boolean existeVol(String vol) {
        boolean bol=false;
        if(VolDAO.existeVol(vol)){
            bol=true;
        }
        return bol;
    }

    public static boolean getAllFly(HttpServletRequest request) {
        boolean bol=false;
		ArrayList<Vol> listVol = ManagerDAO.getAllVols();
		if(listVol!=null) {
                    HttpSession session =request.getSession(true);                    
			session.setAttribute("listZbor", listVol);
			bol=true;
		}				
		return bol;
    }
    public static boolean afficherParJour(HttpServletRequest request, ArrayList<Vol> mesVols, String op1){
        ArrayList<Vol> temp = new ArrayList<Vol>();
        Date datejour = new Date();
        Date dateDemain = new Date(datejour.getTime() + TimeUnit.DAYS.toMillis( 1 ));
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        if(op1.equals("J")){
            for(int i = 0; i< mesVols.size(); i++)
                if(mesVols.get(i).getDateVol().equals(d.getDateInstance().format(datejour).toString()))
                    temp.add(mesVols.get(i));
        }
        if(op1.equals("L")){
            for(int i = 0; i< mesVols.size(); i++)
                if(mesVols.get(i).getDateVol().equals(d.getDateInstance().format(dateDemain).toString()))
                    temp.add(mesVols.get(i));
        }
        if(temp.size()>0){
        HttpSession session =request.getSession(true);
            request.setAttribute("mesVolsJour", temp);
            request.setAttribute("afficherJour", "oui");
            return true;
        }           
        else{
           return false; 
        
        }
      }

    public static boolean insertFirstFlight(HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException {
  //To change body of generated methods, choose Tools | Templates.
        boolean retour = false;
                ArrayList<Vol> vol = AdministrateurAction.chargerVol();
		if (VolDAO.insertFirst(vol)) {
			retour = true;
		}
		return retour;
    }
    

     }

