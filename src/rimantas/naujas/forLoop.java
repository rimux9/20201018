package rimantas.naujas;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class forLoop {
    //while loops//
    /*public static void main(String[] args) {
        //pirmas budas pasirasai teksta "patinka programuoti" i < 5(kiek kartu atspausdinti)
        for(int i = 0; i < 5; i++) {

            System.out.println("painka programuoti  !!!");
        }

        //atspausdina skaicius kiek irasome i < 20(nuo 0..19) i <=20(atspausdins su 0..20)
            for(int i = 0; i <= 20; i++) {

                System.out.println(i);
        }

            //kaip ir aisku viskas
            int[] numbers = {90, 52, 400, 365, 25 };
            for(int i = 0; i < numbers.length;i++) {


                System.out.println(numbers[i]);
            }

    }*/

    public static void main(String[] args) {
        //1. paprastas su zodziu ir skaiciu
      /*  int i = 1;
        while (i < 11)
        {
            //code galim atspausdinti zodzius "labas" arba skaicius (i)
            System.out.println("labas" + i);
            i++;*/
        //2. programa su slaptazodziu
        /*System.out.println("atspek slaptazodi:");
        String slaptazodis = "ileisk mane";
        Scanner scanner = new Scanner(System.in);
        String atspek = scanner.nextLine();

        while (!atspek.equals((slaptazodis))) {
            System.out.println("atspek slaptazodi:");
            atspek = scanner.nextLine();
        }
            System.out.println("Ilindai!!!!");
        scanner.close();*/
        // 3. paprastas for loop
        //arba for(int i = 9; i > 0; i--) {

        /*boolean additionalLogging = false;
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);

            //neste loop nuo cia

            if (i == 5) {
                if (additionalLogging == true) {
                    System.out.println("rado penketa");

                }
            }
        }*/
        // 4. skaiciu trikampis su for
       /* for (int i = 9; i >= 0; i--) {
            //k=9 bus 10*10. k = i bus trikampis
            for (int k = i; k >= 0; k--) {


                System.out.print(k + " ");

            }
            System.out.println();
        }*/
        //5. skaiciu trikampis su while
       /* int i = 9;
        while(i >= 0) {
            int k = i;
            while(k >= 0) {
                System.out.print(k + " ");
                k--;

            }
            System.out.println();
            i--;
        }


         for (int i = 9; i >= 0; i--) {
            //k=9 bus 10*10. k = i bus trikampis
            for (int k = i; k >= 0; k--) {


                System.out.print(k + " ");

            }
            System.out.println();
        }*/




    }
}
