package com.abonnements;

import java.text.SimpleDateFormat;
import java.util.*;

public class PersonneMorale  extends Client {

    /**
     * @var raisonSocial.
     */
    private String raisonSocial;

    /**
     * @var NRC.
     */
    private int NRC;

    /**
     * @var personneMorale.
     */
    private static Vector<PersonneMorale> personneMorale = new Vector<PersonneMorale>();

    /**
     * @var abonnementProfessionnel.
     */
    private static Vector<AbonnementProfessionnel> abonnementProfessionnel = new Vector<AbonnementProfessionnel>();

    /**
     * @var extraireAbonnementsProEnRetardDePaiements.
     */
    private static Vector<AbonnementProfessionnel> extraireAbonnementsProEnRetardDePaiements = new Vector<AbonnementProfessionnel>();

    /**
     * @var extraireAbonnementsProResilie.
     */
    private static Vector<AbonnementProfessionnel> extraireAbonnementsProResilie = new Vector<AbonnementProfessionnel>();

    /**
     * Constructer.
     *
     * @param NRC
     * @param raisonSocial
     *
     */
    PersonneMorale( int NRC , String raisonSocial )
    {
        this.setRaisonSocial(raisonSocial);
        this.setNRC(NRC);
    }

    /**
     * ajouterPersonneProfessionnel
     *
     * @param p
     *
     */
    static void ajouterPersonneProfessionnel( PersonneMorale p )
    {
        getPersonneMorale().add(p);
    }

    /**
     * afficheTousPersonneProfessionnel
     *
     */
    static void afficheTousPersonneProfessionnel()
    {
        Iterator<PersonneMorale> value = getPersonneMorale().iterator();
        // Loop while collection has items
        while( value.hasNext() ){
            ((PersonneMorale) value.next()).affiche();
        } // remove the current Name or Item
    }

    /**
     * afficheTousAbonnementsEnRetardDePaiements
     *
     * @param ville
     *
     */
    static void afficheTousAbonnementsEnRetardDePaiements( String ville )
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sss = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementProfessionnel().size(); i++) {
            try{
                if(getAbonnementProfessionnel().get(i).getAdress().getVille().equals(ville))
                {
                    if ( nbOfDaysBetweenTwoDates(getAbonnementProfessionnel().get(i).getDateFin(),sss.format(calendar.getTime())) != 0 )
                    {
                        if ( nbOfDaysBetweenTwoDates(getAbonnementProfessionnel().get(i).getDateFin(),sss.format(calendar.getTime())) <= 90 )
                        {
                            System.out.println(getAbonnementProfessionnel().get(i).toString());
                        }
                    }
                }

            } catch (Exception e) { e.printStackTrace(); }
        }

    }

    /**
     * afficheTousAbonnementProfessionnelActif
     *
     * @param ville
     *
     */
    static void afficheTousAbonnementProfessionnelActif( String ville )
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sss = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementProfessionnel().size(); i++) {
            try{
                if(getAbonnementProfessionnel().get(i).getAdress().getVille().equals(ville))
                {
                    if ( nbOfDaysBetweenTwoDates(getAbonnementProfessionnel().get(i).getDateFin(),sss.format(calendar.getTime())) == 0 )
                    {
                        System.out.println(getAbonnementProfessionnel().get(i).toString());
                    }
                }

            } catch (Exception e) { e.printStackTrace(); }
        }

    }

    /**
     * recharcherPersonneProfessionnel
     *
     * @param NRC
     *
     * @retourn boolean
     *
     */
    static boolean recharcherPersonneProfessionnel( int NRC )
    {
        Iterator<PersonneMorale> value = getPersonneMorale().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((PersonneMorale) value.next()).getNRC() == NRC )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * recharcherPersonneProfessionnel
     *
     * @retourn extraireAbonnementsProEnRetardDePaiements
     *
     */
    public static Vector<AbonnementProfessionnel> getExtraireAbonnementsProEnRetardDePaiements() {
        return extraireAbonnementsProEnRetardDePaiements;
    }

    /**
     * recharcherPersonneProfessionnel
     *
     * @param extraireAbonnementsProEnRetardDePaiements
     *
     */
    public static void setExtraireAbonnementsProEnRetardDePaiements(Vector<AbonnementProfessionnel> extraireAbonnementsProEnRetardDePaiements) {
        PersonneMorale.extraireAbonnementsProEnRetardDePaiements = extraireAbonnementsProEnRetardDePaiements;
    }

    /**
     * getExtraireAbonnementsProResilie
     *
     * @retourn extraireAbonnementsProResilie
     *
     */
    public static Vector<AbonnementProfessionnel> getExtraireAbonnementsProResilie() {
        return extraireAbonnementsProResilie;
    }


    /**
     * setExtraireAbonnementsProResilie
     *
     * @param extraireAbonnementsProResilie
     *
     */
    public static void setExtraireAbonnementsProResilie(Vector<AbonnementProfessionnel> extraireAbonnementsProResilie) {
        PersonneMorale.extraireAbonnementsProResilie = extraireAbonnementsProResilie;
    }

    /**
     * recharcherTelephone
     *
     * @param telephone
     *
     * @retourn boolean
     *
     */
    boolean recharcherTelephone( int telephone )
    {
        Iterator<AbonnementProfessionnel> value = this.getAbonnementProfessionnel().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((AbonnementProfessionnel) value.next()).getTelephone() == telephone )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * ajouterAbonnementProfessionnel
     *
     * @param ar
     *
     */
    static void ajouterAbonnementProfessionnel( AbonnementProfessionnel ar )
    {
            getAbonnementProfessionnel().add(ar);
    }


    /**
     * RelancerLesAbonnementsProfessionnelRetardDePaiements
     *
     * @param tell
     * @param dateDebut
     * @param dateFin
     * @param tarif
     *
     */
    static void RelancerLesAbonnementsProfessionnelRetardDePaiements( int tell , String dateDebut , String dateFin , double tarif )
    {
        for (int i = 0; i < getExtraireAbonnementsProEnRetardDePaiements().size(); i++) {
            if( getExtraireAbonnementsProEnRetardDePaiements().get(i).getTelephone() == tell )
            {
                getExtraireAbonnementsProEnRetardDePaiements().get(i).setDateDebut(dateDebut);
                getExtraireAbonnementsProEnRetardDePaiements().get(i).setDateFin(dateFin);
                getExtraireAbonnementsProEnRetardDePaiements().get(i).setEtat("Access");
                getExtraireAbonnementsProEnRetardDePaiements().get(i).getCategorie().setTarif(tarif);
                getAbonnementProfessionnel().add(getExtraireAbonnementsProEnRetardDePaiements().get(i));
                getExtraireAbonnementsProEnRetardDePaiements().remove(getExtraireAbonnementsProEnRetardDePaiements().get(i));
                break;
            }
        }
    }

    /**
     * RelancerLesAbonnementsProfessionnelResilies
     *
     * @param tell
     * @param dateDebut
     * @param dateFin
     * @param tarif
     *
     */
    static void RelancerLesAbonnementsProfessionnelResilies( int tell , String dateDebut , String dateFin , double tarif )
    {
        for (int i = 0; i < getExtraireAbonnementsProResilie().size(); i++) {
            if( getExtraireAbonnementsProResilie().get(i).getTelephone() == tell )
            {
                getExtraireAbonnementsProResilie().get(i).setDateDebut(dateDebut);
                getExtraireAbonnementsProResilie().get(i).setDateFin(dateFin);
                getExtraireAbonnementsProResilie().get(i).setEtat("Access");
                getExtraireAbonnementsProResilie().get(i).getCategorie().setTarif(tarif);
                getAbonnementProfessionnel().add(getExtraireAbonnementsProResilie().get(i));
                getExtraireAbonnementsProResilie().remove(getExtraireAbonnementsProResilie().get(i));
                break;
            }
        }
    }

    /**
     * ExtraireAbonnementsProEnRetardDePaiements
     */
    static void ExtraireAbonnementsProEnRetardDePaiements()
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date.
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementProfessionnel().size(); i++) {
            try{
                if ( nbOfDaysBetweenTwoDates(getAbonnementProfessionnel().get(i).getDateFin(),sdf.format(calendar.getTime())) <= 90 )
                {
                    if(nbOfDaysBetweenTwoDates(getAbonnementProfessionnel().get(i).getDateFin(),sdf.format(calendar.getTime())) > 30 )
                    {
                        getAbonnementProfessionnel().get(i).setEtat("No Access");
                    }
                     getAbonnementProfessionnel().get(i).getCategorie().setTarif(0);
                     getExtraireAbonnementsProEnRetardDePaiements().add(getAbonnementProfessionnel().get(i));
                     getAbonnementProfessionnel().remove(getAbonnementProfessionnel().get(i));
                     System.out.println("it's works.");
                }
            } catch (Exception e) { e.printStackTrace(); }
        }
    }


    /**
     * afficheTousAbonnementsEnRetardDePaiementsE
     */
    static void afficheTousAbonnementsEnRetardDePaiementsE()
    {
        for (int i = 0; i < getExtraireAbonnementsProEnRetardDePaiements().size(); i++) {
            System.out.println(getExtraireAbonnementsProEnRetardDePaiements().get(i).toString());
        }
    }


    /**
     * afficheTousAbonnementsProResilie
     */
    static void afficheTousAbonnementsProResilie()
    {
        for (int i = 0; i < getExtraireAbonnementsProResilie().size(); i++) {
            System.out.println(getExtraireAbonnementsProResilie().get(i).toString());
        }
    }

    /**
     * ExtraireAbonnementsProResilie
     */
    static void ExtraireAbonnementsProResilie()
    {
        Calendar calendar = Calendar.getInstance();

        //définir le format de la date
        SimpleDateFormat sss = new SimpleDateFormat("MM/dd/yyyy");

        for (int i = 0; i < getAbonnementProfessionnel().size(); i++) {
            try{
                if ( nbOfDaysBetweenTwoDates(getAbonnementProfessionnel().get(i).getDateFin(),sss.format(calendar.getTime())) > 90 )
                {
                    getAbonnementProfessionnel().get(i).getCategorie().setTarif(0);
                    getAbonnementProfessionnel().get(i).setEtat("No Access");
                    getExtraireAbonnementsProResilie().add(getAbonnementProfessionnel().get(i));
                    getAbonnementProfessionnel().remove(getAbonnementProfessionnel().get(i));
                }
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    /**
     * afficheTousAbonnementsEnRetardDePaiementsR
     */
    static void afficheTousAbonnementsEnRetardDePaiementsR()
    {
        for (int i = 0; i < getExtraireAbonnementsProResilie().size(); i++) {
            System.out.println(getExtraireAbonnementsProResilie().get(i).toString());
        }
    }

    /**
     * recharcherAbonnementProfessionnel
     *
     * @param tell
     *
     * @retourn boolean
     *
     */
    static boolean recharcherAbonnementProfessionnel( int tell )
    {
        Iterator<AbonnementProfessionnel> value = getAbonnementProfessionnel().iterator();

        // Loop while collection has items
        while( value.hasNext() ){
            if( ((AbonnementProfessionnel) value.next()).getTelephone() == tell )
                return true;
        } // remove the current Name or Item
        return false;
    }

    /**
     * afficheTousAbonnementProfessionnel
     *
     */
    static void afficheTousAbonnementProfessionnel()
    {
        Iterator<AbonnementProfessionnel> value = getAbonnementProfessionnel().iterator();
        // Loop while collection has items
        while( value.hasNext() ){
            ((AbonnementProfessionnel) value.next()).affiche();
        } // remove the current Name or Item
    }

    /**
     * getPersonneMorale
     *
     * @retourn personneMorale
     *
     */
    public static Vector<PersonneMorale> getPersonneMorale() {
        return personneMorale;
    }

    /**
     * setPersonneMorale
     *
     * @param personneMorale
     *
     */
    public static void setPersonneMorale(Vector<PersonneMorale> personneMorale) {
        PersonneMorale.personneMorale = personneMorale;
    }

    /**
     * getAbonnementProfessionnel
     *
     * @retourn abonnementProfessionnel
     *
     */
    public static Vector<AbonnementProfessionnel> getAbonnementProfessionnel() {
        return abonnementProfessionnel;
    }

    /**
     * setAbonnementProfessionnel
     *
     * @param abonnementProfessionnel
     *
     *
     */
    public static void setAbonnementProfessionnel(Vector<AbonnementProfessionnel> abonnementProfessionnel) {
        PersonneMorale.abonnementProfessionnel = abonnementProfessionnel;
    }

    public String toString() {
        return  "Client [ Numero : " + super.getNumero() + " | NRC : " + this.getNRC() + " | Raison Social : " + this.getRaisonSocial() + "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public int getNRC() {
        return NRC;
    }

    public void setNRC(int NRC) {
        this.NRC = NRC;
    }

}