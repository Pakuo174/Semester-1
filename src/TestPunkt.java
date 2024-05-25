public class TestPunkt {

    public static void main (String[] args){

        //erzeugen eines neuen Objektes p1
        Punkt p1 = new Punkt();
        p1.setX(1); p1.setY(2);


        //x- und y-Koordinaten von p1 auf der Konsole ausgeben, in einer Zeile
        System.out.println("Anfang x = "+ p1.getX()+ " y = "+ p1.getY());

        p1.verschiebe(2,2);

        System.out.println("nachVerschiebung1 x = "+ p1.getX()+ " y = "+ p1.getY());

        //Verschieben Sie p1 um den Vektor (1,-3)
        p1.verschiebe(1,-3);
        //Lassen Sie die x- und y-Koordinaten von p1 ausgeben
        System.out.println("NachVerschiebung2 x = "+ p1.getX() + " y = "+ p1.getY());

        //Erzeugen Sie den zweiten Punkt p2 = (3,5)
        Punkt p2 = new Punkt();
        p2.setX(3);p2.setY(5);

        //Verschieben Sie p2 um den Vektor (0,0)
        p2.verschiebe(0,0);
        //Lassen Sie die x- und y-Koordinaten von p2 ausgeben
        System.out.println("Punkt2 NachVerschiebung1 x = "+ p2.getX() + " y = "+ p2.getY());
        //Erzeugen Sie den dritten Punkt p3 = (2,4)
        Punkt p3 = new Punkt();
        p3.setX(2);p3.setY(4);
    }

}