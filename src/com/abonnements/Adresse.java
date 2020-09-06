package com.abonnements;

public class Adresse {

    /**
     * @var numero.
     */
    private int numero;

    /**
     * @var nom.
     */
    private String nom;

    /**
     * @var codePostal.
     */
    private String codePostal;

    /**
     * @var ville.
     */
    private String ville;

    /**
     * Constructer.
     *
     * @param numero
     * @param nom
     * @param codePostal
     * @param ville
     *
     */
    Adresse( int numero , String nom , String codePostal , String ville )
    {
        this.numero     = numero;
        this.nom        = nom;
        this.codePostal = codePostal;
        this.ville      = ville;
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
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Adresse [ Numero : " + this.getNumero() + " | Nom : " + this.getNom() + " | Code Postal : " + this.getCodePostal() + " | Ville : " + this.getVille() + " ]";
    }

    /*
     * affiche
     */
    public void affiche() {
        System.out.println(this.toString());
    }

}
