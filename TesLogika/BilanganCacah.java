import java.util.Scanner;

public class BilanganCacah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        int count = 0;

        while (count < N) {
            if (i % 3 == 0 || i % 7 == 0) {
                if (count != N - 1) {
                    if (i % 3 == 0 && i % 7 == 0) {
                        System.out.print("Z, ");
                    } else {
                        System.out.print(i + ", ");
                    }
                } else {
                    if (i % 3 == 0 && i % 7 == 0) {
                        System.out.println("Z");
                    } else {
                        System.out.println(i);
                    }
                }
                count++;
            }
            i++;
        }
        in.close();
    }
}