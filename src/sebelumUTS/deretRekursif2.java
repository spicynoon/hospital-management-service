package sebelumUTS;

import java.util.Scanner;

public class deretRekursif2 {
    public static int deret(int i, int n) {
        if (i < n) {
            System.out.print(i * 2 + " + ");
            return i * 2 + deret(i + 1, n);
        } else if (i == n) {
            System.out.print(i * 2 + " = ");
            return i * 2 + deret(i + 1, n);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "TUGAS ALSTRUKDAT PERTEMUAN 5" +
                        "\n SOAL NO. 3" +
                        "\n S = 2 + 4 + 6 + .. + n" +
                        "\n============================");
        System.out.print("input jumlah deret: ");
        int hasil = deret(1, scan.nextInt());
        System.out.println(hasil);
    }
}
