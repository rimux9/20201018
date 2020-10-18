package rimantas.naujas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class spalio17 {
    public static void main(String[] args) {

        //instant zona ir local
        //java.time.* importuos class


        //What time is it here and now?
               // What time is it in standard time?
        //How much time passed from 11:49:06 to 15:04:17?
               // Given a birthday, how old is someone?
        Instant nowInstant = Instant.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println(nowInstant);
        System.out.println("    ");
        System.out.println(nowDateTime);

        // duration pasakis kiek h ir sekundziu ir mili sekundziu skirtuma tarp laiko tarpo matuoti kaip greit atbego 100metru,
        //period ilgo laiko tarpo. tai trukme ir periodas. kiek metu jums, kiek dienu liko iki kaledu
        //skirtuma paima duration.betweeen  ir period.between



    }


}
