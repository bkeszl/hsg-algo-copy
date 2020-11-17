import java.util.Arrays;

public class Censor {
    public static void main(String[] args) {
    /*
    Készíts egy függvényt, amely három string-et (karakterláncot) kér paraméterként
    és egy string-gel tér vissza. Az első string (`text`) az a szöveg, amit a
    függvénynek meg kell majd változtatnia. A második string (`originalWord`)
    lesz az, amit minden előfordulása során a harmadik string-re (`newWord`)
    kell megváltoztatni, majd a függvénynek az eredménnyel visszatérnie.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:



    Amivel vissza kellene térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */
        censor("A kedalmavenc gyümölcsöm a(z) alma", "alma", "banán");
    }

    public static String censor(String text, String originalWord, String newWord) {
        String str = text;

        int orginalWordLenght = originalWord.length();
        while (str.contains(originalWord)) {
            int orginalWordBeginIndex = str.indexOf(originalWord);
            char[] beforeWord = Arrays.copyOfRange(str.toCharArray(), 0, orginalWordBeginIndex);
            char[] afterWord = Arrays.copyOfRange(
                    str.toCharArray(),
                    orginalWordBeginIndex + orginalWordLenght,
                    str.length());
            str = String.valueOf(beforeWord) + newWord + String.valueOf(afterWord);
        }
        return str;
    }
}
