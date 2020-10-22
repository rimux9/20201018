package rimantas.idetiIsimti.Ceasar;

public class Ceaser {

    public static void main(String[] args) {
        //1. i String text irasau "Rimantas" ir c +=key
        //2. i String text ikopinu gautus simbolius  Xosgtzgy ir is c +, keiciu i c -

        int key = 1;
        String text = "Rimantas";
        System.out.println(text);
        char[] chars = text.toCharArray();
        for(char c : chars) {
            c += key;
            System.out.print(c);
        }
    }
}
