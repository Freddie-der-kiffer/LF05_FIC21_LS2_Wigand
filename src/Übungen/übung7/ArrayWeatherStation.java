package Übungen.übung7;

public class ArrayWeatherStation {
    public static void main(String[] args) {
        double[] wetterdaten = { -15.55, -2.55, -11.44, -8.6, -14.4, -5.17, 1.48, -3.47, 2.00, 2.14, 4.05, 7.45, 3.25, 5.04, 11.4, 7.67, 8.64, 13.28, 6.87, 15.54, 12.45, 16.55, 20.42, 22.38, 19.58, 18.85, 23.84, 24.42, 25.54, 28.35, 30.16, 32.44, 26.55, 22.13, 16.64, 13.33, 16.45, 17.34, 15.33, 11.13, 15.16, 11.44, 6.55, 2.13, 6.64, 3.33, 6.45, -1.34, 5.33, -11.15 };

        System.out.println("Anzahl der Daten: " + wetterdaten.length);
        System.out.println("Durchschnittstemperatur: " + mean(wetterdaten));
        System.out.println("Minimum: " + smallest(wetterdaten));
        System.out.println("Maximum: " + highest(wetterdaten));
        System.out.println("Umschwung: " + highestDiff(wetterdaten));
    }

    private static double mean(double[] haystack){
        double value = 0;
        for (double i: haystack) {
            value += i;
        }
        return value / haystack.length;
    }

    private static double smallest(double[] haystack){
        double small = Double.MAX_VALUE;
        for (double i: haystack){
            if (i < small){
                small = i;
            }
        }
        return small;
    }

    private static double highest(double[] haystack){
        double high = Double.MIN_VALUE;
        for (double i: haystack){
            if (i > high){
                high = i;
            }
        }
        return high;
    }

    private static double highestDiff(double[] haystack){
        double diff = Double.MIN_VALUE;
        double last = 0;
        for (double i: haystack){
            if (last - i > diff){
                diff = last - i;
            }
            last = i;
        }
        return diff;
    }
}

