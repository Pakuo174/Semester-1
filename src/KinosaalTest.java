public class KinosaalTest {

    public static void main(String[] args) {

        // erzeugen von Objekten
        Kinosaal k1 = new Kinosaal();
        k1.setAnzahlSitzplaetzeSaal(35);
        System.out.println("Kinosaal "+ k1.getSaalNummer() +" Anzahl Sitzplätze : " + k1.getAnzahlSitzplaetzeSaal());
        Kinosaal k2 = new Kinosaal();
        k2.setAnzahlSitzplaetzeSaal(50);
        System.out.println("Kinosaal "+ k2.getSaalNummer() +" Anzahl Sitzplätze : " + k2.getAnzahlSitzplaetzeSaal());
        Kinosaal k3 = new Kinosaal();
        k3.setAnzahlSitzplaetzeSaal(100);
        System.out.println("Kinosaal "+ k3.getSaalNummer() +" Anzahl Sitzplätze : " + k3.getAnzahlSitzplaetzeSaal());
        System.out.println("Anzahl der Kinosäle = " + k3.getAnzahlKinosaele());
        System.out.println("Gesamtzahl Sitzplaetze: " + k3.getAnzahlSitzplaetzeKino());


        // Ausgabe der Anzahl von Sitzplätzen


    }
}
