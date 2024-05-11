public class RumusGerakLurus {
    double waktu;

    //Constructor untuk menginisialisasi waktu
    public RumusGerakLurus(double waktu) {
        this.waktu = waktu;
    }

    //Method overload untuk menghitung kecepatan Gerak Lurus Beraturan(GLB)
    //Rumus GLB: v = s / t
    public void menghitungKecepatan(double jarak) {
        double kecepatan = jarak / waktu;
        System.out.printf("Kecepatan GLB: %.2f m/s%n", kecepatan);
    }

    //Method overloading untuk menghitung kecepatan GLBB ketika dipercepat atau diperlambat
    //GLBB (Gerak Lurus Berubah Beraturan)
    //Rumus GLBB: v = v0 + at (untuk dipercepat) atau v = v0 - at (untuk diperlambat)
    public void menghitungKecepatan(double kecepatanAwal, double percepatan, boolean dipercepat) {
        double kecepatanSetelahBergerak;
        if (dipercepat) {
            kecepatanSetelahBergerak = kecepatanAwal + (percepatan * waktu);
        } else {
            kecepatanSetelahBergerak = kecepatanAwal - (percepatan * waktu);
        }
    }
}