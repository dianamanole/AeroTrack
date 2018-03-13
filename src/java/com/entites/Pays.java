package com.entities;

public class Pays {
	private int idPays;
	private String nomPays;
	
	public Pays(int idPays, String nomPays) {
		super();
		this.idPays = idPays;
		this.nomPays = nomPays;
	}
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdPays() {
		return idPays;
	}
	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
}
