public class Punkt {
    //  Instanzvariable festlegen
    private int x;
    private int y;
    private final int Obergrenze = 10;
    private final int Untergrenze = -10;


    public void setX (int i) {
        x = i;
    }

    public void setY (int i) {
        y = i;
    }

    // von der Klasse TestPunkt die Parameter nutzen
    public void verschiebe(int deltaX, int deltaY){
        x = x + deltaX;
        y = y + deltaY;
    }
    // Methode zum verschieben der Werte um 1
    public void verschiebeUmEins(){
        x = x +1;
        y = y +1;
    }
    // Methode um zu erkennen ob x und y der Urspung sein
    public boolean istUrsprung(int x, int y){
        return x == 0 && y == 0;
    }

    // Methode die Punkte nur mit Vorraussetzung verschiebt 7.2
    public void verschiebeInnerhalb(int deltaX, int deltaY){
        int bigx = deltaX +getX();
        int bigy= deltaY + getY();
        if (bigx>Obergrenze || bigx<Untergrenze|| bigy>Obergrenze||bigy<Untergrenze ){
            System.out.println("Punkt wird nicht verschoben da "+ deltaX +" ist zu groß oder " + deltaY +" zu klein !!!! " );
        }else {
            verschiebe(deltaX,deltaY);
        }
    }

    //Methode um den Wert von x zu holen
    public int getX(){
        return x;
    }
    //Methode um den Wert von y zu holen
    public int getY(){
        return y;
    }
}