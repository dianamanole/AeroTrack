/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cornel
 */
public class TestClientVol {
    public static void main(String[] args) {
		
		try {
			PreparedStatement ps= ConnexionBD.getConnection().prepareStatement("INSERT INTO aerotrack.client (`idClient`, `telephoneClient`) VALUES (?,?);");
                        ps.setString(1, "8");
                        ps.setString(2, "5146667771");
			       int  result =  ps.executeUpdate();
                         PreparedStatement ps1= ConnexionBD.getConnection().prepareStatement("INSERT INTO aerotrack.clientvol (`numeroVol`, `idClient`) VALUES (?,?);");
                        ps1.setString(1, "cc111");
                        ps1.setString(2, "8");
			       int  result1 =  ps1.executeUpdate();                               
                               
					if(result>0&&result1>0)
                                            System.out.println("reussi");
                                        else
                                            System.out.println("non reussi");
		}				
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		ConnexionBD.closeConnection();

	}

}
