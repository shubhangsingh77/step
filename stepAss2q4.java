import java.util.Scanner;

public class stepAss2q4 {

    static String normalizeCode(String raw) {

        raw = raw.trim();

        String first3 = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return first3 + rest;
    }

    static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: Wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: Publisher code must contain letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: Body must contain digits";
            }
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        return publisher + " | YEAR: " + year + " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        String raw = sc.nextLine();

        String code = normalizeCode(raw);

        System.out.println(validateAndFormat(code));

        sc.close();
    }
}
