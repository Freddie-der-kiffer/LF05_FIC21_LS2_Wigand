package Übungen.übung7;

public class ArraySearch {

    public static void main(String[] args) {

        int[] zahlenArray = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};
        search(zahlenArray, 2);

        int[] zahlenArray2 = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
        search(zahlenArray2, 3);
    }

    private static void search(int[] haystack, int needle) {
        boolean found = false;
        for (int i: haystack) {
            if (i == needle) {
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Gefunden!");
        } else {
            System.out.println("Nicht gefunden!");
        }
    }
}
