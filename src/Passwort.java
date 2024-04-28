import java.util.Scanner;

public class Passwort {


    public static void main(String[] args) {

        // Variabeln
            final int passwort = 12345;
            int eingabe;
            int versuch =1;


        // Schleife soll nur bis zu 3 mal ausgeführt werden
            while (versuch < 4){

                System.out.println("BITTE PASSWORD EINLESEN, Versuch " + versuch);
                Scanner scan = new Scanner(System.in);
                eingabe = scan.nextInt();


                    if (eingabe==passwort){

                        System.out.println("WILLKOMMEN");break;

                    } else if(eingabe!=passwort){

                            System.out.println("Fehler");

                        }


                //Versuche um 1 nach Abfrage und fehlschlag erhöhen
                versuch++;
                    if (versuch ==4){
                        System.out.println("ABBRUCH");continue;
                    }

                    }


            }




    }


