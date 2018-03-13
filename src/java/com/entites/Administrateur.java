/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diana
 */

public class Administrateur implements Serializable {

    private String idAdministrateur;
    private String nomAdministrateur;
    private String prenomAdministrateur;
    private String motPasseAdministrateur;
    private String emailAdministrateur;

    public Administrateur() {
    }

    public Administrateur(String idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    public Administrateur(String idAdministrateur, String motPasseAdministrateur) {
        this.idAdministrateur = idAdministrateur;
        this.motPasseAdministrateur = motPasseAdministrateur;
    }

    public Administrateur(String idAdministrateur, String nomAdministrateur, String prenomAdministrateur, String motPasseAdministrateur, String emailAdministrateur) {
        this.idAdministrateur = idAdministrateur;
        this.nomAdministrateur = nomAdministrateur;
        this.prenomAdministrateur = prenomAdministrateur;
        this.motPasseAdministrateur = motPasseAdministrateur;
        this.emailAdministrateur = emailAdministrateur;
    }

    public String getIdAdministrateur() {
        return idAdministrateur;
    }

    public void setIdAdministrateur(String idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    public String getNomAdministrateur() {
        return nomAdministrateur;
    }

    public void setNomAdministrateur(String nomAdministrateur) {
        this.nomAdministrateur = nomAdministrateur;
    }

    public String getPrenomAdministrateur() {
        return prenomAdministrateur;
    }

    public void setPrenomAdministrateur(String prenomAdministrateur) {
        this.prenomAdministrateur = prenomAdministrateur;
    }

    public String getMotPasseAdministrateur() {
        return motPasseAdministrateur;
    }

    public void setMotPasseAdministrateur(String motPasseAdministrateur) {
        this.motPasseAdministrateur = motPasseAdministrateur;
    }

    public String getEmailAdministrateur() {
        return emailAdministrateur;
    }

    public void setEmailAdministrateur(String emailAdministrateur) {
        this.emailAdministrateur = emailAdministrateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdministrateur != null ? idAdministrateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrateur)) {
            return false;
        }
        Administrateur other = (Administrateur) object;
        if ((this.idAdministrateur == null && other.idAdministrateur != null) || (this.idAdministrateur != null && !this.idAdministrateur.equals(other.idAdministrateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entites.Administrateur[ idAdministrateur=" + idAdministrateur + " ]";
    }
    
}
