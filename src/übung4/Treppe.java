package übung4;

import java.util.Scanner;

public class Treppe {
    public static void main(String[] args) {

        int hight;

        Scanner input = new Scanner(System.in);

        System.out.print("Treppenhöhe: ");
        hight = input.nextInt();
        System.out.print("Stufenbreite: ");
        int depth = input.nextInt();

        System.out.println("\n");

        for (int i = 1;i <= hight; i++){
            System.out.println(funnyRepeater("*",depth, i, hight));
        }

    }

    public static String funnyRepeater(String chars ,int count, int step, int hight){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < hight*count-count*step; i++){
            out.append(" ");
        }
        for (int i = 0; i < count*step; i++){
            out.append(chars);
        }
        return out.toString();
    }
}
