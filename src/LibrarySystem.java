import java.util.Scanner;

public class LibrarySystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin145";

    private static final String[] MAHASISWA_USERNAMES = {"202310370311138"};

    private static final String EXIT_COMMAND = "keluar";

    public LibrarySystem() {
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            displayMenu();
            System.out.print("Pilih user (1/2/3): ");
            userInput = scanner.nextLine().toLowerCase();

            switch (userInput) {
                case "1":
                    loginAdmin();
                    break;
                case "2":
                    loginMahasiswa();
                    break;
                case "3":
                    System.out.println("Terima kasih. Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (!userInput.equals(EXIT_COMMAND));
    }

    private void displayMenu() {
        System.out.println("=== Sistem Login Library ===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
    }

    private void loginAdmin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username Admin: ");
        String username = scanner.nextLine();
        System.out.print("Password Admin: ");
        String password = scanner.nextLine();

        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            System.out.println("Login admin berhasil.");
            // Tambahkan logika untuk aksi admin di sini
        } else {
            System.out.println("Login admin gagal. Silakan coba lagi.");
        }
    }

    private void loginMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username Mahasiswa: ");
        String username = scanner.nextLine();

        boolean isMahasiswa = false;
        for (int i = 0; i < MAHASISWA_USERNAMES.length; i++) {
            if (MAHASISWA_USERNAMES[i].equals(username)) {
                isMahasiswa = true;
                System.out.println("Login mahasiswa berhasil.");
                // Tambahkan logika untuk aksi mahasiswa di sini
                break;
            }
        }

        if (!isMahasiswa) {
            System.out.println("Login mahasiswa gagal. Silakan coba lagi.");
        }
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}