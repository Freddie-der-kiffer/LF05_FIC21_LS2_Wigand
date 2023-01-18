package Übungen.übung3;

public class Tabelle {
    public static void main(String[] args) {
        System.out.printf("%-12s|%10s\n","Fahrenheit","Celsius");
        int i = 0;
        while (i < 23){
            System.out.print("-");
            i++;
        }
        System.out.printf("\n%-12d|%10.2f",-20,-28.8889);
        System.out.printf("\n%-12d|%10.2f",-10,-23.3333);
        System.out.printf("\n%-12d|%10.2f", 0,-17.7778);
        System.out.printf("\n%-12d|%10.2f",20,-6.6667);
        System.out.printf("\n%-12d|%10.2f",30,-1.1111);

    }
}
