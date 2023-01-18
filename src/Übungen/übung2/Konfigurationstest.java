package Übungen.übung2;

public class Konfigurationstest {
    public static void main(String[] args) {
        int cent = 80;
        double maximum = 95.5;
        boolean state = true;
        int minus = -1000;
        double seltsam = 1.255;
        char hash = '#';
        byte acht = 8;
        long lang = 2147483648L;
        String satzt = "Ich heiße Freddie!";
        final int check_nr = 8765;

        //um die funktionabilität zu gewärleisten und oder dein gewünschten datentyp zu erhalten und damit zu arbeiten.

        int ergebnis = 4 + 8 * 9 - 1;
        System.out.println(ergebnis);
        int zaehler = 1;
        zaehler++;
        System.out.println(zaehler);
        System.out.println(22/6);

        int schalter =  10;
        System.out.println(schalter > 7 && schalter < 12);
        System.out.println(schalter != 10 || schalter == 12);
        String zeichenkette = "Meine Oma "+"fährt im "+"Hühnerstall Motorrad.";
    }
}
