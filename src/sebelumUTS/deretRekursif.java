package sebelumUTS;

import java.util.Scanner;

public class deretRekursif {
    public static int deret(int i, int n) {
        if (i < n) {
            System.out.print(i + "+");
            return i + deret(i + 1, n);
        } else if (i == n) {
            System.out.print(i + "=");
            return i + deret(i + 1, n);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "TUGAS ALSTRUKDAT PERTEMUAN 5" +
                        "\n SOAL NO. 2" +
                        "\n S = 1+2+3+..+n" +
                        "\n============================");
        System.out.print("input jumlah deret: ");
        int hasil = deret(1, scan.nextInt());
        System.out.println(hasil);
    }
}
