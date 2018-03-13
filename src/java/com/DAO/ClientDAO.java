/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.connexion.ConnexionBD;
import com.entites.Client;
import com.entites.Vol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cornel
 */
public class ClientDAO {
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
     public static boolean isExist(String phone){
         boolean bol=false;
         Connection con = ConnexionBD.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from aerotrack.client where client.telephoneClient=?");
                        ps.setString(1, phone);
			ResultSet res = ps.executeQuery();			
			if(res.isBeforeFirst()){
			while (res.next()) {
				bol=true;
                            }   
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
         return bol;
     }
     public static Client getClient(String phone){
         Connection con = ConnexionBD.getConnection();
        Client cl=new Client();  
		try {
			PreparedStatement ps = con.prepareStatement("select * from aerotrack.client where client.telephoneClient=?");
                        ps.setString(1, phone);
			ResultSet res = ps.executeQuery();			
			if(res.isBeforeFirst()){
			while (res.next()) {
				cl.setId(res.getInt("IdClient"));
                                cl.setNumeroTelephone(res.getString("telephoneClient"));
                            }   
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return cl;
     }
    public static boolean setNewClient(String phone) {
        Connection con = ConnexionBD.getConnection();
        Client cl=new Client();
        Client precedant =getClient(phone);
        boolean bol=false;
		try {                   
			PreparedStatement ps = con.prepareStatement("INSERT INTO aerotrack.client (`telephoneClient`) VALUES ( ?);");
                        ps.setString(1,phone);
			int res = ps.executeUpdate();
				if(res>0)
                                    bol=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                ConnexionBD.closeConnection();
		return bol;
	}
     public static boolean setClientVol(Client cl, String vol) {
        Connection con = ConnexionBD.getConnection();
        boolean bol=false;
		try {   				
                        PreparedStatement ps1 = con.prepareStatement("INSERT INTO aerotrack.clientvol (`numeroVol`, `idClient`) VALUES (?,?);");
                        ps1.setString(1,vol);
                        ps1.setInt(2, cl.getId());                        
			int res1 = ps1.executeUpdate();
				if(res1>0)
                                    bol=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                ConnexionBD.closeConnection();
		return bol;
	}

    public static boolean existClientVol(Client cl, String vol) {
       Connection con = ConnexionBD.getConnection();
        boolean bol=false;
		try {   				
                        PreparedStatement ps = con.prepareStatement("SELECT * FROM aerotrack.clientvol WHERE clientvol.idClient=? and clientvol.numeroVol=?;");
                        
                        ps.setInt(1, cl.getId()); 
                        ps.setString(2,vol);
			ResultSet res = ps.executeQuery();
			if(res.isBeforeFirst()){
			while (res.next()) {
                            bol=true;
                        } }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                ConnexionBD.closeConnection();
		return bol;
	}
}
