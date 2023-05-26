import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PencarianKata {
    public static List<String> cariKata(String kisah) {
        List<String> kataKunci = new ArrayList<>();
        kataKunci.add("sang gajah");
        kataKunci.add("serigala");
        kataKunci.add("harimau");

        List<String> hasilPencarian = new ArrayList<>();

        for (String kata : kataKunci) {
            int posisiAwal = 0;
            while (posisiAwal != -1) {
                posisiAwal = kisah.toLowerCase().indexOf(kata.toLowerCase(), posisiAwal);
                if (posisiAwal != -1) {
                    hasilPencarian.add(kata);
                    posisiAwal += kata.length();
                }
            }
        }

        return hasilPencarian;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kisah = in.nextLine();
        List<String> hasil = cariKata(kisah);

        // Output: sang gajah - sang gajah - serigala - serigala - harimau
        for (String kata : hasil) {
            if (hasil.indexOf(kata) != hasil.size() - 1) {
                System.out.print(kata + " - ");
            } else {
                System.out.println(kata);
            }
        }
        in.close();
    }
}
