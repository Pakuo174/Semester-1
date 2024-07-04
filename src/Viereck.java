public class Viereck {

    // Instanzvariablen zum repräsentieren der Seitenlängen
    private double seiteA;
    private double seiteB;
    private static int anzahlVierecke;


    public Viereck(double a,double b){
        this.seiteA=a;
        this.seiteB=b;
        anzahlVierecke++;
    }
    public double getSeiteA(){
        return seiteA;
    }
    public double getSeiteB(){
        return  seiteB;
    }
    public static int getAnzahlVierecke(){
        return anzahlVierecke;
    }
    public void setSeiteA(double a){
        this.seiteA = a;
    }
    public void setSeiteB(double b){
        this.seiteB =b;
    }
    public double berechneFlaeche(){
        return seiteA * seiteB;
    }
    public double berechneUmfang(){
        return 2 * seiteA+ 2 * seiteB;
    }
    public boolean istQuadrat(){
        return seiteA == seiteB;
    }
    public void skalieren(int faktor){
        this.seiteA *= faktor;
        this.seiteB *= faktor;
    }

}
