package rimantas.naujas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class laikoUzduotis {

       /* public static void main(String[] args) {

            //What time is it here and now?
            // What time is it in standard time?
            //How much time passed from 11:49:06 to 15:04:17?
            // Given a birthday, how old is someone?
            LocalTime nowTime = LocalTime.now();
            Instant time = Instant.now();
            int hour = 11;
            int minute = 49;
            int  second = 06;
            int hour1 = 15;
            int minute1 = 04;
            int  second1 = 17;

            LocalTime time1 = LocalTime.of(11,49,06);
            LocalTime time2 = LocalTime.of(15,04,17);
            Duration duration = Duration.between((time1,time2);




            System.out.println("Time is it here and now: " +nowTime);
            System.out.println("\nTime is it in standard time:  " +time);
            System.out.println("Time is it here and now: " +nowTime);*/
       public static void main(String[] args) {
           DateTimeFormatter formatter;
           // Task 1
           LocalDateTime nowDateTime = LocalDateTime.now();
           System.out.println("Time here and now:\n" + nowDateTime);
           // ZonedDateTime time = ZonedDateTime.now();
           // System.out.println(time);
           //Task 2
           Instant nowInstant = Instant.now();
           System.out.println("Standard time:\n" + nowInstant);
           //Task 3
           LocalTime time1 = LocalTime.of(11,49,06);
           LocalTime time2 = LocalTime.of(15,04,17);
           Duration duration = Duration.between(time1, time2);
           System.out.println(String.format("Duration from 11:49:06 to 15:04:17 is: %d seconds", duration.getSeconds()));
           //Task 4
           LocalDate birthdayDateTime = LocalDate.of(1982,7,26);
           LocalDate nowLocalDateTime = LocalDate.now();
           //LocalTime nineOClock1 = LocalTime.of(9,0);
           //LocalTime nineOClock2 = LocalTime.of(9,0);
           // System.out.println("nineOClock1.equals(nineOClock2=)" + nineOClock1.equals(nineOClock2));
           Period period = Period.between(birthdayDateTime, nowLocalDateTime);
           System.out.println(String.format("If my birthday is I am %d years, %d month(-s), %d days old", period.getYears(), period.getMonths(), period.getDays()));



        }
    }


