import java.util.Scanner;

public class stepAss1q4 {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int highest = sectionA[0];
        int section = 1;
        int item = 1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = 1;
                item = i + 1;
            }

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = 2;
                item = i + 1;
            }
        }

        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + highest
                + " (Section " + (section == 1 ? "A" : "B")
                + ", Item " + item + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter quantities for Section A:");

        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter quantities for Section B:");

        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}