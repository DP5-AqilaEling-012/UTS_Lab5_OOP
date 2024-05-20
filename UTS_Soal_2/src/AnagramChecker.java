import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        //Periksa apakah panjang kedua string sama
        if (str1.length() != str2.length()) {
            return false;
        }

        //Ubah kedua string menjadi array karakter
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //Urutkan kedua array karakter
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Periksa apakah kedua array karakter yang diurutkan identik
        return Arrays.equals(arr1, arr2);
    }
}
