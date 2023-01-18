package Übungen.übung5;

public class Volumen {
    public static void main(String[] args) {
        System.out.println(calcVolume(1));
        System.out.println(calcVolume(2));
    }

    private static double calcVolume(double a) {
        return a * a * a;
    }
}
