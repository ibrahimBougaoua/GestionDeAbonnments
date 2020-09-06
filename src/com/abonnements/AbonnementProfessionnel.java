package com.abonnements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AbonnementProfessionnel extends Abonnement {

    /**
     * @var NRC.
     */
    private int NRC;

    /**
     * Constructer.
     *
     * @param telephone
     * @param NRC
     * @param categorie
     * @param adress
     * @param dateDebut
     * @param dateFin
     *
     */
    AbonnementProfessionnel( int telephone , int NRC , Categorie categorie , Adresse adress , String dateDebut , String dateFin )
    {
        super();
        super.setTelephone(telephone);
        this.setNRC(NRC);
        super.setCategorie(categorie);
        super.setAdress(adress);
        super.setDateDebut(dateDebut);
        super.setDateFin(dateFin);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return " | Date de premeire abonnment : " + super.getDateDebut() + " | " + "  Date de fin de connexion : " + super.getDateFin() + "] " + " Adresse [ Numero : " + super.getAdress().getNumero() + " | Nom : " + super.getAdress().getNom() + " | Code Postal : " + super.getAdress().getCodePostal() + " | Ville : " + super.getAdress().getVille() + " ]";
    }

    /**
     * affiche
     */
    public void affiche() {
        super.getCategorie().affiche();
        System.out.println(this.toString());
    }

    /**
     * @return the NRC
     */
    public int getNRC() {
        return NRC;
    }

    /**
     * @param NRC the NRC to set
     */
    public void setNRC(int NRC) {
        this.NRC = NRC;
    }
}
