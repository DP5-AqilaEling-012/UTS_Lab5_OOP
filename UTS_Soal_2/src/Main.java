import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Membuat objek Scanner untuk masukan dari pengguna
        Scanner input = new Scanner(System.in);

        //Meminta pengguna untuk memasukkan dua string
        System.out.print("Masukkan kata pertama: ");
        String str1 = input.nextLine();
        System.out.print("Masukkan kata kedua: ");
        String str2 = input.nextLine();

        //Memeriksa apakah kedua string adalah anagram
        boolean result = AnagramChecker.areAnagrams(str1, str2);
        
        System.out.println(result);
        input.close();
    }
}
