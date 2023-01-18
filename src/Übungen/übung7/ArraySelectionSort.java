package Übungen.übung7;

public class ArraySelectionSort {
    public static void main(String[] args) {
        int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
        for (int i: sort(liste)) {
            System.out.println(i);
        }

    }

    private static int[] sort(int[] haystack) {
        int tmp;
        int num = 0;
        int state = 0;
        while (state < haystack.length) {
            tmp = haystack[state];
            int small = Integer.MAX_VALUE;
            for (int i = state; i < haystack.length; i++) {
                if (haystack[i] < small) {
                    small = haystack[i];
                    num = i;
                }
            }
            haystack[state] = small;
            haystack[num] = tmp;
            state++;
        }
        return haystack;
    }

}
