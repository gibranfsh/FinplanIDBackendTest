import java.util.Arrays;
import java.util.Scanner;

public class BilanganCacahTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int size = scanner.nextInt();

        int[] data = new int[size];
        System.out.println("Masukkan elemen (Input):");
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }

        System.out.println("Output: " + findMissingNumber(data));

        scanner.close();
    }

    public static int findMissingNumber(int[] data) {
        Arrays.sort(data);

        int smallestMissingNumber = Arrays.stream(data).min().getAsInt(); // Untuk mendapatkan nilai terkecil dari array

        for (int i = 0; i < data.length; i++) {
            if (data[i] == smallestMissingNumber) {
                smallestMissingNumber++;
            }
        }

        return smallestMissingNumber;
    }
}
