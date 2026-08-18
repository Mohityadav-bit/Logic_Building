
import java.util.Scanner;
// 10. Find and print the product of all digits of a given number. 

public class L10 {

    public static void product_num(int n) {
        int digit;
        int prod = 1;
        while (n > 0) {
            digit = n % 10;
            System.out.println(digit);
            prod = prod * digit;
            n = n / 10;
        }
        System.out.println("The product of all digits of a given number is: "+prod);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers to find the product: ");
        int n = sc.nextInt();
        product_num(n);
    }
}
