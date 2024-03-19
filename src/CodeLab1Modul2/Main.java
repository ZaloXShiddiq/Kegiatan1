package CodeLab1Modul2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Tampilkan data mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu (1/2/3): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tambahDataMahasiswa();
                    break;
                case "2":
                    tampilkanDataMahasiswa();
                    break;
                case "3":
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }

    static void tambahDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nim mahasiswa: ");
        String nim = scanner.nextLine();

        while (nim.length() != 15){
            System.out.println("Nim Harus 15 Digit!!!");
            System.out.print("Masukkan Nim:");
            nim = scanner.nextLine();
        }
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();
        {
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
            Mahasiswa.dataMahasiswa.add(mahasiswa);
            System.out.println("Data mahasiswa berhasil ditambahkan!");
        }
    }

    static void tampilkanDataMahasiswa() {
        if (Mahasiswa.dataMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("\nData Mahasiswa:");
            Mahasiswa.tampilUniversitas();
            for (Mahasiswa mahasiswa : Mahasiswa.dataMahasiswa) {
                mahasiswa.tampilDataMahasiswa();
            }
        }
    }
}
