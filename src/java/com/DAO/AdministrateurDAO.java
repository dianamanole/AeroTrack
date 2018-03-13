package com.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.entites.Administrateur;
import com.connexion.ConnexionBD;
import java.sql.Statement;

public class AdministrateurDAO {

	private static String queryGetyAll = "select * from administrateur";
	private static String queryGetById = "select * from administrateur where idAdministrateur = ?";
	private static String queryInsert = "insert into administrateur(idAdministrateur, nomAdministrateur, prenomAdministrateur, motPasseAdministrateur, emailAdministrateur)  value(?,?,?,?,?)";
 	private static String queryUpdate = "update administrateur set idAdministrateur =?,nomAdministrateur = ?,prenomAdministrateur = ?,motPasseAdministrateur = ?,emailAdministrateur =?";
	private static String querydelete = "delete from administrateur where idAdministrateur = ?";
	private static String queryConnexion = "select * from administrateur where idAdministrateur=? and motPasseAdministrateur=?";

	public static ArrayList<Administrateur> getAll() {
		ArrayList<Administrateur> retour = null;

		try {
			PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(queryGetyAll);

			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst()) {
				
				retour = new ArrayList<>();

				while (result.next()) {
					Administrateur admin = new Administrateur();
					admin.setIdAdministrateur(result.getString("idAdministrateur"));
					admin.setNomAdministrateur(result.getString("nomAdministrateur"));
					admin.setPrenomAdministrateur(result.getString("prenomAdministrateur"));
					admin.setEmailAdministrateur(result.getString("emailAdministrateur"));
					admin.setMotPasseAdministrateur(result.getString("motPasseAdministrateur"));
					retour.add(admin);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConnexionBD.closeConnection();
		
		return retour;
	}
	
	public static Administrateur getById(int id) {
		Administrateur retour = null;

		try {
			PreparedStatement ps = ConnexionBD.getConnection().prepareStatement(queryGetById);
			ps.setInt(1, id);
			
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst()) {
				
				retour = new Administrateur();

				while (result.next()) {					
					retour.setIdAdministrateur(result.getString("idAdministrateur"));
					retour.setNomAdministrateur(result.getString("nomAdministrateur"));
					retour.setPrenomAdministrateur(result.getString("prenomAdministrateur"));
					retour.setEmailAdministrateur(result.getString("emailAdministrateur"));
					retour.setMotPasseAdministrateur(result.getString("motPasseAdministrateur"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnexionBD.closeConnection();
		return retour;
	}
	
	public static boolean insert(Administrateur admin){
		boolean retour = false;
		int nbLigne = 0;
		PreparedStatement ps;
		try {
			ps = ConnexionBD.getConnection().prepareStatement(queryInsert);
			ps.setString(1,admin.getIdAdministrateur());
			ps.setString(2,admin.getNomAdministrateur());
			ps.setString(3,admin.getPrenomAdministrateur());
			ps.setString(4,admin.getMotPasseAdministrateur());
			ps.setString(5,admin.getEmailAdministrateur());

			
			nbLigne = ps.executeUpdate();
			
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
	
	
	public static boolean update(Administrateur admin){
		boolean retour = false;
		int nbLigne = 0;
		PreparedStatement ps;
		try {
			ps = ConnexionBD.getConnection().prepareStatement(queryUpdate);
			ps.setString(1,admin.getIdAdministrateur());
			ps.setString(2,admin.getNomAdministrateur());
			ps.setString(3,admin.getPrenomAdministrateur());
			ps.setString(4,admin.getMotPasseAdministrateur());
			ps.setString(5,admin.getEmailAdministrateur());
			
			
			nbLigne = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(nbLigne >0 )
			retour = true;		
		ConnexionBD.closeConnection();
		return retour;
	}
	
	public static boolean delete(String adminId){
		boolean retour = false;
		int nbLigne = 0;
		PreparedStatement ps;
		try {
			ps = ConnexionBD.getConnection().prepareStatement(querydelete);
			ps.setString(1,adminId);
			
			
			nbLigne = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(nbLigne >0 )
			retour = true;		
		ConnexionBD.closeConnection();
		return retour;
	}
	public static boolean userExiste(Administrateur admin) {
		boolean retour = false;
		PreparedStatement ps;

		int nbEtudiant = 0;
		try {
			
			ps = ConnexionBD.getConnection().prepareStatement(queryConnexion);
			ps.setString(1, admin.getIdAdministrateur());
			ps.setString(2, admin.getMotPasseAdministrateur());
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				nbEtudiant++;
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		if (nbEtudiant >0)
			retour = true;
		
		ConnexionBD.closeConnection();
		return retour;
	}


}

