package Übungen.übung4;

public class Schleifen {
    public static void main(String[] args) {
        int i;
        for(i=10; i<=20; i=i+1) {
            System.out.printf("%d ", i*i);
        }
        System.out.println();
        i = 10;
        while(i <=20) {
            System.out.printf("%d ", i*i);
            i = i+1;
        }
        System.out.println();
        i = 9;
        while(i <=20) {
            if (i == 18) break;
            i++;
            if (i == 11) continue;
            System.out.printf("%d ", i*i);
        }
    }
}
