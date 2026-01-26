package com.rodrigoleite.fundamentosjava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

    public static void main(String[] args) {
        
        try {
            diferencaDataAteJava7();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("------------------");
        diferencaDataJava8();
        System.out.println("------------------");
        diferencaDataJava8ComTempo();
        System.out.println("------------------");
        diferencaDataJava8ComChronoUnit();



    }

    public static void diferencaDataAteJava7() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraDt = sdf.parse("22/10/2023");
        Date segundaDt = sdf.parse("26/01/2026");

        long diffEmMil = Math.abs(segundaDt.getTime() - primeiraDt.getTime());
        long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
        int dias = (int) (diffEmMil / ( 1000 * 60 * 60 * 24));
        System.out.println(diff);
        System.out.println(dias);
    }

    public static void diferencaDataJava8(){
        LocalDate primeiraDt = LocalDate.of(2023, 10, 22);
        LocalDate segundaDt = LocalDate.now();

        Period periodo = Period.between(primeiraDt, segundaDt);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int anos = periodo.getYears();

        System.out.println(anos + " Anos\n" + meses + " Meses\n" + dias + " Dias");
    }

    public static void diferencaDataJava8ComTempo(){
        LocalDateTime primeiraDt = LocalDateTime.of(2023, 10, 22, 18, 30);
        LocalDateTime segundaDt = LocalDateTime.now();

        Duration duracao = Duration.between(primeiraDt, segundaDt);
        long dias = duracao.toDays();
        long horas = duracao.toHours();
        long min = duracao.toMinutes();
        long seg = duracao.toSeconds();
        System.out.println(dias + " Dias\n" + horas + " Horas\n" + min + " Minutos\n" + seg + " Segundos");
    }

    public static void diferencaDataJava8ComChronoUnit(){
        LocalDateTime primeiraDt = LocalDateTime.of(2023, 10, 22, 18, 30);
        LocalDateTime segundaDt = LocalDateTime.now();

        long anos =  ChronoUnit.YEARS.between(primeiraDt, segundaDt);
        long meses = ChronoUnit.MONTHS.between(primeiraDt, segundaDt);
        long semanas = ChronoUnit.WEEKS.between(primeiraDt, segundaDt);
        long dias = ChronoUnit.DAYS.between(primeiraDt, segundaDt);
        long horas = ChronoUnit.HOURS.between(primeiraDt, segundaDt);
        long minutos = ChronoUnit.MINUTES.between(primeiraDt, segundaDt);
        long segundos = ChronoUnit.SECONDS.between(primeiraDt, segundaDt);

        System.out.println(anos + " Anos");
        System.out.println(meses + " Meses");
        System.out.println(semanas + " Semanas");
        System.out.println(dias + " Dias");
        System.out.println(horas + " Horas");
        System.out.println(minutos + " Minutos");
        System.out.println(segundos + " Segundos");
    }
}
