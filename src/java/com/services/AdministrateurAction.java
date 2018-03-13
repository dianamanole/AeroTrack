/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.DAO.AdministrateurDAO;
import com.entites.Administrateur;
import com.entites.Vol;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Diana
 */
public class AdministrateurAction {
    
    	public static boolean afficherAdmionistrateur(HttpServletRequest request) {
		boolean retour = false;

		ArrayList<Administrateur> mesAdmin = AdministrateurDAO.getAll();

		request.setAttribute("listeAdmins", mesAdmin);

		return (mesAdmin != null ? true : false);
	}


	public static boolean afficherAdministrateurParId(HttpServletRequest request, int id) {
		

		Administrateur admin = AdministrateurDAO.getById(id);
	
		request.setAttribute("admin", admin);

		return (admin != null ? true : false);
	}

	public static boolean insertAdministrateur(Administrateur adminToInsert) {
		boolean retour = false;

		if (AdministrateurDAO.insert(adminToInsert)) {
			retour = true;
		}

		return retour;
	}

	public static boolean updateAdministrateur(Administrateur adminToUpdate) {
		boolean retour = false;

		if (AdministrateurDAO.update(adminToUpdate)) {
			retour = true;
		}

		return retour;
	}

	public static boolean deleteEtudiant(String idAdmin){
		boolean retour= false;		
		
		if(AdministrateurDAO.delete(idAdmin))
			retour =true;
		
		return retour;
	}
	public static boolean adminExiste (Administrateur admnin){
	 	boolean retour = false ;
	 			if(AdministrateurDAO.userExiste(admnin))
	 				retour =true;
	 	return  retour;
	}
        
        public static ArrayList <Vol> chargerVol() throws FileNotFoundException{
        Scanner scn = new Scanner(new File("C:\\Users\\Diana\\Desktop\\Projet Final\\OneDrive_2_2018-03-12\\AeroTrackProjet\\web\\vols_final.txt"));
        ArrayList <Vol> maListe = new ArrayList<>();
        String li ="";
        String numeroVol ="";
        String nomCompagnie ="";
        String nomAeroport ="";
        String destinationVol ="";
        String typeVol ="";
        String porteVole ="";
        String dateVol ="";
        String heurePrevueVol ="";
        while (scn.hasNextLine()){
            li=scn.nextLine();
            Scanner scn2 = new Scanner(li);
            scn2.useDelimiter(",");
            numeroVol = scn2.next();
            nomCompagnie = scn2.next();
            nomAeroport = scn2.next();
            destinationVol = scn2.next();
            typeVol = scn2.next();
            porteVole = scn2.next();
            dateVol = scn2.next();
            heurePrevueVol =scn2.next();
            maListe.add(new Vol(numeroVol, nomCompagnie, nomAeroport, destinationVol, typeVol, porteVole, dateVol, heurePrevueVol));
        } 
        if (!maListe.isEmpty())
            return maListe;
        else return  null;
       
        }
}
