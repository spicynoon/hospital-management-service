package sebelumUTS;

import java.util.Scanner;

public class himpunan {
    public static int fx(int n) {
        int hasil;

        if (n == 0) {
            return 1;
        } else {
            hasil = 2 * (n * n);
        }
        return hasil;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "TUGAS ALSTRUKDAT PERTEMUAN 5" +
                        "\n SOAL NO. 1" +
                        "\n f(n) + f(n+1) = 2n^2" +
                        "\n============================");

        System.out.print("input n   : ");
        int hasil = fx(scan.nextInt());
        System.out.println("hasil   : " + hasil);
    }
}
