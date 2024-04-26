import java.util.Scanner;

public class ifelse {

    public static void main (String[] args) {


        int punkte;
        int zusatzp;
        String name;

        System.out.println("Name der Person : ");
        Scanner scan = new Scanner(System.in);
        name = scan.next();

        System.out.println("Anzahl der Punkte von Person " + name );
        Scanner scan2 = new Scanner(System.in);
        punkte = scan2.nextInt();

        System.out.println("Anzahl der Zusatzpunkte von " + name );
        Scanner scan3 = new Scanner(System.in);
        zusatzp = scan3.nextInt();


        //punkte und zusatzpunkte addieren
        int g = punkte + zusatzp;

        //wenn name einen Punktewert von mindestens 50 hat, wird die verschachtelte Schleife gestartet
        //ansonsten else
        if (g >= 50 ){
            // wenn Punktewert gleich 50 ist führe aus Ausgabe mit "gerade so bestanden aus", sonst else
            if (g==50){
                System.out.println(name + " hat " + punkte + " Punkte und " + zusatzp + " Zusatzpunkten die Prüfung gerade so bestanden.");
            } else {
                System.out.println(name + " hat " + punkte + " Punkten und " + zusatzp + " Zusatzpunkte bekommen, womit sie die Prüfung bestanden hat.");

            }}
        else {
            System.out.println(name + " hat " + punkte + " Punkte und " + zusatzp +" Zusatzpunkte erhalten und die Prüfung leider nicht bestanden." );
        }

    }
}