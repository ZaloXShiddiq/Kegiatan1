package CodeLab1Modul1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Input jenis kelamin
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Validasi jenis kelamin
        if (jenisKelamin != 'P' && jenisKelamin != 'L') {
            System.out.println("Input jenis kelamin tidak valid. Harap masukkan P atau L.");
            return;
        }

        // Input tanggal lahir
        System.out.print("Masukkan Tanggal Lahir (yyyy-MM-dd): ");
        String tanggalLahirString = scanner.next();

        // Konversi string tanggal lahir menjadi objek LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString, formatter);

        // Menghitung umur
        LocalDate tanggalSekarang = LocalDate.now();
        int umur = tanggalSekarang.getYear() - tanggalLahir.getYear();

        // Mendapatkan bulan
        int bulan = tanggalSekarang.getMonthValue();

        // Menampilkan hasil
        System.out.println("\nData Diri");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur: " + umur + " tahun " + bulan + " bulan");

        // Menutup scanner
        scanner.close();
    }
}
