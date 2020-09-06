package com.abonnements;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Vector;

public class Abonnement {

    /**
     * @var id.
     */
    private static int id = 0;

    /**
     * @var numero.
     */
    private int numero;

    /**
     * @var telephone.
     */
    private int telephone;

    /**
     * @var categorie.
     */
    private Categorie categorie;

    /**
     * @var adress.
     */
    private Adresse adress;

    /**
     * @var dateDebut.
     */
    private String dateDebut;

    /**
     * @var dateFin.
     */
    private String dateFin;

    /**
     * @var etat.
     */
    private String etat;

    /**
     * @var abonnements.
     */
    private static Vector<Abonnement> abonnements = new Vector<Abonnement>();

    /**
     * Constructer.
    */
    Abonnement()
    {
        this.setId(this.getId() + 1);
        this.setNumero(this.getId());
    }

    /**
     * recharcherTelephone
     *
     * @param telephone
     *
     * @return boolean
     */
    boolean recharcherTelephone( int telephone )
    {
        Iterator<Abonnement> value = this.getAbonnements().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((Abonnement) value.next()).getTelephone() == telephone )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * @param p
     */
    static void ajouterAbonnements( Abonnement p )
    {
        getAbonnements().add(p);
    }

    /**
     * static afficheTousAbonnements
     */
    static void afficheTousAbonnements()
    {
        Iterator<Abonnement> value = getAbonnements().iterator();
        // Loop while collection has items
        while( value.hasNext() ){
             value.next();
        } // remove the current Name or Item
    }

    /**
     * @return the abonnements
     */
    public static Vector<Abonnement> getAbonnements() {
        return abonnements;
    }

    /**
     * @param abonnements the abonnements to set
     */
    public static void setAbonnements(Vector<Abonnement> abonnements) {
        Abonnement.abonnements = abonnements;
    }

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param iD the id to set
     */
    public static void setId(int iD) {
        id = iD;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the adress
     */
    public Adresse getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(Adresse adress) {
        this.adress = adress;
    }

    /**
     * @return the dateDebut
     */
    public String getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }

}