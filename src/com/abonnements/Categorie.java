package com.abonnements;

public class Categorie {

    /**
    * @var debit.
    */
    private String debit;

    /**
     * @var duree.
     */
    private int duree;

    /**
     * @var type.
     */
    private Type type;

    /**
     * @var tarif.
     */
    private double tarif;

    /**
     * Constructer.
     *
     * @param debit
     * @param duree
     * @param type
     * @param tarif
     *
     */
    Categorie(String debit , int duree , Type type , double tarif )
    {
        this.debit = debit;
        this.duree = duree;
        this.type  = type;
        this.tarif = tarif;
    }

    /**
     * @return the debit
     */
    public String getDebit() {
        return debit;
    }

    /**
     * @param debit the debit to set
     */
    public void setDebit(String debit) {
        this.debit = debit;
    }

    /**
     * @return the duree
     */
    public int getDuree() {
        return duree;
    }

    /**
     * @param duree the duree to set
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return the tarif
     */
    public double getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return  "Categorie [ debit : " + this.getDebit() + " | " + " durée : " +this.getDuree() + " | " + " Type :  " + this.getType() + " | " + " Tarif : " + this.getTarif();
    }

    /**
     * Affiche
     */
    public void affiche()
    {
        System.out.print(this.toString());
    }

}
