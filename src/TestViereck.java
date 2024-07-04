public class TestViereck {

    public static void main(String[] args) {

        // Objekte erzeugen
        Viereck v = new Viereck(2.5,2.0);

        // Objekte aufrufen
        System.out.println("Flaeche: "+v.berechneFlaeche());
        System.out.println("Umfang: "+v.berechneUmfang());

        // Ändern der Seitenlängen von v auf 4.0 und 4.0
        v.setSeiteA(4.0);
        v.setSeiteB(4.0);

        System.out.println("v ist ein Quadrat: "+v.istQuadrat() );
        v.skalieren(3);
        System.out.println(" Seite A: "+v.getSeiteA()+ ",SeiteB: "+v.getSeiteB());
        System.out.println("Anzahl Vierecke: "+ v.getAnzahlVierecke());
    }
}

