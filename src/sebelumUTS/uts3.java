package semester_1;

import java.util.Queue;
import java.util.Scanner;

public class uts3<T> {
    public static void main(String[] args) {
        uts3<String> antrianTA = new uts3<>();
        Scanner input = new Scanner(System.in);
        boolean run = true;

        System.out.print("input jumlah antrian: ");
        int jumlahData = input.nextInt();

        System.out.println("==================================");
        System.out.println("DAFTAR NAMA YANG AKAN MENGIKUTI TA");
        System.out.println("==================================");

        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("daftar nama ke-" + i + " : ");
            antrianTA.enqueue(input.next());
        }

        System.out.println("==================================");
        System.out.println("=          DAFTAR ANTRIAN        =");
        System.out.println("==================================");

        while (jumlahData != 0) {
            for (int j = 1; j <= jumlahData; j++) {
                System.out.print("input 0 untuk melihat giliran: ");
                int random = input.nextInt();

                if (random >= 0) {
                    System.out.println(j + ". " + antrianTA.dequeue() + " silahkan bimbingan");
                }
                System.out.println("==================================");
            }
        }
    }

    private class Node {
        T item;
        Node next;

        Node(T t) {
            item = t;
            next = null;
        }

        public String toString() {
            return item.toString();
        }
    }

    private Node antrianTerdepan, antrianTerbelakang;

    uts3() {
        antrianTerdepan = null;
        antrianTerbelakang = null;
    }

    public boolean cekKosong() {
        return antrianTerdepan == null;
    }

    public void enqueue(T t) {
        Node oldTerbelakang = antrianTerbelakang;
        antrianTerbelakang = new Node(t);
        if (cekKosong())
            antrianTerdepan = antrianTerbelakang;
        else
            oldTerbelakang.next = antrianTerbelakang;
    }

    public T dequeue() {
        if (cekKosong()) {
            return null;
        }

        if (antrianTerdepan == antrianTerbelakang) {
            T t = (T) antrianTerdepan.item;
            antrianTerdepan = antrianTerbelakang = null;
            return t;
        }

        T t = (T) antrianTerdepan.item;
        antrianTerdepan = antrianTerdepan.next;
        return t;
    }

    public String toString() {
        if (antrianTerdepan == null)
            return null;

        if (antrianTerdepan == antrianTerbelakang)
            return antrianTerdepan.item.toString();

        StringBuffer sb = new StringBuffer();
        Node cur = antrianTerdepan;
        while (cur != antrianTerbelakang) {
            sb.append(cur.item.toString() + "\n");
            cur = cur.next;
        }

        sb.append(antrianTerbelakang.item.toString());
        return sb.toString();
    }
}