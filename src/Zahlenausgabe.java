public class Zahlenausgabe {

    public static void main(String[] args) {

        //initlialisieren der Varibale für Anfangszahl


        //while (i <= 100)
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print("   "); // Tab for single-digit numbers
            } else {
                System.out.print("  "); // Tab for double-digit numbers
            }
            // Print a new line after every tenth number, wenn von i der Rest == 0 ist
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}