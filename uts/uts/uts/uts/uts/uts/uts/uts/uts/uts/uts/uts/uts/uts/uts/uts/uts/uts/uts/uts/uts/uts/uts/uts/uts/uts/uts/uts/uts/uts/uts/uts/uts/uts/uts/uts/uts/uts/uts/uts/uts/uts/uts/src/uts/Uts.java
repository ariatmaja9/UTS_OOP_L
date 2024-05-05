/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author kadek_0h9um6v
 */
public class Uts {
    private static final int MAX_PENGUNJUNG = 100;
    private static final ZooVisitor[] pengunjung = new ZooVisitor[MAX_PENGUNJUNG];
    private static int jumlahPengunjung = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            do {
                System.out.println("Menu:");
                System.out.println("1. Catat pengunjung");
                System.out.println("2. Tampilkan jumlah pengunjung");
                System.out.println("3. Keluar");
                System.out.print("Pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline
                
                switch (pilihan) {
                    case 1:
                        catatPengunjung(scanner);
                        break;
                    case 2:
                        tampilkanJumlahPengunjung();
                        break;
                    case 3:
                        System.out.println("Terima kasih telah menggunakan aplikasi!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 3);
        }
    }

    private static void catatPengunjung(Scanner scanner) {
        if (jumlahPengunjung < MAX_PENGUNJUNG) {
            System.out.print("Masukkan nama pengunjung: ");
            String nama = scanner.nextLine();
            pengunjung[jumlahPengunjung] = new ZooVisitor(nama);
            jumlahPengunjung++;
            System.out.println("Pengunjung berhasil dicatat.");
        } else {
            System.out.println("Kapasitas pengunjung penuh.");
        }
    }

    private static void tampilkanJumlahPengunjung() {
        System.out.println("Jumlah pengunjung: " + jumlahPengunjung);
        System.out.println("Daftar pengunjung:");
        for (int i = 0; i < jumlahPengunjung; i++) {
            System.out.println((i + 1) + ". " + pengunjung[i].getNama());
        }
    }
}
