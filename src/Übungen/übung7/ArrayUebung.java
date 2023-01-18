package Übungen.übung7;

public class ArrayUebung {

    public static void main(String args[]) {

        // 1. Deklaration eines Arrays für ganze Zahlen.
        int[] intArr;

        // 2. Initialisierung des Arrays mit 100 Elementen.

        intArr = new int[100];

        // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.

            intArr[i] = i + 1;
        }

        // 5. Geben Sie den Wert an der Stelle 89 des Arrays aus.
        System.out.println();
        System.out.println(intArr[89]);
        System.out.println();

        // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.

        intArr[49] = 1060;

        // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2020.

        intArr[0] = 2020;
        intArr[99] = 2020;

        // 7. Erneutes ausgeben des Arrayinhalts.
        // Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)

        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Index " + i + " - Inhalt: " + intArr[i]);
            // 8. Berechnung des Durchschnitts aller Arrayelemente

            sum = 0;
            sum += intArr[i];
        }
        System.out.println();
        System.out.println("durchschnitt: " + sum / 100);
    }

}