import java.util.Scanner;

public class stepq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println("GCD is " + a);
     sc.close();
    }
}
