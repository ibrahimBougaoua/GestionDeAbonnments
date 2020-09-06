package com.abonnements;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

public class Client {

    /**
     * @var id.
     */
    private static int id = 0;

    /**
     * @var numero.
     */
    private int numero;

    /**
     * Constructer.
     */
    Client()
    {
        this.id++;
        this.numero = this.id;
    }

    /**
     * getNumero.
     *
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * setNumero.
     *
     * @param numero
     *
     */
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    /**
     * nbOfDaysBetweenTwoDates.
     *
     * @param dateOne
     * @param dateTow
     *
     * @return the number
     *
     */
    public static int nbOfDaysBetweenTwoDates(String dateOne, String dateTow)  throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = simpleDateFormat.parse(dateOne);
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(date1);
        Date date2 = simpleDateFormat.parse(dateTow);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(date2);
        int gap = 0;
        gc1.add(GregorianCalendar.DATE, 1);
        while(gc1.compareTo(gc2)<=0) {
            gap++;
            gc1.add(GregorianCalendar.DATE, 1);
        }
        return gap;
    }

    /**
     * nbOfMonthsBetweenTwoDates.
     *
     * @param dateOne
     *
     * @return the inumber
     */
    public static int nbOfMonthsBetweenTwoDates(String dateOne, String dateTow)  throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = simpleDateFormat.parse(dateOne);
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(date1);
        Date date2 = simpleDateFormat.parse(dateTow);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(date2);
        int gap = 0;
        gc1.add(GregorianCalendar.MONTH, 1);
        while(gc1.compareTo(gc2)<=0) {
            gap++;
            gc1.add(GregorianCalendar.MONTH, 1);
        }
        return gap;
    }

}
