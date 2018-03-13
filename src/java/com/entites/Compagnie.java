package com.entities;

public class Compagnie {
	private String nomCompagnie;
	private int idCompagnie;
	public Compagnie(String nomCompagnie, int idCompagnie) {
		super();
		this.nomCompagnie = nomCompagnie;
		this.idCompagnie = idCompagnie;
	}
	public Compagnie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNomCompagnie() {
		return nomCompagnie;
	}
	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}
	public int getIdCompagnie() {
		return idCompagnie;
	}
	public void setIdCompagnie(int idCompagnie) {
		this.idCompagnie = idCompagnie;
	}
	
}
