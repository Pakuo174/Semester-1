public class MeinArrayTest {

    public static void main(String[] args) {
        // Array vom Datentyp float wird direkt definiert
       // int[] array1 = null;
        //float [] array2 = {11,16,21};

        // Array vom Datentyp float ist deklariert, aber noch nicht initialisiert ist
        // Indexe alle vom Wert 0
        float [] array3 = new float[4];

        // Array vom Datentyp int definieren
        int [] array4 = new int [2];
        int [] array5 = {21,15,20};





        // gleiche Länge Vergelich zwischen 2 Arrays -> Ausgabe mit true oder false
        //System.out.println(MeinArray.istGleichLang(array1,array2));
        //System.out.println(MeinArray.istGleichLang(array1,array3));

        // Arrayindex an bestimmter Positition i ausgeben
        int i = 3;
        //System.out.println(MeinArray.gibElement(array5,i));

        // Methodenaufruf = summieren aller Elemente des Array
        System.out.println("nach summieren :"+MeinArray.summiere(array5));
        // hier für Mittelwert
        System.out.println("Mittelwert :"+MeinArray.mittelwert(array5));
        // maximalen Wert ausgeben
        System.out.println("maximaler Wert: "+MeinArray.max(array5));



        // Methodenaufruf mit Ausgabe dafür ob alle Indexe gleich sind
        // Aufgabe 8.4a
        // Array vom Datentyp char definieren
        char [] array6 = {'a','b','c'};
        char [] array7 = {'a','s','c'};
        char [] array8 = {'a','b','c'};

        System.out.println(MeinArray.gibErstenIndexUngleicherElemente(array6, array8));
        System.out.println(MeinArray.gibErstenIndexUngleicherElemente(array6, array6));


        // Aufgabe 8.4b
        System.out.println(MeinArray.gibErstesUngleichesElement(array6, array7));
        System.out.println(MeinArray.gibErstesUngleichesElement(array7, array8));


        // Test - Methoden testen, ob sie funktioniert
        try {
            char[] array1 = {'a', 'b', 'c', 'd'};
            char[] array2 = {'a', 'b', 'x', 'd'};

            int ungleicherIndex = MeinArray.gibErstenIndexUngleicherElemente(array1, array2);
            char ungleichesElement = MeinArray.gibErstesUngleichesElement(array1, array2);
            System.out.println("Das erste ungleiche Element ist " + ungleichesElement + " an der Stelle " + ungleicherIndex);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        // Test - Methode testen, ob sie Fehlermeldung für Nullpointer ausgibt

        try {
            char[] array1 = {'a', 'b', 'c', 'd'};
            char[] array2 = null;

            int ungleicherIndex = MeinArray.gibErstenIndexUngleicherElemente(array1, array2);
            char ungleichesElement = MeinArray.gibErstesUngleichesElement(array1, array2);
            System.out.println("Das erste ungleiche Element ist " + ungleichesElement + " an der Stelle " + ungleicherIndex);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }


    }
}
