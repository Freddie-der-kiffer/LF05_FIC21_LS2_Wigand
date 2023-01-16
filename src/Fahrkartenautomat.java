import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        double zuZahlenderBetrag;
        double eingezahlterGesamtbetrag;

        begruessung(false);
        zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
        eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
        fahrkartenAusgeben();
        rueckgeldAusgeben(eingezahlterGesamtbetrag, zuZahlenderBetrag);

        tastatur.close();
    }

    private static void begruessung(boolean back) {
        System.out.println("Fahrkartenbestellvorgang:\n=========================\n");
        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
        if(back){
            System.out.println("\tKurzstrecke AB [2,00 EUR] (1)\n" +
                    "\tEinzelfahrschein AB [3,00 EUR] (2)\n" +
                    "\tTageskarte AB [8,80 EUR] (3)\n" +
                    "\t4-Fahrten-Karte AB [9,40 EUR] (4)\n" +
                    "\tBezahlen (9)\n");
        }
        else {
            System.out.println( "\tKurzstrecke AB [2,00 EUR] (1)\n" +
                    "\tEinzelfahrschein AB [3,00 EUR] (2)\n" +
                    "\tTageskarte AB [8,80 EUR] (3)\n" +
                    "\t4-Fahrten-Karte AB [9,40 EUR] (4)\n");
        }
    }

    private static double fahrkartenbestellungErfassen(Scanner eingabe){
        int ticketAnzahl = 0;
        int ticketWahl;
        double ticketPreis = 0;
        boolean anzahlSet = false;
        boolean boolPay = false;
        double zuZahlenderBetrag;

        while(ticketPreis == 0){
            System.out.print("\nIhre Wahl: ");
            ticketWahl = eingabe.nextInt();
            switch (ticketWahl) {
                case 1 -> ticketPreis = 2.00;
                case 2 -> ticketPreis = 3.00;
                case 3 -> ticketPreis = 8.80;
                case 4 -> ticketPreis = 9.40;
                default -> System.out.println(">>falsche Eingabe<<");
            }
        }

        //Ticket Anzahl setzen
        while (!anzahlSet) {
            System.out.print("Anzahl der Tickets: ");
            ticketAnzahl = eingabe.nextInt();
            if (ticketAnzahl < 1 || ticketAnzahl > 10) {
                System.out.println("Wählen Sie bitte eine Anzahl von 1 bis 10 Tickets aus.");
                continue;
            }
            anzahlSet = true;
        }

        zuZahlenderBetrag = ticketAnzahl * ticketPreis;

        System.out.println("\nZwischensumme: "+zuZahlenderBetrag+"€\n");

        //repeat
        while(!boolPay){
            ticketPreis = 0;
            anzahlSet = false;
            begruessung(true);
            while (ticketPreis == 0 && !boolPay) {
                System.out.print("\nIhre Wahl: ");
                ticketWahl = eingabe.nextInt();
                switch (ticketWahl) {
                    case 1 -> ticketPreis = 2.00;
                    case 2 -> ticketPreis = 3.00;
                    case 3 -> ticketPreis = 8.80;
                    case 4 -> ticketPreis = 9.40;
                    case 9 -> boolPay = true;
                    default -> System.out.println(">>falsche Eingabe<<");
                }
            }

            //Ticket Anzahl setzen
            while (!anzahlSet && !boolPay) {
                System.out.print("Anzahl der Tickets: ");
                ticketAnzahl = eingabe.nextInt();
                if (ticketAnzahl < 1 || ticketAnzahl > 10) {
                    System.out.println("Wählen Sie bitte eine Anzahl von 1 bis 10 Tickets aus.");
                    continue;
                }
                anzahlSet = true;
            }

            zuZahlenderBetrag += ticketAnzahl * ticketPreis;

            System.out.println("\nZwischensumme: " + zuZahlenderBetrag + "€\n");
        }

        return zuZahlenderBetrag;
    }

    private static double fahrkartenBezahlen(Scanner eingabe, double betrag){
        double nochZuZahlen;
        double eingezahlterGesamtbetrag = 0;

        while (eingezahlterGesamtbetrag < betrag) {
            nochZuZahlen = betrag - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f Euro ",  nochZuZahlen);
            System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
            var eingeworfen = ""+eingabe.nextDouble();
            eingezahlterGesamtbetrag = switch (eingeworfen) {
                case "0.05", "0.1", "0.2", "0.5", "1.0", "2.0", "5.0", "10.0", "20.0" ->
                        eingezahlterGesamtbetrag + Double.parseDouble(eingeworfen);
                default -> eingezahlterGesamtbetrag;
            };
        }

        return eingezahlterGesamtbetrag;
    }

    private static void fahrkartenAusgeben(){
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");
    }

    private static void rueckgeldAusgeben(double gezahlt, double betrag){
        double rueckgabebetrag;
        rueckgabebetrag = gezahlt - betrag;
        if (rueckgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro ", rueckgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            rueckgabebetrag = muenzRueckgabe(rueckgabebetrag);
            if (rueckgabebetrag == 0.05) { // 5-Cent-Münzen
                System.out.println("5 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.05;
            }
        }
        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                + "Wir wünschen Ihnen eine gute Fahrt.");
    }
    private static double muenzRueckgabe(double betrag){
        while (betrag >= 2.0) { // 2-Euro-Münzen
            System.out.println("2 Euro");
            betrag = betrag - 2.0;
        }
        while (betrag >= 1.0) { // 1-Euro-Münzen
            System.out.println("1 Euro");
            betrag = betrag - 1.0;
        }
        while (betrag >= 0.5) { // 50-Cent-Münzen
            System.out.println("50 Cent");
            betrag = betrag - 0.5;
        }
        while (betrag >= 0.2) { // 20-Cent-Münzen
            System.out.println("20 Cent");
            betrag = betrag - 0.2;
        }
        while (betrag >= 0.1) { // 10-Cent-Münzen
            System.out.println("10 Cent");
            betrag = betrag - 0.1;
        }
        return betrag;
    }
}