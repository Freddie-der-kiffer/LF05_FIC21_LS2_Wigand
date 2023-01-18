package Übungen.übung3;

import java.util.Scanner;
public class Kalender {
    public static void main(String[] args) {
        int tage = 0;
        int monat;
        int wahl;

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wie lautet der Monat (1-12): ");
        monat = tastatur.nextInt();

        if (monat == 2){
            wahl = 2;
        }
        else if (monat%2 == 0){
            wahl = 3;
        }
        else {
            wahl = 1;
        }

        switch (wahl){
            case 1:
                tage = 31;
                break;
            case 2:
                tage = 28;
                break;
            case 3:
                tage = 30;
                break;
            default:
                tage = -1;
        }

        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
        tastatur.close();
    }
}