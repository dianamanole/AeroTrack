package com.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.entities.Pays;
import com.connexion.ConnexionBD;
import com.entites.Vol;

public class ManagerDAO {
	private static String getAllCountry="select * from pays;";
	public static ArrayList<Pays> getAllPays() {		
		ArrayList<Pays> list = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(getAllCountry);
			ResultSet result = ps.executeQuery();
			if (result.isBeforeFirst()) {				
				list = new ArrayList<>();
				while (result.next()) {
					Pays tara= new Pays();
					tara.setNomPays(result.getString("nomPays"));
					list.add(tara);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConnexionBD.closeConnection();
		
		return list;
	}

    public static ArrayList<Vol> getAllVols() {
        	ArrayList<Vol> listV = null;
		try {
			PreparedStatement ps = ConnexionBD.getConnection().prepareStatement("select * from aerotrack.vol");
			ResultSet result = ps.executeQuery();
			if (result.isBeforeFirst()) {				
				listV = new ArrayList<>();
				while (result.next()) {
					Vol vl= new Vol();
					vl.setNumeroVol(result.getString("numeroVol"));
					listV.add(vl);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConnexionBD.closeConnection();
		
		return listV;
    }
}
