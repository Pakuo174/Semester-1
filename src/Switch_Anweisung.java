public class Switch_Anweisung {


    public static void main(String[] args) {
        int anzahlKinder = 1;
        int kindergeld = 1000;
        switch (anzahlKinder) {
            //case 0: kindergeld = 0; break;
            //case 1: kindergeld = 1000; break;
            //case 2: kindergeld = 2200; break;
            default: kindergeld = anzahlKinder * 1500;
        }
        System.out.println("Kindergeld beträgt " + kindergeld + " EUR.");
    }
}