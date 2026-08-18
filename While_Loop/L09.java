import java.util.Scanner;

// 9. Calculate and print the factorial of a given number. 

public class L09 {
    public static void factorial_num(int n){
        int i = 1;
        int fact = 1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println("The factorial of the given number is: " + fact);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to print the factorial of the num: ");
        int n = sc.nextInt();
        factorial_num(n);
    }
}
