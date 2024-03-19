package CodeLab1Modul2;

import java.util.ArrayList;

class Mahasiswa {
    static ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

    String nim;
    String nama;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}