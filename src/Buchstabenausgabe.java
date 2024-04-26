public class Buchstabenausgabe {
    public static void main(String[] args) {

        //Buchstaben von A bis Z ausgeben


        char buchstabe = 65;

        int i;
        for (i = 0; i < 26; i++) {
            System.out.println(buchstabe);
            buchstabe = (char) (buchstabe+1);

        }

    }
}