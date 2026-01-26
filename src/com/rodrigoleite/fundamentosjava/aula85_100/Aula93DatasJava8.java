package com.rodrigoleite.fundamentosjava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

    public static void main(String[] args) {
        
        // Data  - dd/mm/yyyy : LocalDate (Apenas Data)
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        // of() Para setar uma data
        System.out.println(LocalDate.of(2003, 5, 17));

        // parse() Para converter uma string no formato iso para LocalDate.
        System.out.println(LocalDate.parse("2003-05-17"));

        System.out.println();

        // plus() Para somar a data
        System.out.println(agora.plusDays(30)); // Dias : plusDays()
        System.out.println(agora.plus(30, ChronoUnit.DAYS));
        System.out.println(agora.plusWeeks(4)); // Semanas : plusWeeks()
        System.out.println(agora.plus(4, ChronoUnit.WEEKS));
        System.out.println(agora.plusMonths(1)); // Mêses : plusMonths()
        System.out.println(agora.plus(1, ChronoUnit.MONTHS));
        System.out.println(agora.plusYears(1)); // Anos : plusYears()
        System.out.println(agora.plus(1, ChronoUnit.YEARS));

        System.out.println();

        // minus() Para diminiur a data
        System.out.println(agora.minusDays(30)); // Dias : minusDays()
        System.out.println(agora.minus(30, ChronoUnit.DAYS));
        System.out.println(agora.minusWeeks(4)); // Semanas : minusWeeks()
        System.out.println(agora.minus(4, ChronoUnit.WEEKS));
        System.out.println(agora.minusMonths(1)); // Mêses : minusMonths()
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));
        System.out.println(agora.minusYears(1)); // Anos : minusYears()
        System.out.println(agora.minus(1, ChronoUnit.YEARS));

        System.out.println();

        // getDayOfWeek() Para ter o dia da semana
        System.out.println(agora.getDayOfWeek());

        // getDayOfMonth() Para ter o dia do mês
        System.out.println(agora.getDayOfMonth());

        // getDayOfMonth() Para ter o dia do ano
        System.out.println(agora.getDayOfYear());

        System.out.println();

        // isLeapYear() Para verificar se uma data é de ano bissexto
        System.out.println(agora.isLeapYear());
        System.out.println(LocalDate.of(2000, 5, 17).isLeapYear());

        System.out.println();

        // Horário  - hh:mm:ss : LocalTime (Apenas Horario)
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        // of() Para setar um horario
        System.out.println(LocalTime.of(20, 18));

        // parse() Para converter uma string no formato iso para LocalDate.
        System.out.println(LocalTime.parse("20:18"));

        System.out.println();

        // plus() Para somar ao horario
        System.out.println(hAgora.plusSeconds(60)); // Seg : plusSeconds()
        System.out.println(hAgora.plus(60, ChronoUnit.SECONDS));
        System.out.println(hAgora.plusMinutes(1)); // Min : plusMinutes()
        System.out.println(hAgora.plus(1, ChronoUnit.MINUTES));
        System.out.println(hAgora.plusHours(1)); // Horas : plusHours()
        System.out.println(hAgora.plus(1, ChronoUnit.HOURS));

        System.out.println();

        // minus() Para diminiur o horario
        System.out.println(hAgora.minusSeconds(60)); // Seg : minusSeconds()
        System.out.println(hAgora.minus(60, ChronoUnit.SECONDS));
        System.out.println(hAgora.minusMinutes(1)); // Min : minusMinutes()
        System.out.println(hAgora.minus(1, ChronoUnit.MINUTES));
        System.out.println(hAgora.minusHours(1)); // Horas : minusHours()
        System.out.println(hAgora.minus(1, ChronoUnit.HOURS));

        System.out.println();

        // getHour() Para ter a hora
        System.out.println(hAgora.getHour());

        // getMinute() Para ter os minutos
        System.out.println(hAgora.getMinute());

        // getSecond() Para ter os segundos
        System.out.println(hAgora.getSecond());

        // getNano() Para ter os nano-segundos
        System.out.println(hAgora.getNano());

        System.out.println();

        // Data Completa - LocalDateTime (Data e Horario)
        LocalDateTime agoraCompleta = LocalDateTime.now();
        System.out.println(agoraCompleta);

        System.out.println();

        /* A API LocalDateTime possui a junção de todas as funcionalidades de LocalDate e LocalTime, pois as três possuem conformidade entre elas */

        // Fuso Horário
        ZoneId fuso = ZoneId.systemDefault(); // Do Sistema
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds(); // Ter todos os fuso-horarios id do sys
        for (String f : fusos) {
            System.out.println(f);
        }                                               

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        System.out.println(sp);
        ZonedDateTime zdt = ZonedDateTime.of(agoraCompleta, sp);
        System.out.println(zdt);

        System.out.println();

        // Para converter um tipo Date ou Calendar para LocalDateTime

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(ldtDate);
        LocalDateTime ldtCalendar = LocalDateTime.ofInstant(c.toInstant(), sp);
        System.out.println(ldtCalendar);
        


        




    }
}
