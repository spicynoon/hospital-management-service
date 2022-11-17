package sebelumUTS;

import java.util.Scanner;

public class uts2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("   PROGRAM NILAI MAHASISWA   ");
        System.out.println("=============================");

        System.out.println("silahkan input data berikut ");
        System.out.print("nama            :");
        String namaMahasiswa = str.next();
        System.out.print("nilai           :");
        int nilaiMahasiswa = input.nextInt();

        System.out.println("=============================");
        System.out.println("   PROGRAM NILAI MAHASISWA   ");
        System.out.println("        SKALA 1 - 100        ");
        System.out.println("=============================");

        System.out.println("NAMA        : " + namaMahasiswa);
        System.out.println("NILAI       : " + nilaiMahasiswa);

        if (nilaiMahasiswa < 50) {
            System.out.println("HURUF MUTU  : E");
        } else if (nilaiMahasiswa < 60) {
            System.out.println("HURUF MUTU  : D");
        } else if (nilaiMahasiswa < 70) {
            System.out.println("HURUF MUTU  : C");
        } else if (nilaiMahasiswa < 80) {
            System.out.println("HURUF MUTU  : B");
        } else if (nilaiMahasiswa < 100) {
            System.out.println("HURUF MUTU  : A");
        } else if (nilaiMahasiswa < 0 || nilaiMahasiswa > 100) {
            System.out.println("perhatikan nilai yang anda input");
        }
    }
}
