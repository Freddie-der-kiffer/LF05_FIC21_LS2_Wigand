package übung5;

public class Urlaub {

    /*
    *   USA: 1 Euro > 0, 98 USD (Dollar)
    *   Japan: 1 Euro > 141 JPY (Yen)
    *   England: 1 Euro > 0,88 GBP (Pfund)
    *   Schweiz: 1 Euro > 0,96 CHF (Franken)
    *   Dänemark: 1 Euro > 7,44 DKK (Kronen)
    **/
    public static void main(String[] args) {


    }

    private static double umrechner(double betrag, String zielLand){
        String wearung;
        switch(zielLand){
            case "USA":
                betrag = betrag * 0.98;
                wearung = "USD";
                break;
            case "Japan":
                betrag = betrag * 141;
                wearung = "JPY";
                break;
            case "England":
                betrag = betrag * 0.88;
                wearung = "GBP";
                break;
            case "Schweiz":
                betrag = betrag * 0.96;
                wearung = "CHF";
                break;
            case "Dänemark":
                betrag = betrag * 7.44;
                wearung = "DKK";
            default:
                wearung = "EUR";

            return

        }
    }
}
