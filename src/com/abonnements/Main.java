package com.abonnements;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // variable pour utiliser scanner.

        String out;
        String abnmt;
        String affListR1;
        String affListR2;
        String affListPro;
        String affListPro1;
        String affListPro2;
        String affListPro3;
        String affListPro4;
        String affListPro5;
        String affListPro6;
        String affListPro7;
        String affListPro8;
        String affListPro9;
        String affListPro10;
        String affListPro11;
        String affListPro12;
        String affListInd;
        int tell;
        int tell2;
        int tell3;
        int tell4;
        int tell5;
        int choice;

        do {
            System.out.println("#########################################################################################");
            System.out.println("##                                    Welcome to panel                                 ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 1 )  Afficher les client individu.                                                ##");
            System.out.println("## ( 2 )  Ajouter un client individu.                                                  ##");
            System.out.println("## ( 3 )  Affiche tous les abonnements résidentiels .                                  ##");
            System.out.println("## ( 4 )  Affiche tous les abonnements résiliés .                                      ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 5 )  Afficher les client Professionnel.                                           ##");
            System.out.println("## ( 6 )  Ajouter un personne Professionnel.                                           ##");
            System.out.println("## ( 7 )  Affiche tous les abonnements Professionnel.                                  ##");
            System.out.println("## ( 8 )  Affiche tous les abonnements en retard de paiement dans une ville Vdonnée.   ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 9 )  Extraire les abonnements résidentiels ayant accusés un retard de paiement.   ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 10 ) Extraire les abonnements professionnels ayant accusés un retard de paiement. ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 11 ) Extraire les abonnements résidentiels résilié.                               ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 12 ) Extraire les abonnements professionnels résilié.                             ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 13 ) Relancer les abonnements  résidentiels  résiliés.                            ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 14 ) Relancer les abonnements  professionnels résiliés.                           ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 15 ) Relancer les abonnements  résidentiels  retard de paiement.                  ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 16 ) Relancer les abonnements  professionnels retard de paiement.                 ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 17 ) Afficher les abonnements résidentiels actifs par ville.                      ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");
            System.out.println("##                                                                                     ##");
            System.out.println("## ( 18 ) Afficher les abonnements professionnels actifs par ville.                    ##");
            System.out.println("##                                                                                     ##");
            System.out.println("#########################################################################################");

            System.out.println("Entrer votre choice : ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:

                    do {

                    System.out.println("#####################################################");
                    System.out.println("##       Afficher List des client Individu         ##");
                    System.out.println("#####################################################");
                    PersonneIndividu.afficheTousPersonneIndividu();
                    System.out.println("#####################################################");
                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListInd = scanner.nextLine();
                    System.out.println(affListInd);

                    } while(!affListInd.equals("out"));

                        break;
                case 2:

                    System.out.println("");
                    System.out.println("########################################################################");
                    System.out.println("##    Remplir cette fiche d'information pour ajouter un Individu.     ##");
                    System.out.println("########################################################################");
                    System.out.println("##      + Numero NPI.                                                 ##");
                    System.out.println("##      + Nom.                                                        ##");
                    System.out.println("##      + Prenom.                                                     ##");
                    System.out.println("##      + Date De Naissance.                                          ##");
                    System.out.println("########################################################################");

                    // AJOUTER LES INFORMATION CLIENT.
                    System.out.println("Donner NPI.");
                    int NPI = scanner.nextInt();

                    // verifie si un personne est deja exsist.
                    if(!PersonneIndividu.recharcherPersonneIndividu(NPI))
                    {

                    scanner.nextLine();
                    System.out.println("Donner nom.");
                    String a = scanner.nextLine();

                    System.out.println("Donner prenom.");
                    String prenom = scanner.nextLine();

                    System.out.println("Donner date De Naissance.");
                    String dateDeNaissance = scanner.nextLine();

                    PersonneIndividu personneIndividu = new PersonneIndividu( NPI , a , prenom , dateDeNaissance);
                    // ajouter les adresse d'un client si il ya pleseur...
                    PersonneIndividu.ajouterPersonneIndividu(personneIndividu);

                    } else {
                        System.out.println("cette undividu est deja exsist.");
                    }

                        System.out.println("");
                        System.out.println("########################################################################");
                        System.out.println("##    Remplir cette fiche d'information pour ajouter un abonnement.   ##");
                        System.out.println("########################################################################");
                        System.out.println("##      + Numero Telephone.                                           ##");
                        System.out.println("##      + Numero RUE.                                                 ##");
                        System.out.println("##      + Nom RUE.                                                    ##");
                        System.out.println("##      + Code Postal.                                                ##");
                        System.out.println("##      + Ville.                                                      ##");
                        System.out.println("########################################################################");

                        do {

                            System.out.println("");
                            System.out.println("Donner Tell.");
                            tell = scanner.nextInt();

                            if(PersonneIndividu.recharcherAbonnementResidentiel(tell))
                            {
                                System.out.println("#####################################################");
                                System.out.println("##      Cette numero de tell est deja utliliser.   ##");
                                System.out.println("#####################################################");
                            }

                        } while(PersonneIndividu.recharcherAbonnementResidentiel(tell));

                    // AJOUTER UN ADRESSE.
                    System.out.println("Donner Numero RUE.");
                    int Numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner Nom.");
                    String Nom = scanner.nextLine();
                    System.out.println("Donner Code Postal.");
                    String AdrCodePostal = scanner.nextLine();
                    System.out.println("Donner Ville.");
                    String AdrVille = scanner.nextLine();

                    // Ajouter aboonement Residentiel.
                    System.out.println("Ajouter aboonement Residentiel : ");

                    System.out.println("#####################################################");
                    System.out.println("##          Débit ( 256K , 512K , 1M , 2M )        ##");
                    System.out.println("##                                                 ##");
                    System.out.println("##   1 => Débit 256K et prix = 20da                ##");
                    System.out.println("##   2 => Débit 512K et prix = 25da                ##");
                    System.out.println("##   3 => Débit 1M   et prix = 30da                ##");
                    System.out.println("##   4 => Débit 2M   et prix = 35da                ##");
                    System.out.println("##                                                 ##");
                    System.out.println("#####################################################");

                    System.out.println("selectioner votre option :");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    String debit = null;
                    double tarif = 0;

                    switch (option)
                    {
                        case 1:
                            debit = "256K";
                            tarif = 20;
                            break;

                        case 2:
                            debit = "512K";
                            tarif = 25;
                            break;

                        case 3:
                            debit = "1M";
                            tarif = 30;
                            break;

                        case 4:
                            debit = "2M";
                            tarif = 35;
                            break;
                    }

                    System.out.println("#####################################################");
                    System.out.println("##            Type ( Ethernet , USB , WIFI )       ##");
                    System.out.println("##                                                 ##");
                    System.out.println("##   1 => Ethernet                                 ##");
                    System.out.println("##   2 => USB                                      ##");
                    System.out.println("##   3 => WIFI                                     ##");
                    System.out.println("##                                                 ##");
                    System.out.println("#####################################################");

                    System.out.println("Donner  un type :");
                    int optionType = scanner.nextInt();
                    Type type = null;

                    switch(optionType)
                    {
                        case 1:
                            type = Type.Ethernet;
                            break;

                        case 2:
                            type = Type.USB;
                            break;

                        case 3:
                            type = Type.WIFI;
                            break;
                    }

                    System.out.println("Donner un durée en nombre de mois :");
                    int duree = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner  la date de début de connexion :");
                    String dateDeDebut  = scanner.nextLine();

                    System.out.println("Donner la date de fin de connexion :");
                    String dateDeFin  = scanner.nextLine();

                    PersonneIndividu.ajouterAbonnementResidentiel(new AbonnementResidentiel( tell , NPI ,new Categorie(debit , duree , type , tarif ) , new  Adresse( Numero , Nom , AdrCodePostal , AdrVille ) , dateDeDebut, dateDeFin ));

            break;

                case 3:
                    do{

                    // Affiche tous les abonnements résiliés.
                    System.out.println("#####################################################");
                    System.out.println("##      Affiche tous les abonnements individu.     ##");
                    System.out.println("#####################################################");
                    PersonneIndividu.afficheTousAbonnementResidentiel();
                    System.out.println("#####################################################");

                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListR1 = scanner.nextLine();
                    System.out.println(affListR1);

            } while(!affListR1.equals("out"));

                    break;

                case 4:

                    do{
                    // Affiche tous les abonnements résiliés.
                    System.out.println("#####################################################");
                    System.out.println("##      Affiche tous les abonnements Resilies.     ##");
                    System.out.println("#####################################################");
                    PersonneIndividu.afficheTousAbonnementsResilies();
                    System.out.println("#####################################################");


                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListR2 = scanner.nextLine();
                    System.out.println(affListR2);

            } while(!affListR2.equals("out"));

                    break;

                case 5:

                    do {

                        System.out.println("#####################################################");
                        System.out.println("##       Afficher List des client Professionnel.   ##");
                        System.out.println("#####################################################");
                        PersonneMorale.afficheTousPersonneProfessionnel();
                        System.out.println("#####################################################");

                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro = scanner.nextLine();
                        System.out.println(affListPro);

                    } while(!affListPro.equals("out"));

                    break;

                case 6:

                    System.out.println("");
                    System.out.println("########################################################################");
                    System.out.println("##    Remplir cette fiche d'information pour ajouter un Morale.       ##");
                    System.out.println("########################################################################");
                    System.out.println("##      + NRC.                                                        ##");
                    System.out.println("##      + raison Social.                                              ##");
                    System.out.println("########################################################################");

                    // AJOUTER LES INFORMATION CLIENT.
                    System.out.println("Donner NRC.");
                    int NRC = scanner.nextInt();
                    scanner.nextLine();

                    // verifie si un personne est deja exsist.
                    if(!PersonneMorale.recharcherPersonneProfessionnel(NRC))
                    {
                        System.out.println("Donner Raison Social.");
                        String raisonSocial = scanner.nextLine();

                        PersonneMorale personneMorale = new PersonneMorale( NRC , raisonSocial );
                        // ajouter les adresse d'un client si il ya pleseur...
                        PersonneMorale.ajouterPersonneProfessionnel(personneMorale);

                    } else {
                        System.out.println("cette Morale est deja exsist.");
                    }

                    System.out.println("");
                    System.out.println("########################################################################");
                    System.out.println("##    Remplir cette fiche d'information pour ajouter un abonnement.   ##");
                    System.out.println("########################################################################");
                    System.out.println("##      + Numero Telephone.                                           ##");
                    System.out.println("##      + Numero RUE.                                                 ##");
                    System.out.println("##      + Nom RUE.                                                    ##");
                    System.out.println("##      + Code Postal.                                                ##");
                    System.out.println("##      + Ville.                                                      ##");
                    System.out.println("########################################################################");

                    do {

                        System.out.println("");
                        System.out.println("Donner Tell.");
                        tell = scanner.nextInt();
                        scanner.nextLine();

                        if(PersonneMorale.recharcherAbonnementProfessionnel(tell))
                        {
                            System.out.println("#####################################################");
                            System.out.println("##      Cette numero de tell est deja utliliser.   ##");
                            System.out.println("#####################################################");
                        }

                    } while(PersonneMorale.recharcherAbonnementProfessionnel(tell));

                    // AJOUTER UN ADRESSE.
                    System.out.println("Donner Numero RUE.");
                    int NumeroM = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Donner Nom.");
                    String NomM = scanner.nextLine();
                    System.out.println("Donner Code Postal.");
                    String AdrCodePostalM = scanner.nextLine();
                    System.out.println("Donner Ville.");
                    String AdrVilleM = scanner.nextLine();

                    // Ajouter aboonement Residentiel.
                    System.out.println("Ajouter aboonement Residentiel : ");

                    System.out.println("#####################################################");
                    System.out.println("##          Débit ( 256K , 512K , 1M , 2M )        ##");
                    System.out.println("##                                                 ##");
                    System.out.println("##   1 => Débit 256K et prix = 20da                ##");
                    System.out.println("##   2 => Débit 512K et prix = 25da                ##");
                    System.out.println("##   3 => Débit 1M   et prix = 30da                ##");
                    System.out.println("##   4 => Débit 2M   et prix = 35da                ##");
                    System.out.println("##                                                 ##");
                    System.out.println("#####################################################");

                    System.out.println("selectioner votre option :");
                    int optionM = scanner.nextInt();
                    scanner.nextLine();

                    String debitM = null;
                    double tarifM = 0;

                    switch (optionM)
                    {
                        case 1:
                            debitM = "256K";
                            tarifM = 20;
                            break;

                        case 2:
                            debitM = "512K";
                            tarifM = 25;
                            break;

                        case 3:
                            debitM = "1M";
                            tarifM = 30;
                            break;

                        case 4:
                            debitM = "2M";
                            tarifM = 35;
                            break;
                    }

                    System.out.println("#####################################################");
                    System.out.println("##            Type ( Ethernet , USB , WIFI )       ##");
                    System.out.println("##                                                 ##");
                    System.out.println("##   1 => Ethernet                                 ##");
                    System.out.println("##   2 => USB                                      ##");
                    System.out.println("##   3 => WIFI                                     ##");
                    System.out.println("##                                                 ##");
                    System.out.println("#####################################################");

                    System.out.println("Donner  un type :");
                    int optionTypeM = scanner.nextInt();

                    Type typeM = null;

                    switch(optionTypeM)
                    {
                        case 1:
                            typeM = Type.Ethernet;
                            break;

                        case 2:
                            typeM = Type.USB;
                            break;

                        case 3:
                            typeM = Type.WIFI;
                            break;
                    }

                    System.out.println("Donner un durée en nombre de mois :");
                    int dureeM = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Donner  la date de début de connexion :");
                    String dateDeDebutM  = scanner.nextLine();

                    System.out.println("Donner la date de fin de connexion :");
                    String dateDeFinM  = scanner.nextLine();

                    PersonneMorale.ajouterAbonnementProfessionnel(new AbonnementProfessionnel( tell , NRC ,new Categorie(debitM , dureeM , typeM , tarifM ) , new  Adresse( NumeroM , NomM , AdrCodePostalM , AdrVilleM ) , dateDeDebutM, dateDeFinM ));

                    break;

                case 7:
                    do {

                        System.out.println("#####################################################");
                        System.out.println("##   Afficher List des Abonnements Professionnel.  ##");
                        System.out.println("#####################################################");
                        PersonneMorale.afficheTousAbonnementProfessionnel();
                        System.out.println("#####################################################");

                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListPro1 = scanner.nextLine();
                    System.out.println(affListPro1);

            } while(!affListPro1.equals("out"));
                    break;

                case 8:
                   do{

                       System.out.println("#############################################################################");
                       System.out.println("##   Afficher List des Abonnements en retard de paiement dans une ville .  ##");
                       System.out.println("#############################################################################");
                       scanner.nextLine();
                       System.out.println("Donner un ville :");
                       String villeD = scanner.nextLine();

                       PersonneMorale.afficheTousAbonnementsEnRetardDePaiements(villeD);
                       System.out.println("#############################################################################");

                       System.out.println("Entry : Out Pour quiter cette operation.");

                       // verfier break.
                       affListPro2 = scanner.nextLine();
                       System.out.println(affListPro2);

                   } while(!affListPro2.equals("out"));
                    break;

                case 9:
                    do{

                    System.out.println("#########################################################################################");
                    System.out.println("##                                                                                     ##");
                    System.out.println("## ( 9 )  Extraire les abonnements résidentiels ayant accusés un retard de paiement.   ##");
                    System.out.println("##                                                                                     ##");
                    System.out.println("#########################################################################################");
                    PersonneIndividu.ExtraireAbonnementsIndEnRetardDePaiements();
                    PersonneIndividu.afficheTousAbonnementsEnRetardDePaiementsE();

                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListPro3 = scanner.nextLine();
                    System.out.println(affListPro3);

                    } while(!affListPro3.equals("out"));

            break;

                case 10:
                    do{

                    System.out.println("#########################################################################################");
                    System.out.println("##                                                                                     ##");
                    System.out.println("## ( 10 ) Extraire les abonnements professionnels ayant accusés un retard de paiement. ##");
                    System.out.println("##                                                                                     ##");
                    System.out.println("#########################################################################################");
                    PersonneMorale.ExtraireAbonnementsProEnRetardDePaiements();
                    PersonneMorale.afficheTousAbonnementsEnRetardDePaiementsE();

                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListPro4 = scanner.nextLine();
                    System.out.println(affListPro4);

                    } while(!affListPro4.equals("out"));
                    break;

                case 11:

                    do{

                    System.out.println("#########################################################################################");
                    System.out.println("##                                                                                     ##");
                    System.out.println("## ( 11 ) Extraire les abonnements résidentiels résilié.                               ##");
                    System.out.println("##                                                                                     ##");
                    System.out.println("#########################################################################################");

                    PersonneIndividu.ExtraireAbonnementsInviduResilie();
                    PersonneIndividu.afficheTousAbonnementsInviduResilie();

                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListPro5 = scanner.nextLine();
                    System.out.println(affListPro5);

                    } while(!affListPro5.equals("out"));
                break;

                case 12:

                        do{

                    System.out.println("#########################################################################################");
                    System.out.println("##                                                                                     ##");
                    System.out.println("## ( 12 ) Extraire les abonnements professionnels résilié.                             ##");
                    System.out.println("##                                                                                     ##");
                    System.out.println("#########################################################################################");
                    PersonneMorale.ExtraireAbonnementsProResilie();
                    PersonneMorale.afficheTousAbonnementsProResilie();

                    System.out.println("Entry : Out Pour quiter cette operation.");

                    // verfier break.
                    affListPro6 = scanner.nextLine();
                    System.out.println(affListPro6);

                    } while(!affListPro6.equals("out"));

                        break;

                case 13 :
                    do{

                        System.out.println("#########################################################################################");
                        System.out.println("##                                                                                     ##");
                        System.out.println("## ( 13 ) Relancer les abonnements  résidentiels  résiliés                             ##");
                        System.out.println("##                                                                                     ##");
                        System.out.println("#########################################################################################");

                        System.out.println("Donner un Numero Telephone :");
                        tell2 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Donner  la date de début de connexion :");
                        String dateDebut22  = scanner.nextLine();

                        System.out.println("Donner la date de fin de connexion :");
                        String dateFin22  = scanner.nextLine();

                        System.out.println("Donner un tarif :");
                        double tarif22  = scanner.nextDouble();
                        scanner.nextLine();

                        PersonneIndividu.RelancerLesAbonnementsResidentielsResilies(tell2,dateDebut22,dateFin22,tarif22);
                        //PersonneIndividu.RelancerLesAbonnementsResidentielsResilies(tell2);
                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro7 = scanner.nextLine();
                        System.out.println(affListPro7);

                    } while(!affListPro7.equals("out"));
                    break;

                case 14 :
                    do{

                        System.out.println("#########################################################################################");
                        System.out.println("##                                                                                     ##");
                        System.out.println("## ( 14 ) Relancer les abonnements  professionnels résiliés.                           ##");
                        System.out.println("##                                                                                     ##");
                        System.out.println("#########################################################################################");

                        System.out.println("Donner un Numero Telephone :");
                        tell3 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Donner  la date de début de connexion :");
                        String dateDebut12  = scanner.nextLine();

                        System.out.println("Donner la date de fin de connexion :");
                        String dateFin12  = scanner.nextLine();

                        System.out.println("Donner un tarif :");
                        double tarif12  = scanner.nextDouble();
                        scanner.nextLine();

                        PersonneMorale.RelancerLesAbonnementsProfessionnelResilies(tell3,dateDebut12,dateFin12,tarif12);

                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro8 = scanner.nextLine();
                        System.out.println(affListPro8);

                    } while(!affListPro8.equals("out"));
                    break;


                case 15 :
                    do{

                        System.out.println("#########################################################################################");
                        System.out.println("##                                                                                     ##");
                        System.out.println("## ( 15 ) Relancer les abonnements  résidentiels   retard de paiement.                 ##");
                        System.out.println("##                                                                                     ##");
                        System.out.println("#########################################################################################");

                        System.out.println("Donner un Numero Telephone :");
                        tell4 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Donner  la date de début de connexion :");
                        String dateDebut2  = scanner.nextLine();

                        System.out.println("Donner la date de fin de connexion :");
                        String dateFin2  = scanner.nextLine();

                        System.out.println("Donner un tarif :");
                        double tarif2  = scanner.nextDouble();
                        scanner.nextLine();

                        //PersonneIndividu.RelancerLesAbonnementsResidentielsResilies(tell2,dateDebut,dateFin,tarif1);
                        PersonneIndividu.RelancerLesAbonnementsResidentielsRetardDePaiement(tell4,dateDebut2,dateFin2,tarif2);
                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro9 = scanner.nextLine();
                        System.out.println(affListPro9);

                    } while(!affListPro9.equals("out"));
                    break;

                case 16 :
                    do{

                        System.out.println("#########################################################################################");
                        System.out.println("##                                                                                     ##");
                        System.out.println("## ( 16 ) Relancer les abonnements  professionnels  retard de paiement.                ##");
                        System.out.println("##                                                                                     ##");
                        System.out.println("#########################################################################################");

                        System.out.println("Donner un Numero Telephone :");
                        tell5 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Donner  la date de début de connexion :");
                        String dateDebut1  = scanner.nextLine();

                        System.out.println("Donner la date de fin de connexion :");
                        String dateFin1  = scanner.nextLine();

                        System.out.println("Donner un tarif :");
                        double tarif1  = scanner.nextDouble();
                        scanner.nextLine();

                        PersonneMorale.RelancerLesAbonnementsProfessionnelRetardDePaiements(tell5,dateDebut1,dateFin1,tarif1);

                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro10 = scanner.nextLine();
                        System.out.println(affListPro10);

                    } while(!affListPro10.equals("out"));
                    break;

                case 17:

                    do{
                        System.out.println("###############################################################################################################");
                        System.out.println("##                        Afficher List des Abonnements Residentiel actifs par ville.                       ##");
                        System.out.println("###############################################################################################################");
                        scanner.nextLine();
                        System.out.println("Donner un ville :");
                        String villeF = scanner.nextLine();

                        PersonneIndividu.afficheTousAbonnementResidentielActif(villeF);
                        System.out.println("###############################################################################################################");

                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro11 = scanner.nextLine();
                        System.out.println(affListPro11);

                    } while(!affListPro11.equals("out"));

                    break;

                case 18:

                    do{

                        System.out.println("###############################################################################################################");
                        System.out.println("##                        Afficher List des Abonnements professionnels actifs par ville.                     ##");
                        System.out.println("###############################################################################################################");
                        scanner.nextLine();
                        System.out.println("Donner un ville :");
                        String villeG = scanner.nextLine();

                        PersonneMorale.afficheTousAbonnementProfessionnelActif(villeG);
                        System.out.println("###############################################################################################################");

                        System.out.println("Entry : Out Pour quiter cette operation.");

                        // verfier break.
                        affListPro12 = scanner.nextLine();
                        System.out.println(affListPro12);

                    } while(!affListPro12.equals("out"));

                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            // verfier break.
            out = scanner.nextLine();
            System.out.println(out);

        } while(!out.equals("out"));

        scanner.close();

    }
}