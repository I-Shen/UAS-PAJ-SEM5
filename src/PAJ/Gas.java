package PAJ;

import java.util.Scanner;

public class Gas {
    public Gas(){
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("PROGRAM SIMULASI CHAT DENGAN DOI");
            System.out.println("Buktikan anda bukan robot");
            System.out.println("Ketikkan lima satu tiga tujuh");
            System.out.print("Masukkan Angka = ");
            String inp = input.nextLine();
            int num = Integer.parseInt (inp) ;

            System.out.println("Meskipun anda memasukkan angka " + num + " tetapi itu membuktikan bahwa anda bukan robot :)))");
            System.out.println("Sebentar lagi program akan terbuka ^-^");
            new Kelas();
        } catch(NumberFormatException e) {
            System.out.println("ANGKA WOY");
        }
    }
}
