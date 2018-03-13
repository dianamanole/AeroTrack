/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Diana
 */
public class Vol implements Serializable {
    
    private String numeroVol;
    private String nomCompagnie;
    private String nomAeroport;
    private String nomPays;
    private String nomVille;
    private String destinationVol;
    private String typeVol;
    private String etatVol;
    private String porteVole;
    private String dateVol;
    private String heurePrevueVol;
    private String heureReelVol;

    public String getNumeroVol() {
        return numeroVol;
    }


    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }

    public void setNomCompagnie(String nomCompagnie) {
        this.nomCompagnie = nomCompagnie;
    }

    public String getNomAeroport() {
        return nomAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }




    public Vol(String numeroVol, String nomCompagnie, String nomAeroport, String nomPays, String nomVille, String destinationVol, String typeVol, String etatVol, String porteVole, String dateVol, String heurePrevueVol, String heureReelVol) {
        this.numeroVol = numeroVol;
        this.nomCompagnie = nomCompagnie;
        this.nomAeroport = nomAeroport;
        this.nomPays = nomPays;
        this.nomVille = nomVille;
        this.destinationVol = destinationVol;
        this.typeVol = typeVol;
        this.etatVol = etatVol;
        this.porteVole = porteVole;
        this.dateVol = dateVol;
        this.heurePrevueVol = heurePrevueVol;
        this.heureReelVol = heureReelVol;
    }

    public Vol(String numeroVol, String nomCompagnie, String nomAeroport, String nomPays, String nomVille, String destinationVol, String typeVol, String etatVol, String porteVole, String heurePrevueVol) {
        this.numeroVol = numeroVol;
        this.nomCompagnie = nomCompagnie;
        this.nomAeroport = nomAeroport;
        this.nomPays = nomPays;
        this.nomVille = nomVille;
        this.destinationVol = destinationVol;
        this.typeVol = typeVol;
        this.etatVol = etatVol;
        this.porteVole = porteVole;
        this.heurePrevueVol = heurePrevueVol;
    }

    public Vol(String numeroVol, String nomCompagnie, String nomAeroport, String destinationVol, String typeVol, String porteVole, String dateVol, String heurePrevueVol) {
        this.numeroVol = numeroVol;
        this.nomCompagnie = nomCompagnie;
        this.nomAeroport = nomAeroport;
        this.destinationVol = destinationVol;
        this.typeVol = typeVol;
        this.porteVole = porteVole;
        this.dateVol = dateVol;
        this.heurePrevueVol = heurePrevueVol;
    }

    public Vol() {
    }




    public String getDestinationVol() {
        return destinationVol;
    }

    public void setDestinationVol(String destinationVol) {
        this.destinationVol = destinationVol;
    }

    public String getTypeVol() {
        return typeVol;
    }

    public void setTypeVol(String typeVol) {
        this.typeVol = typeVol;
    }

    public String getEtatVol() {
        return etatVol;
    }

    public void setEtatVol(String etatVol) {
        this.etatVol = etatVol;
    }

    public String getPorteVole() {
        return porteVole;
    }

    public void setPorteVole(String porteVole) {
        this.porteVole = porteVole;
    }

    public String getDateVol() {
        return dateVol;
    }

    public void setDateVol(String dateVol) {
        this.dateVol = dateVol;
    }

    public String getHeurePrevueVol() {
        return heurePrevueVol;
    }

    public void setHeurePrevueVol(String heurePrevueVol) {
        this.heurePrevueVol = heurePrevueVol;
    }

    public String getHeureReelVol() {
        return heureReelVol;
    }

    public void setHeureReelVol(String heureReelVol) {
        this.heureReelVol = heureReelVol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.numeroVol);
        hash = 53 * hash + Objects.hashCode(this.nomCompagnie);
        hash = 53 * hash + Objects.hashCode(this.destinationVol);
        hash = 53 * hash + Objects.hashCode(this.dateVol);
        hash = 53 * hash + Objects.hashCode(this.heurePrevueVol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vol other = (Vol) obj;
        if (!Objects.equals(this.numeroVol, other.numeroVol)) {
            return false;
        }
        if (!Objects.equals(this.nomCompagnie, other.nomCompagnie)) {
            return false;
        }
        if (!Objects.equals(this.destinationVol, other.destinationVol)) {
            return false;
        }
        if (!Objects.equals(this.dateVol, other.dateVol)) {
            return false;
        }
        if (!Objects.equals(this.heurePrevueVol, other.heurePrevueVol)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Vol{" + "numeroVol=" + numeroVol + ", nomCompagnie=" + nomCompagnie + ", nomAeroport=" + nomAeroport + ", nomPays=" + nomPays + ", nomVille=" + nomVille + ", destinationVol=" + destinationVol + ", typeVol=" + typeVol + ", etatVol=" + etatVol + ", porteVole=" + porteVole + ", dateVol=" + dateVol + ", heurePrevueVol=" + heurePrevueVol + ", heureReelVol=" + heureReelVol + '}';
    }

}
