public class Kinosaal {

    // Instanzvariablen - für Objekte nutzbar
    private int saalNummer;
    private int anzahlSitzplaetzeSaal;
    // Klassenvariablen - nicht für Objekte verwendbar
    private static  int anzahlSitzplaetzeKino;
    private static int anzahlKinosaele;



    //parameterlosen Konstruktor
    public Kinosaal() {
        anzahlKinosaele++;
        saalNummer = anzahlKinosaele;
    }
    public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal){
        this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
        anzahlSitzplaetzeKino = anzahlSitzplaetzeKino + anzahlSitzplaetzeSaal;
    }

    // Getter und Setter für Anzahl der Sitzplätze eines Saals
    public int getAnzahlSitzplaetzeSaal(){
            return anzahlSitzplaetzeSaal;
    }
    public int getAnzahlSitzplaetzeKino(){
        return anzahlSitzplaetzeKino;
    }
    public int getAnzahlKinosaele(){
        return anzahlKinosaele;
    }
    // Getter für saalNummer
    public int getSaalNummer() {
        return saalNummer;
    }
}
