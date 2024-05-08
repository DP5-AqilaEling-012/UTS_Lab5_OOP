import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //meminta input nama, spesialis, dan berapa laam waktu mengabdi dari pengguna
        System.out.print("Masukkan nama dokter:");
        String nama = scanner.nextLine();

        System.out.print("Masukkan spesialis:");
        String spesialis = scanner.nextLine();

        System.out.print("Masukkan waktu mengabdi:");
        int tahun_pengalaman = scanner.nextInt();

        //membuat objek dokter menggunakan constructor
        Dokter dokter = new Dokter(nama, spesialis, tahun_pengalaman);

        //menampilkan informasi
        dokter.displayInfo();

        //menggunakan method overloading untuk menambahkan informasi tambahan
        dokter.displayInfo("Praktik dokter hanya buka saat weekend");

        //menggunakan method getter untuk mendapatkan nama, spesialis, dan tahun pengalaman
        System.out.println("Nama:" + dokter.getNama());
        System.out.println("Spesialis: " + dokter.getSpesialis());
        System.out.println("Waktu mengabdi (tahun):" + dokter.getTahun_pengalaman() + " tahun");

        //menggunakan method setter untuk mengubah spesialis dan tahun pengalaman
        dokter.setSpesialis("Sp.OG");
        dokter.setTahun_pengalaman(12);

        //menampilkan informasi setelah perubahan menggunakan method getter
        System.out.println("Setelah diupdate");
        System.out.println("Spesialis:" + dokter.getSpesialis());
        System.out.println("Waktu mengabdi (tahun):" + dokter.getTahun_pengalaman() + " tahun");

        //menggunakan method overriding untuk menampilkan informasi objek
        System.out.println(dokter);
    }
}