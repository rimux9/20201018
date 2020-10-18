import java.util.Scanner;

// kuno mases skaiciuokle
public class MyFirstJavaProgram {

    public static void main(String[] args) throws Exception {
        calculateKMI();
    }

    private static void calculateKMI() throws Exception {
        System.out.print("Irasykite savo svori:) ");
        Scanner s = new Scanner(System.in);
        int svoris = s.nextInt();
        System.out.print("Irasykite dar ir  savo ugi cm:) ");
        int ugis = s.nextInt();
        int kmi = (100*100*svoris)/(ugis*ugis);

        System.out.println("Tavo kuno mases indeksas yra: "+kmi);
        printBMICategory(kmi);
    }
    private static void printBMICategory(float kmi) {
        if(kmi < 18.5) {
            System.out.println("Reikia stipriai pavalgyti :) ");
        }else if (kmi < 25) {
            System.out.println("Svoris geras ;)");
        }else if (kmi < 30) {
            System.out.println("Geriau tiek nebevalgyti!:) ");
        }else {
            System.out.println("nutukai :(");
        }
    }
}









