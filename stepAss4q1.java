import java.util.Scanner;
import java.util.Arrays;

public class stepAss4q1 {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Product of elements to the left
        int product = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = product;
            product = product * nums[i];
        }

        // Product of elements to the right
        product = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * product;
            product = product * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] answer = productExceptSelf(nums);

        System.out.println("Output: " + Arrays.toString(answer));

        sc.close();
    }
}
