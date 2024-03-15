package Kegiatan1Modul2;

import java.util.Arrays;
import java.util.Scanner;

//Mewakili admin dengan fungsi untuk menambah mahasiswa dan menampilkan daftar mahasiswa.admin
class Admin {
    static String adminUsername = "admin";
    static String adminPassword = "admin";
    static String murid[][];

    static void displayStudents() {
        murid = Main.userStudent;
        System.out.println("List Of Registered Students: ");
        for (String[] students : murid) {
            System.out.println("Name\t: "+students[0]);
            System.out.println("Faculty\t: "+students[1]);
            System.out.println("NIM\t: "+students[2]);
            System.out.println("Program\t: "+students[3]+"\n");
        }
    }

    static void addStudent() {
        String data[] = new String[4];
        murid = Main.userStudent;
        Scanner scans = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        data[0] = scans.nextLine();
        System.out.print("Masukkan ProgramStudi mahasiswa: ");
        data[3] = scans.nextLine();
        System.out.print("Masukkan Fakultas mahasiswa: ");
        data[1] = scans.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        data[2] = scans.nextLine();
        while(true){
            if (String.valueOf(data[2]).length() != 15 ) {
                System.out.print(String.valueOf(data[1]).length());
                System.out.print("Nim Harus 15 Digit!!!\n");
                System.out.print("Masukkan NIM mahasiswa: ");
                data[2] = scans.nextLine();
            }else{
                break;
            }
        }

        Main.userStudent = Arrays.copyOf(murid, murid.length+1);
        Main.userStudent[murid.length] = data;
        System.out.println();
    }
}