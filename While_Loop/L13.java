// 14. Find and print the sum of digits of the given number. 

import java.util.Scanner;
public class L13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int digit = num%10;
            System.out.println(digit);
            sum = sum+digit;
            num = num/10;
        }
        System.out.println("The sum of the given number is: "+sum);
    }

    
}
