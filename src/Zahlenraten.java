import java.util.Scanner;

public class Zahlenraten {


    public static void main(String[] args) {

        //initliasieren der Variabeln
        int zahl;
        int zufallszahl;

        //Zufallszahl wird hier berechnet von 1 -20
        int Min = 1;
        int Max = 200;
        zufallszahl = Min + (int) (Math.random() * (Max - Min+1));

        //abfragen der Zahl die Person erraten soll
        System.out.print("Ich denke mir eine Zahl zwischen "+ Min +" und "+ Max +" Rate diese Zahl! : ");
        Scanner scan = new Scanner(System.in);
        zahl = scan.nextInt();




        if (zahl==zufallszahl){
            System.out.println("\nDu hast meine Zahl  beim 1. Versuch erraten, bist du etwa ein Magier ?=====> :D");
            }
                else{
                    for(int i=1;zahl != zufallszahl;i++){

                        System.out.println(i + ".Versuch: " + zahl);

                            if (zahl > zufallszahl){

                                System.out.println("Meine Zahl ist kleiner !");
                            }else{
                                System.out.println("Meine Zahl ist größer !");
                            }

                            if(zahl!=zufallszahl){

                                System.out.print("rate nochmal du Pisser!! : ");
                                Scanner scan2 = new Scanner(System.in);
                                zahl = scan2.nextInt();
                            }
                            if (zahl==zufallszahl) {
                                System.out.println("Du hast meine Zahl beim " + ++i + " .Versuch erraten.");
                            }




                        }





         }


    }
}

