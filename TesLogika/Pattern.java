import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if (N % 2 != 1) {
            System.out.println("Harus bilangan ganjil");
        } else {
            char[][] pattern = new char[N][N];
            generatePattern(pattern, N, 0);
            printPattern(pattern, N);
        }

        in.close();
    }

    public static void generatePattern(char[][] pattern, int N, int row) {
        if (row >= N) {
            return;
        }

        // generateRow dan generatePattern rekursif
        generateRow(pattern, N, row, 0);
        generatePattern(pattern, N, row + 1);
    }

    public static void generateRow(char[][] pattern, int N, int row, int col) {
        if (col >= N) {
            return;
        }

        if (row == 0 || row == N - 1 || col == 0 || col == N - 1 || row == N - col - 1) {
            pattern[row][col] = 'X';
        } else {
            pattern[row][col] = 'O';
        }

        //generateRow rekursif
        generateRow(pattern, N, row, col + 1);
    }

    public static void printPattern(char[][] pattern, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
