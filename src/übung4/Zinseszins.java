package übung4;

import java.util.Scanner;

public class Zinseszins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben sie die Laufzeit für den Vertrag in Jahren an: ");
        int time = input.nextInt();
        System.out.print("Bitte geben sie an, wie viel Kapital Sie anlegen wollen: ");
        double money = input.nextInt();
        System.out.print("Bitte geben Sie den Jahreszinssatz an: ");
        double interest = input.nextDouble()/100.00;

        double totalMoney = money;
        for (int i = 0; i < time; i++){
            totalMoney += totalMoney * interest;
        }

        System.out.printf("Eingezahltes Kapital: %.2f Euronen",money);
        System.out.printf("\nAusgezahltes Kapital: %.2f Euronen",totalMoney);
    }
}
