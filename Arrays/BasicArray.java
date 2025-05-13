import java.util.Scanner;
import java.util.Arrays; //

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the number:");
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements: " + Arrays.toString(a));
    }
}
