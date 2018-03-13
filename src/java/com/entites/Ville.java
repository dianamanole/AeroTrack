package com.entities;

public class Ville {
	private int idVille;
	private String nomVille;
	private int idPays;
	public Ville(int idVille, String nomVille, int idPays) {
		super();
		this.idVille = idVille;
		this.nomVille = nomVille;
		this.idPays = idPays;
	}
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdVille() {
		return idVille;
	}
	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public int getIdPays() {
		return idPays;
	}
	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}
	@Override
	public String toString() {
		return "ville [idVille=" + idVille + ", nomVille=" + nomVille + ", idPays=" + idPays + "]";
	}

}
