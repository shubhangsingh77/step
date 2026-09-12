import java.util.Scanner;

public class stepq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int result = 0;

        while (original != 0) {
            original /= 10;
            digits++;
        }

        original = num;

        while (original != 0) {
            int remainder = original % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power *= remainder;
            }

            result += power;
            original /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}
