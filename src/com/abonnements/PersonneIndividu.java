package com.abonnements;

import java.util.*;
import java.text.SimpleDateFormat;

public class PersonneIndividu extends Client {

    /**
     * @var NPI.
     */
    private int NPI;

    /**
     * @var nom.
     */
    private String nom;

    /**
     * @var prenom.
     */
    private String prenom;

    /**
     * @var date.
     */
    private String date;

    /**
     * @var personneIndividu.
     */
    private static Vector<PersonneIndividu> personneIndividu = new Vector<PersonneIndividu>();

    /**
     * @var abonnementResidentiel.
     */
    private static Vector<AbonnementResidentiel> abonnementResidentiel = new Vector<AbonnementResidentiel>();

    /**
     * @var extraireAbonnementsIndEnRetardDePaiements.
     */
    private static Vector<AbonnementResidentiel> extraireAbonnementsIndEnRetardDePaiements = new Vector<AbonnementResidentiel>();

    /**
     * @var extraireAbonnementsIndResilie.
     */
    private static Vector<AbonnementResidentiel> extraireAbonnementsIndResilie = new Vector<AbonnementResidentiel>();

    /**
     * Constructer.
     *
     * @param NPI
     * @param nom
     * @param prenom
     * @param date
     *
     */
    PersonneIndividu( int NPI ,String nom , String prenom , String date)
    {
        super();
        this.setNPI(NPI);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setDate(date);
    }

    /**
     * @return the personneIndividu
     */
    public static Vector<PersonneIndividu> getPersonneIndividu() {
        return personneIndividu;
    }

    /**
     * @param personneIndividu the personneIndividu to set
     */
    public static void setPersonneIndividu(Vector<PersonneIndividu> personneIndividu) {
        PersonneIndividu.personneIndividu = personneIndividu;
    }

    /**
     * ExtraireAbonnementsInviduResilie
     */
    static void ExtraireAbonnementsInviduResilie()
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementResidentiel().size(); i++) {
            try{
                if ( nbOfDaysBetweenTwoDates(getAbonnementResidentiel().get(i).getDateFin(),sdf.format(calendar.getTime())) > 90 )
                {
                    getAbonnementResidentiel().get(i).getCategorie().setTarif(0);
                    getAbonnementResidentiel().get(i).setEtat("No Accesss");
                    getExtraireAbonnementsIndResilie().add(getAbonnementResidentiel().get(i));
                    getAbonnementResidentiel().remove(getAbonnementResidentiel().get(i));
                }
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    /**
     * afficheTousAbonnementsInviduResilie
     */
    static void afficheTousAbonnementsInviduResilie()
    {
        for (int i = 0; i < getExtraireAbonnementsIndResilie().size(); i++) {
            System.out.println(getExtraireAbonnementsIndResilie().get(i).toString());
        }
    }

    /**
     * ajouterPersonneIndividu
     *
     * @param p
     *
     */
    static void ajouterPersonneIndividu( PersonneIndividu p )
    {
         getPersonneIndividu().add(p);
    }

    /**
     * afficheTousPersonneIndividu
     */
    static void afficheTousPersonneIndividu()
    {
        Iterator<PersonneIndividu> value = getPersonneIndividu().iterator();
        // Loop while collection has items
        while( value.hasNext() ){
            ((PersonneIndividu) value.next()).affiche();
        } // remove the current Name or Item
    }

    /**
     * recharcherPersonneIndividu
     *
     * @return boolean
     */
    static boolean recharcherPersonneIndividu( int NPI )
    {
        Iterator<PersonneIndividu> value = getPersonneIndividu().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((PersonneIndividu) value.next()).getNPI() == NPI )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * recharcherPersonneIndividu
     *
     * @param NPI
     *
     * @return String
     *
     */
    static String getPrenomIndividu( int NPI )
    {
        Iterator<PersonneIndividu> value = getPersonneIndividu().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((PersonneIndividu) value.next()).getNPI() == NPI )
                return ((PersonneIndividu) value.next()).getPrenom();
        } // remove the current Name or Item
        return null;
    }

    /**
     * getExtraireAbonnementsIndEnRetardDePaiements
     *
     * @return extraireAbonnementsIndEnRetardDePaiements
     *
     */
    public static Vector<AbonnementResidentiel> getExtraireAbonnementsIndEnRetardDePaiements() {
        return extraireAbonnementsIndEnRetardDePaiements;
    }

    /**
     * setExtraireAbonnementsIndEnRetardDePaiements
     *
     * @param extraireAbonnementsIndEnRetardDePaiements to set
     *         *
     */
    public static void setExtraireAbonnementsIndEnRetardDePaiements(Vector<AbonnementResidentiel> extraireAbonnementsIndEnRetardDePaiements) {
        PersonneIndividu.extraireAbonnementsIndEnRetardDePaiements = extraireAbonnementsIndEnRetardDePaiements;
    }

    /**
     * getExtraireAbonnementsIndResilie
     *
     * @return extraireAbonnementsIndResilie
     *
     */
    public static Vector<AbonnementResidentiel> getExtraireAbonnementsIndResilie() {
        return extraireAbonnementsIndResilie;
    }

    public static void setExtraireAbonnementsIndResilie(Vector<AbonnementResidentiel> extraireAbonnementsIndResilie) {
        PersonneIndividu.extraireAbonnementsIndResilie = extraireAbonnementsIndResilie;
    }

    /**
     * recharcherTelephone
     *
     * @return boolean
     *
     */
    boolean recharcherTelephone( int telephone )
    {
        Iterator<AbonnementResidentiel> value = this.getAbonnementResidentiel().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((AbonnementResidentiel) value.next()).getTelephone() == telephone )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * getAbonnementResidentiel
     *
     * @return abonnementResidentiel
     *
     */
    public static Vector<AbonnementResidentiel> getAbonnementResidentiel() {
        return abonnementResidentiel;
    }

    /**
     * setAbonnementResidentiel
     *
     * @param  abonnementResidentiel
     *
     */
    public static void setAbonnementResidentiel(Vector<AbonnementResidentiel> abonnementResidentiel) {
        PersonneIndividu.abonnementResidentiel = abonnementResidentiel;
    }

    /**
     * ajouterAbonnementResidentiel
     *
     * @param  abonnementResidentiel
     *
     */
    static void ajouterAbonnementResidentiel( AbonnementResidentiel abonnementResidentiel )
    {
                getAbonnementResidentiel().add(abonnementResidentiel);
    }

    /**
     * supprimerAbonnementResidentiel
     *
     * @param ar
     *
     */
    void supprimerAbonnementResidentiel( AbonnementResidentiel ar )
    {
        if(!this.recharcherAbonnementResidentiel(ar.getNumero()))
        {
            this.getAbonnementResidentiel().remove(ar);
        }
    }

    /**
     * recharcherAbonnementResidentiel
     * @param telephone
     * @return boolean
     *
     */
    static boolean recharcherAbonnementResidentiel( int telephone )
    {
        Iterator<AbonnementResidentiel> value = getAbonnementResidentiel().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((AbonnementResidentiel) value.next()).getTelephone() == telephone )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * afficheTousAbonnementResidentiel
     */
    static void afficheTousAbonnementResidentiel()
    {
        Iterator<AbonnementResidentiel> value = getAbonnementResidentiel().iterator();
        // Loop while collection has items
        while( value.hasNext() ){
            ((AbonnementResidentiel) value.next()).affiche();
        } // remove the current Name or Item
    }

    /**
     * afficheTousAbonnementResidentielActif
     * @param ville
     */
    static void afficheTousAbonnementResidentielActif( String ville )
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sss = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementResidentiel().size(); i++) {
            try{
                if(getAbonnementResidentiel().get(i).getAdress().getVille().equals(ville))
                {
                  if ( nbOfDaysBetweenTwoDates(getAbonnementResidentiel().get(i).getDateFin(),sss.format(calendar.getTime())) == 0 )
                  {
                       System.out.println(getAbonnementResidentiel().get(i).toString());
                  }
                }
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    /**
     * afficheTousAbonnementsResilies
     */
    static void afficheTousAbonnementsResilies()
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sss = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementResidentiel().size(); i++) {
            try{

                if ( nbOfDaysBetweenTwoDates(getAbonnementResidentiel().get(i).getDateFin(),sss.format(calendar.getTime())) > 90 )
                {
                    getAbonnementResidentiel().get(i).affiche();
                }
            } catch (Exception e) { e.printStackTrace(); }
        }

    }

    /**
     * ExtraireAbonnementsIndEnRetardDePaiements
     */
    static void ExtraireAbonnementsIndEnRetardDePaiements()
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sss = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementResidentiel().size(); i++) {
            try{ System.out.println(getAbonnementResidentiel().get(i).getDateFin());

                if ( nbOfDaysBetweenTwoDates(getAbonnementResidentiel().get(i).getDateFin(),sss.format(calendar.getTime())) <= 90 )
                {

                if(nbOfDaysBetweenTwoDates(getAbonnementResidentiel().get(i).getDateFin(),sss.format(calendar.getTime())) != 0)
                {
                    if (nbOfDaysBetweenTwoDates(getAbonnementResidentiel().get(i).getDateFin(),sss.format(calendar.getTime())) <= 30 )
                    {
                        getAbonnementResidentiel().get(i).setEtat("No Access");
                    }
                    getAbonnementResidentiel().get(i).getCategorie().setTarif(0);
                    getExtraireAbonnementsIndEnRetardDePaiements().add(getAbonnementResidentiel().get(i));
                    getAbonnementResidentiel().remove(getAbonnementResidentiel().get(i));
                }

                }
            } catch (Exception e) { e.printStackTrace(); }
        }

    }

    /**
     * afficheTousAbonnementsEnRetardDePaiementsE
     */
    static void afficheTousAbonnementsEnRetardDePaiementsE()
    {
        for (int i = 0; i < getExtraireAbonnementsIndEnRetardDePaiements().size(); i++) {
            System.out.println(getExtraireAbonnementsIndEnRetardDePaiements().get(i).toString());
        }
    }

    /**
     * RelancerLesAbonnementsResidentielsResilies
     * @param tell
     * @param dateDebut
     * @param dateFin
     * @param tarif
     */
    static void RelancerLesAbonnementsResidentielsResilies( int tell , String dateDebut , String dateFin , double tarif )
    {
        for (int i = 0; i < getExtraireAbonnementsIndResilie().size(); i++) {
            if( getExtraireAbonnementsIndResilie().get(i).getTelephone() == tell )
            {
                getExtraireAbonnementsIndResilie().get(i).setDateDebut(dateDebut);
                getExtraireAbonnementsIndResilie().get(i).setDateFin(dateFin);
                getExtraireAbonnementsIndResilie().get(i).setEtat("Access");
                getExtraireAbonnementsIndResilie().get(i).getCategorie().setTarif(tarif);
                getAbonnementResidentiel().add(getExtraireAbonnementsIndResilie().get(i));
                getExtraireAbonnementsIndResilie().remove(getExtraireAbonnementsIndResilie().get(i));
                break;
            }
        }
    }

    /**
     * RelancerLesAbonnementsResidentielsRetardDePaiement
     * @param tell
     * @param dateDebut
     * @param dateFin
     * @param tarif
     */
    static void RelancerLesAbonnementsResidentielsRetardDePaiement( int tell , String dateDebut , String dateFin , double tarif )
    {
        for (int i = 0; i < getExtraireAbonnementsIndEnRetardDePaiements().size(); i++) {
            if( getExtraireAbonnementsIndEnRetardDePaiements().get(i).getTelephone() == tell )
            {
                getExtraireAbonnementsIndEnRetardDePaiements().get(i).setDateDebut(dateDebut);
                getExtraireAbonnementsIndEnRetardDePaiements().get(i).setDateFin(dateFin);
                getExtraireAbonnementsIndEnRetardDePaiements().get(i).setEtat("Access");
                getExtraireAbonnementsIndEnRetardDePaiements().get(i).getCategorie().setTarif(tarif);
                getAbonnementResidentiel().add(getExtraireAbonnementsIndEnRetardDePaiements().get(i));
                getExtraireAbonnementsIndEnRetardDePaiements().remove(getExtraireAbonnementsIndEnRetardDePaiements().get(i));
                break;
            }
        }
    }

    /**
     * afficheTousAbonnementsEnRetardDePaiementsR
     */
    static void afficheTousAbonnementsEnRetardDePaiementsR()
    {
        for (int i = 0; i < getExtraireAbonnementsIndResilie().size(); i++) {
            System.out.println(getExtraireAbonnementsIndResilie().get(i).toString());
        }
    }

    /**
     * afficheTousAbonnementsEnRetardDePaiementsR
     * @param ville
     */
    void afficheTousAbonnementsEnRetardDePaiement(String ville)
    {
        Iterator<AbonnementResidentiel> value = this.getAbonnementResidentiel().iterator();
        // Loop while collection has items
        while( value.hasNext() ){
            //if(super.retardDePaiement30Jours() && ((AbonnementResidentiel) value.next()).getDateDebut() )
            ((AbonnementResidentiel) value.next()).affiche();
        } // remove the current Name or Item
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return  "Client [ Numero : " + super.getNumero() + " | NPI :  " + this.getNPI() + " | Nom : " + this.getNom() + " | Prenome : " + this.getPrenom() + " | Date de naissance :" + this.getDate() + " ]" + "";
    }

    /*
     * affiche
     */
    public void affiche() {
        System.out.println(this.toString());
    }

    /**
     * @return the nPI
     */
    public int getNPI() {
        return NPI;
    }

    /**
     * @param nPI the nPI to set
     */
    public void setNPI(int nPI) {
        NPI = nPI;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

}
