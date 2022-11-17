package pertemuan10;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;

public class tugas10 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner in = new Scanner(System.in);
        ArrayList<String> aList = new ArrayList<String>();
        TreeSet<String> tSet = new TreeSet<String>();

        while (run) {
            System.out.println("==================================================");
            System.out.print("1. Array List\n2. Tree Set\n3. Keluar\napa yang anda plih: ");
            int pilihan = in.nextInt();

            if (pilihan == 1) {
                boolean run2 = true;

                while (run2) {
                    System.out.print("1. Menambahkan\n2. Menghapus\n3. Menampilkan\napa yang anda pilih: ");
                    int pilihan2 = in.nextInt();

                    if (pilihan2 == 1) {
                        System.out.print("berapa jumlah data yang ingin di input: ");
                        int jumlah1 = in.nextInt();

                        for (int i = 1; i <= jumlah1; i++) {
                            System.out.print("Data ke-" + i + " :");
                            aList.add(in.next());
                        }
                    } else if (pilihan2 == 2) {
                        System.out.print("masukan index yang ingin di hapus: ");
                        int hapus = in.nextInt();
                        aList.remove(hapus);
                        System.out.println("Data Terbaru: " + aList);
                    } else if (pilihan2 == 3) {
                        System.out.println("Data Terbaru: " + aList);
                    } else
                        System.out.println("periksa kembali inputan");
                    run2 = false;
                }

            } else if (pilihan == 2) {
                boolean run3 = true;

                while (run3) {
                    System.out.print("1. Menambahkan\n2. Menghapus\napa yang anda pilih: ");
                    int pilihan3 = in.nextInt();

                    if (pilihan3 == 1) {
                        System.out.print("berapa jumlah data yang ingin di input: ");
                        int jumlah1 = in.nextInt();

                        for (int i = 1; i <= jumlah1; i++) {
                            System.out.print("Data ke-" + i + " :");
                            tSet.add(in.next());
                        }
                    } else
                        System.out.println("periksa kembali inputan");
                    run3 = false;
                }
            } else if (pilihan == 3) {
                System.out.println("anda keluar dari program");
                run = false;
            } else
                System.out.println("periksa kembali pilihan");
        }
    }
}