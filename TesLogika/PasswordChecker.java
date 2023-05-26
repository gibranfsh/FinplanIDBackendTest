import java.util.Scanner;

public class PasswordChecker {
    public static String checkPassword(String password) {
        if (password.length() < 8 || password.length() > 32) {
            return "Kata sandi minimal 8 karakter dan maksimal 32 karakter";
        }

        if (Character.isDigit(password.charAt(0))) {
            return "Karakter awal tidak boleh angka";
        }

        if (!containsDigit(password)) {
            return "Harus memiliki angka";
        }

        if (!containsLowercase(password) || !containsUppercase(password)) {
            return "Harus memiliki huruf kapital dan huruf kecil";
        }

        return "Kata sandi valid";
    }

    private static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsLowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String password1 = "5andiwara";
        // System.out.println(checkPassword(password1));

        // String password2 = "sandiwar4";
        // System.out.println(checkPassword(password2));

        // String password3 = "Sandiwar4";
        // System.out.println(checkPassword(password3));

        // String password4 = "maikelaMkw3s";
        // System.out.println(checkPassword(password4)); 
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        System.out.println(checkPassword(password));
        in.close();
    }
}
