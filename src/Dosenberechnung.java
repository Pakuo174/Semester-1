import java.util.Scanner;


public class Dosenberechnung {

    public static void main(String[] args) {

            final double PI = 3.141592;

            double u = 40; // geeignete Testwerte für Länge u (Umfang der Dose in Zentimetern)
            double h = 15; // geeignete Testwerte für Breite h (Höhe der Dose in Zentimetern)

        double dboden = u / PI;
        double fboden = PI * (dboden/2) * (dboden/2);
        double fmantel = u * h;
        double fgesamt = 2 * fboden + fmantel;
        double v = fboden * h;

        //temporärer Wert für die Eingabe
        int eingabe=5;

        System.out.println("DOSENBERECHNUNG");
        System.out.println("Berechnung (Zahl eingeben)");
        System.out.println("-----------------------------------");
        System.out.println("Durchmesser des Dosenbodens (1)");
        System.out.println("Flaeche des Dosenbodens (2)");
        System.out.println("Mantelflaeche der Dose (3)");
        System.out.println("Gesamtflaeche der Dose (4)");
        System.out.println("Volumen der Dose (5)");
        System.out.println("Programmende (0)");
        Scanner scan = new Scanner(System.in);



        while (eingabe !=0){
            eingabe = scan.nextInt();
            switch (eingabe){
                case 0:break;
                case 1: System.out.println("Durchmesser des Dosenbodens: " + dboden); break;
                case 2: System.out.println("Flaeche des Dosenbodens:" + fboden); break;
                case 3: System.out.println("Mantelflaeche der Dose: " + fmantel); break;
                case 4: System.out.println("Gesamtflaeche der Dose: " + fgesamt); break;
                case 5: System.out.println("Volumen der Dose: " + v); break;
                default: System.out.println("Ungueltige Eingabe");

            }
        }
    }
}
