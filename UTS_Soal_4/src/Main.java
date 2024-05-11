import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        //Menginisialisasi objek RumusGerakLurus dengan waktu yang diinputkan user
        RumusGerakLurus gerakLurus = new RumusGerakLurus(waktu);

        System.out.print("Masukkan jarak untuk GLB (m): ");
        double jarak = scanner.nextDouble();

        //Hitung kecepatan GLB
        gerakLurus.menghitungKecepatan(jarak);

        //Masukkan kecepatan awal, percepatan, dan kecepatan ketika dipercepat  atau diperlambat dari user untuk GLBB
        System.out.print("Masukkan kecepatan awal untuk GLBB: ");
        double kecepatanAwalGLBB = scanner.nextDouble();
        System.out.print("Masukkan percepatan untuk GLBB: ");
        double percepatanGLBB = scanner.nextDouble();
        System.out.print("Apakah anda mau menghitung kecepatan benda ketika dipercepat(true) atau diperlambat(false): ");
        boolean dipercepat = scanner.nextBoolean();

        //Hitung kecepatan GLBB sesuai dengan pilihan user (dipercepat atau diperlambat)
        if (dipercepat) {
            double kecepatanSetelahBergerak = kecepatanAwalGLBB + (percepatanGLBB * waktu);
            System.out.printf("Kecepatan benda ketika dipercepat: %.2f m/s%n", kecepatanSetelahBergerak);
        } else {
            double kecepatanSetelahBergerak = kecepatanAwalGLBB - (percepatanGLBB * waktu);
            System.out.printf("Kecepatan benda ketika diperlambat: %.2f m/s%n", kecepatanSetelahBergerak);

        }
        scanner.close();
    }
}