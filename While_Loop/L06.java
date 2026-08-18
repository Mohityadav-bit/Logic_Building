// 6. Calculate and print the sum of the first n natural numbers. 

import java.util.Scanner;

public class L06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.print("Sum of the total number is:"+ sum);
    }
}