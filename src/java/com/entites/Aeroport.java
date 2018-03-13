package com.entities;

public class Aeroport {
	private int idAeroport;
	private String nomAeroport;
	private int idCity;
	private int idPays;
	public Aeroport(int idAeroport, String nomAeroport, int idCity, int idPays) {
		super();
		this.idAeroport = idAeroport;
		this.nomAeroport = nomAeroport;
		this.idCity = idCity;
		this.idPays = idPays;
	}
	public Aeroport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAeroport() {
		return idAeroport;
	}
	public void setIdAeroport(int idAeroport) {
		this.idAeroport = idAeroport;
	}
	public String getNomAeroport() {
		return nomAeroport;
	}
	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}
	public int getIdCity() {
		return idCity;
	}
	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}
	public int getIdPays() {
		return idPays;
	}
	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}
	@Override
	public String toString() {
		return "aeroport [idAeroport=" + idAeroport + ", nomAeroport=" + nomAeroport + ", idCity=" + idCity
				+ ", idPays=" + idPays + "]";
	}
	
}
