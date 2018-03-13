package com.connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestAllCountry {

	public static void main(String[] args) {
			String sql = "select * from pays";			
			try {
				PreparedStatement ps= ConnexionBD.getConnection().prepareStatement(sql);
				       ResultSet  result =  ps.executeQuery();
				       if (result.isBeforeFirst()) {
						 while (result.next()) {
							System.out.println(result.getString("nomPays"));
						}
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			ConnexionBD.closeConnection();
		}
}
