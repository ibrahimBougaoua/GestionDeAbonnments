package com.abonnements;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AbonnementResidentiel extends Abonnement {

    /**
     * @var NPI.
     */
    private int NPI;

    /**
     * Constructer.
     *
     * @param telephone
     * @param NPI
     * @param categorie
     * @param adress
     * @param dateDebut
     * @param dateFin
     *
     */
    AbonnementResidentiel( int telephone , int NPI ,Categorie categorie , Adresse adress , String dateDebut , String dateFin )
    {
        super();
        super.setTelephone(telephone);
        this.setNPI(NPI);
        super.setCategorie(categorie);
        super.setAdress(adress);
        super.setDateDebut(dateDebut);
        super.setDateFin(dateFin);
        super.setEtat("Access");
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[ Etat Internet : " + super.getEtat() + " | Date de premeire abonnment : " + super.getDateDebut() + " | " + "  Date de fin de connexion : "+ super.getDateFin() + "] Adresse [ Numero : " + super.getAdress().getNumero() + " | Nom : " + super.getAdress().getNom() + " | Code Postal : " + super.getAdress().getCodePostal() + " | Ville : " + super.getAdress().getVille() + " ]";
    }

    /**
     * affiche
     */
    public void affiche() {
        //System.out.print("[ Nom Client : " + PersonneIndividu.getPrenomIndividu(this.getNPI()));
        super.getCategorie().affiche();
        System.out.println(this.toString());
    }

    /**
     * @return the NPI
     */
    public int getNPI() {
        return NPI;
    }

    /**
     * @param NPI the NPI to set
     */
    public void setNPI(int NPI) {
        this.NPI = NPI;
    }
}