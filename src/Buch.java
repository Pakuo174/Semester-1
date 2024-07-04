// Your LMS ID: 81380

public class Buch {
    // Instanzvariabeln - static, nur innerhalb der Klasse sichtbar
    private int erscheinungsjahr;
    private double preis;


    //parameterlosen Konstruktor
    public  Buch(){
        erscheinungsjahr = 2000;
        preis = 10.0;
    }
    // zweiter Konstruktor
    public Buch(int erscheinungsjahr, double preis){
        this.erscheinungsjahr = erscheinungsjahr;
        this.preis = preis;
    }
    public int  berechneAlter(int aktuellesJahr){
        return aktuellesJahr - erscheinungsjahr;
    }
    public double verwendeRabatt(double rabatt) {
        // Rabatt berechnen
        double rabattB = preis * (rabatt / 100);
        // Reduziere den Preis um den berechneten Rabattbetrag
        preis -= rabattB;
        // Rückgabe des neuen Preises
        return preis;
    }
    public int getErscheinungsjahr(){
        return erscheinungsjahr;
    }
    public double getPreis(){
        return preis;
    }
    public void setErscheinungsjahr(int erscheinungsjahr){
        this.erscheinungsjahr=erscheinungsjahr;
    }
    public  void setPreis(int preis){
        this.preis = preis;
    }
}
