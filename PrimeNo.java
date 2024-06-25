import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        
        // You can change this number to test other values
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            //Check from 2 to square root of number, if number is divisible by any i then it is not prime. Set isPrime to false and break out of loop.
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
