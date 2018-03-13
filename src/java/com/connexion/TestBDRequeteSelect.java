package com.connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBDRequeteSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from administrateur";
		
		try {
			PreparedStatement ps= ConnexionBD.getConnection().prepareStatement(sql);
			       ResultSet  result =  ps.executeQuery();
			       if (result.isBeforeFirst()) {
					 while (result.next()) {
						System.out.println(result.getString("nomAdministrateur"));
					}
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ConnexionBD.closeConnection();

	}

}
