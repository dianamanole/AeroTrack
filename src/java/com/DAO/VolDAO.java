/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

/**
 *
 * @author usager
 */
import java.util.ArrayList;

import com.connexion.ConnexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entites.*;
import java.util.Iterator;
public class VolDAO {
private static String queryInsertFirstFlight =  "INSERT into vol(numeroVol, nomCompagnie, nomAeroport, destinationVol, typeVol, porteVole, dateVol, heurePrevueVol) values (?,?,?,?,?,?,?,?);";
    
    public static ArrayList<Vol> getAll(){
		ArrayList<Vol> mesVols = null;
		String query ="select * from vols";
		
		Connection con = ConnexionBD.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			
			if(result.isBeforeFirst()){
				mesVols = new ArrayList<Vol>();
			}
			
			while (result.next()) {
				Vol v = new Vol();
				v.setNumeroVol(result.getString("numeroVol"));
				v.setTypeVol(result.getString("typeVol"));
                                v.setEtatVol(result.getString("etatVol"));
				
				mesVols.add(v);
                                
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return mesVols;
	}
public static ArrayList<Vol> getParArrives(){
		ArrayList<Vol> mesVols = null;
		String query ="select * from vol where typeVol = 'Arrivee'; ";
		
		Connection con = ConnexionBD.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			
			if(result.isBeforeFirst()){
				mesVols = new ArrayList<Vol>();
			}
			
			while (result.next()) {
				Vol v = new Vol();
				v.setNumeroVol(result.getString("numeroVol"));
				v.setTypeVol(result.getString("typeVol"));
                                v.setEtatVol(result.getString("etatVol"));
                                v.setDateVol(result.getString("dateVol"));
                                v.setHeurePrevueVol(result.getString("heurePrevueVol"));
                                v.setNomCompagnie(result.getString("nomCompagnie"));
                                v.setDestinationVol(result.getString("destinationVol"));
				
				mesVols.add(v);
                                
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return mesVols;
	}
public static ArrayList<Vol> getParDepart(){
		ArrayList<Vol> mesVols = null;
		String query ="select * from vol where typeVol = 'Depart' ;";
		
		Connection con = ConnexionBD.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			
			if(result.isBeforeFirst()){
				mesVols = new ArrayList<Vol>();
			}
			
			while (result.next()) {
				Vol v = new Vol();
				v.setNumeroVol(result.getString("numeroVol"));
				v.setTypeVol(result.getString("typeVol"));
                                v.setEtatVol(result.getString("etatVol"));
                                v.setDateVol(result.getString("dateVol"));
                                v.setHeurePrevueVol(result.getString("heurePrevueVol"));
                                v.setNomCompagnie(result.getString("nomCompagnie"));
                                v.setDestinationVol(result.getString("destinationVol"));
				
				mesVols.add(v);
                                
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return mesVols;
	}
   public static boolean existeVol(String vol){		
	int nVol=0;	
       Connection con = ConnexionBD.getConnection();		
		try {
			PreparedStatement ps = con.prepareStatement("select *from aerotrack.vol where vol.numeroVol=?");
                        ps.setString(1,vol);
			ResultSet result = ps.executeQuery();			
			if(result.isBeforeFirst()){				
			while (result.next()) {
                             nVol++;                              
			}
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (nVol>1?true:false);
	}
           public static boolean insertFirst(ArrayList <Vol> vol){
		boolean retour = false;
                Connection con = ConnexionBD.getConnection();
                int nbLigne = 0;
		PreparedStatement ps;
		try {
                        //Iterator<Vol> it = vol.iterator();
                    for(int i = 0; i< vol.size(); i++){
                        ps = con.prepareStatement(queryInsertFirstFlight);    
			ps.setString(1,vol.get(i).getNumeroVol());
			ps.setString(2,vol.get(i).getNomCompagnie());
			ps.setString(3,vol.get(i).getNomAeroport());
			ps.setString(4,vol.get(i).getDestinationVol());
			ps.setString(5,vol.get(i).getTypeVol());
			ps.setString(6,vol.get(i).getPorteVole());
			ps.setString(7,vol.get(i).getDateVol());
			ps.setString(8,vol.get(i).getHeurePrevueVol());
			ps.executeUpdate();
                        nbLigne++;
                        }

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//		System.out.println("nb ligne " + nbLigne);
		if(nbLigne >0 )
			retour = true;		
		ConnexionBD.closeConnection();
		return retour;
	}

}
