public class MeinArray {



    // es soll eine Klassenmethode genutzt werden, daher static !
    // in der Klassenmethode soll vergleichen werden ob Array gleich lang wären
    public static boolean istGleichLang(float []array1, float []array2){
        if (array1.length == array2.length){
            return true;
        }
        else{
            return false;
        }

    }
    // Ausgabe von allen Werten innerhalb des Array
    public  static void printArray(int[] array){
        for (int i =0;i<array.length;i++){

            System.out.println(array[i]);
        }
    }
    // Index an der Stelle i zurückgeben
    public static int gibElement(int[] array, int i) throws IllegalArgumentException, ArrayIndexOutOfBoundsException{
        // bei Fehlern gebe folgende Fehler aus
        if (array == null) throw new IllegalArgumentException("Array ist null");
        if (i < 0|| i >= array.length) throw new ArrayIndexOutOfBoundsException(" Index falsch");

        return array[i];
    }
    // summieren mittels einer for Schleife: mit Abbruchsbedingung anhand der Schleifenlänge
    public static int summiere(int[] array){
        int summe = 0;
        for (int i =0; i<array.length;i++){
            summe += array[i];
        }
        return summe;
    }
    // summieren mittels einer for Schleife: mit Abbruchsbedingung anhand der Schleifenlänge, zum Schluss /2 für Mittewert
    public static double mittelwert(int[] array) {
        return (double) summiere(array) / (double) array.length;
    }
    public static int max(int [] array)throws NullPointerException,IllegalArgumentException{
        if(array == null){
            throw new NullPointerException("Array ist null ! ");
        }
        if (array.length == 0){
            throw new IllegalArgumentException("Array darf keine Länge von 0 haben ! ");

        }
        int temp; // temporäre Zwischenspeicher zum addieren
        int max = 0; // Speicher für Maxwert
        for (int i = 0;i<array.length;i++){
            temp = array[i];

            if(temp > max ){
                max = temp;
            }
        }
        return max;
    }

    // In der Klassenmethode wird verglichen, ob Array gleiche Werte haben
    public static boolean istGleich(float []array1, float []array2){

        for (int i =0; i < array1.length;i++){

            if (array1[i] != array2[i]){

                return false;
            }

        }
        return true;
    }
    public static int gibErstenIndexUngleicherElemente(char [] array1, char [] array2)throws IllegalArgumentException,NullPointerException{

        if (array1 == null || array2 == null ){
            throw new NullPointerException("Array darf nicht null sein ! ");
        }
        if (array1.length == 0 || array2.length == 0){
            throw new IllegalArgumentException("Array darf keine Länge von 0 haben ! ");
        }

        for (int i =0; i < array1.length;i++){

            int minLength = array1.length;

            if (array1.length > array2.length) {    // wenn array 2 kürzer ist -> soll sich an dieser Länge orientiert werden
                minLength = array2.length;
            }
            // Kontrolle ob jedes Index identisch ist
            for (i = 0; i < minLength; i++) {
                if (array1[i] != array2[i]) {
                    return i;
                }
            }

            if (array1.length != array2.length) { // wenn die Länge unterschiedlich ist
                return minLength;
            }

        }
        return -1; // Spezielles Zeichen, das anzeigt, dass alle Elemente gleich sind
    }
    // Aufgabe 8.4b
    public static char gibErstesUngleichesElement(char[] array1, char[] array2)throws IllegalArgumentException,NullPointerException {
        if (array1 == null || array2 == null ){
            throw new NullPointerException("Arrays dürfen nicht null sein ! ");
        }
        // Überprüfe, ob das 1. Array leer ist
        if (array1.length == 0) {
            throw new IllegalArgumentException("Das 1. Array darf nicht leer sein.");
        }

        int index = gibErstenIndexUngleicherElemente(array1, array2); // Methode gibErstenIndexUngleicherElemente wird aufgerufen (Methode über dieser hier)
        if (index >= 0 && index < array1.length) {      // wenn Index größer oder gleich 0 ist .... UND  kleiner als die Länge des 1.Arrays gebe array1 an dieser Stelle Index zurück
            return array1[index];
        }
        if (index == -1) {
            throw new IllegalArgumentException("Beide Arrays sind gleich.");
        }
        return ' ';
    }




}
