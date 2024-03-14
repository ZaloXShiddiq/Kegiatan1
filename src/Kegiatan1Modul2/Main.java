package Kegiatan1Modul2;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private ArrayList<Admin> bookList = new ArrayList<>();
    private ArrayList<Student> userStudent = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Admin login
                    // Add admin-related functionality
                    break;
                case 2:
                    // Student login
                    inputNim();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
        scanner.close();
    }

    public void inputNim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();
        checkNim(nim);
    }

    public void checkNim(String nim) {
        // Check if the entered NIM exists in the userStudent array
        // If exists, proceed to student dashboard
        // If not, show an error message
    }
}