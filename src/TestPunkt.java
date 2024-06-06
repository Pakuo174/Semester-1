public class TestPunkt {

    public static void main (String[] args){

        //erzeugen eines neuen Objektes
        Punkt p1 = new Punkt();
        p1.setX(2); p1.setY(-3);

        Punkt p2 = new Punkt();
        p2.setX(2);p2.setY(2);

        Punkt p3 = new Punkt();
        p3.setX(7);p3.setY(-1);

        // Methodenaufrufe und Ausgabe für p1
        System.out.println("Anfang x = "+ p1.getX()+ " y = "+ p1.getY());
        p1.verschiebeUmEins();
        System.out.println("p1 nachdem um 1 verschoben x: " +p1.getX()+ " y: " + p1.getY() );
        p1.verschiebe(2,2);
        System.out.println("nachVerschiebung1 x = "+ p1.getX()+ " y = "+ p1.getY());
        p1.verschiebe(1,-3);
        System.out.println("NachVerschiebung2 x = "+ p1.getX() + " y = "+ p1.getY());

        // Methodenaufrufe und Ausgabe für p2 und p3
        System.out.println("\nPunkt 2, Anfang : " + p2.getX() +" "+ p2.getY());
        System.out.println("Punkt 3, Anfang : " + p3.getX() +" "+ p3.getY());
        // Verschieben von p2 um die Differenz zu p3, um ihn mit p3 zu überlappen
        p2.verschiebe(p3.getX() - p2.getX(), p3.getY() - p2.getY());
        System.out.println("\nPunkt 2, nach Verschiebung: " + p2.getX() + " " + p2.getY());

        // Überprüfen, ob p2 und p3 auf dasselbe Objekt zeigen
        System.out.println("P2 und P3 zeigen auf dasselbe Objekt: " + (p2 == p3)); // false, da selbe Werte stimmen ,jedoch auf anderen Objekt zeigt

        // Ändern der Koordinaten von p3 und Überprüfen, was mit den Koordinaten von p2 passiert
        p3.setX(5);
        p3.setY(5);
        System.out.println("Punkt 2, nach Änderung von p3: " + p2.getX() + " " + p2.getY());
            //p3.verschiebe(1,1);
            //System.out.println("\nPunkt 2, nach verschiebung von p3 : " + p2.getX() +" "+ p2.getY());

        // Methodenaufruf für verschiebe mit Grenzen || 7.2
        System.out.println("\n p1 vorher " +p1.getX() + " " + p1.getY() );
        p1.verschiebeInnerhalb(5,-2);
        System.out.println("funkioniert für p1 : " + p1.getX() + p1.getY());







    }

}