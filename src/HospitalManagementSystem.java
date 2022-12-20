package hmsProject;

import java.util.Scanner;

class Node {
    int data;
    String name;
    Node left;
    Node right;

    public Node(int data, String name) {
        this.data = data;
        this.name = name;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Method untuk menambahkan pasien ke dalam binary tree
    public void addPatient(int patientId, String patientName) {
        root = addPatientRecursive(root, patientId, patientName);
    }

    // Method rekursif untuk menambahkan pasien ke dalam binary tree
    private Node addPatientRecursive(Node current, int patientId, String patientName) {
        if (current == null) {
            return new Node(patientId, patientName);
        }

        if (patientId < current.data) {
            current.left = addPatientRecursive(current.left, patientId, patientName);
        } else if (patientId > current.data) {
            current.right = addPatientRecursive(current.right, patientId, patientName);
        } else {
            // pasien sudah terdaftar, tidak perlu menambahkan kembali
            return current;
        }

        return current;
    }

    // Method untuk mencari pasien berdasarkan id
    public boolean findPatient(int patientId) {
        return findPatientRecursive(root, patientId);
    }

    // Method rekursif untuk mencari pasien berdasarkan id
    private boolean findPatientRecursive(Node current, int patientId) {
        if (current == null) {
            return false;
        }
        if (patientId == current.data) {
            return true;
        }
        return patientId < current.data
                ? findPatientRecursive(current.left, patientId)
                : findPatientRecursive(current.right, patientId);
    }

    // Method untuk menghapus pasien dari binary tree
    public void deletePatient(int patientId) {
        root = deletePatientRecursive(root, patientId);
    }

    // Method rekursif untuk menghapus pasien dari binary tree
    private Node deletePatientRecursive(Node current, int patientId) {
        if (current == null) {
            return null;
        }

        if (patientId == current.data) {
            // Pasien ditemukan, hapus node ini
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deletePatientRecursive(current.right, smallestValue);
            return current;
        }
        if (patientId < current.data) {
            current.left = deletePatientRecursive(current.left, patientId);
            return current;
        }
        current.right = deletePatientRecursive(current.right, patientId);
        return current;
    }

    public void printPatients() {
        printPatientsRecursive(root);
    }

    private void printPatientsRecursive(Node current) {
        if (current != null) {
            printPatientsRecursive(current.left);
            System.out.println("Id pasien: " + current.data + ", Nama pasien: " + current.name);
            printPatientsRecursive(current.right);
        }
    }

    // Method untuk mencari nilai terkecil dalam suatu subtree
    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // Menambahkan beberapa pasien ke dalam binary tree
        bt.addPatient(13477, "Figaro");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih menu yang diinginkan:");
            System.out.println("1. Tambah pasien");
            System.out.println("2. Cari pasien");
            System.out.println("3. Hapus pasien");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                // Menambahkan pasien baru
                System.out.print("Masukkan id pasien: ");
                int patientId = scanner.nextInt();
                System.out.print("Masukkan nama pasien: ");
                String patientName = scanner.next();
                bt.addPatient(patientId, patientName);
                System.out.println("Pasien berhasil ditambahkan.");
            } else if (menu == 2) {
                // Mencari pasien
                System.out.print("Masukkan id pasien: ");
                int patientId = scanner.nextInt();
                boolean found = bt.findPatient(patientId);
                if (found) {
                    System.out.println("Pasien telah ditemukan.");
                    bt.printPatients();
                } else {
                    System.out.println("Pasien tidak ditemukan.");
                }
            } else if (menu == 3) {
                // Menghapus pasien
                System.out.print("Masukkan id pasien: ");
                int patientId = scanner.nextInt();
                bt.deletePatient(patientId);
                System.out.println("Pasien berhasil dihapus.");
            } else if (menu == 4) {
                // Keluar dari program
                break;
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia.");
            }
        }
    }
}
