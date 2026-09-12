import java.util.Scanner;
public class stepq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();    }
}
