//class dokter sebagai blueprint/cetakan untuk objek dokter
public class Dokter {
    private String nama;
    private String spesialis;
    private int tahun_pengalaman;

    //constructor untuk inisalisasi objek dokter
    public Dokter(String nama, String spesialis, int tahun_pengalaman) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.tahun_pengalaman = tahun_pengalaman;
    }

    //method setter untuk mengatur nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //method getter untuk mendapatkan nama
    public String getNama() {
        return nama;
    }

    //method setter untuk mengatur spesialis
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    //method getter untuk mendapatkan spesialis
    public String getSpesialis() {
        return spesialis;
    }

    //method setter untuk mengatur tahun pengalaman
    public void setTahun_pengalaman(int tahun_pengalaman) {
        this.tahun_pengalaman = tahun_pengalaman;
    }

    //method getter untuk mendapatkan tahun pengalaman
    public int getTahun_pengalaman() {
        return tahun_pengalaman;
    }

    //method overloading untuk menampilkan informasi dokter tanpa parameter
    public void displayInfo() {
        System.out.println("Nama Dokter: " + nama);
        System.out.println("Spesialis: " + spesialis);
        System.out.println("Waktu mengabdi (tahun): " + tahun_pengalaman + " tahun");
    }

    //method overloading untuk menampilkan informasi dokter dengan parameter tambahan
    public void displayInfo(String additionalInfo) {
        System.out.println("Informasi tambahan: " + additionalInfo);
    }

    //method overriding dari object class untuk menampilkan informasi objek
    @Override
    public String toString() {
        return "Nama: " + nama + ", Spesialis: " + spesialis + ", Berapa tahun pengalaman: " + tahun_pengalaman + " tahun";
    }
}
