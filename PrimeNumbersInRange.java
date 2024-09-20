import java.io.*;
import java.util.Scanner;
public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = sc.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
