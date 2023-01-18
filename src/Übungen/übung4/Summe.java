package Übungen.übung4;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie bitte eine Zahl ein: ");
        int number = input.nextInt();

        System.out.println("\nDie Zahlen werden addiert:");
        int output = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            output += i;


            System.out.println("\nDie Summe beträgt: " + output);
        }
    }
}
