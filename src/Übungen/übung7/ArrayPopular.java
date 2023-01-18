package Übungen.übung7;

public class ArrayPopular {

    public static void main(String[] args) {


        int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};
        popular(zahlen);

    }

    private static int countOf(int[] haystack, int needle){
        int count = 0;
        for (int i: haystack) {
            if (i == needle){
                count++;
            }
        }
        return count;
    }

    private static void popular(int[] haystack){
        int high = 0;
        int num = 0;
        for (int i = 0; i < haystack.length; i++) {
            int count = countOf(haystack, i);
            if (count > high){
                high = count;
                num = haystack[i];
            }
        }
        System.out.printf("Häufigste Zahl: %d (%d Vorkommen)", num, high);
    }
}
