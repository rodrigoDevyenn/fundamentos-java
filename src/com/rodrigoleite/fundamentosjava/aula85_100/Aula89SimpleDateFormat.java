package com.rodrigoleite.fundamentosjava.aula85_100;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");

        Calendar data  = new GregorianCalendar(2003, 4, 17, 12, 54, 36);

        Date hoje = new Date();

        System.out.println(sdf.format(data.getTime()));
        System.out.println(sdf.format(hoje));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        String minhaData = "22/10/2023";
        try {
            Date minhaDataDate = sdf1.parse(minhaData);
            System.out.println(minhaDataDate);
            System.out.println(sdf.format(minhaDataDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
