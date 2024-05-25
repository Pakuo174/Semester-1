public class Punkt {
    // ???? Variable festlegen
    private static int x;
    private static int y;


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
    //Methode um den Wert von x zu holen
    public int getX(){
        return x;
    }
    //Methode um den Wert von y zu holen
    public int getY(){
        return y;
    }
}