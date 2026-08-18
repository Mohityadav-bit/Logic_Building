// 5. Print the multiplication table of a given number from n × 1 to n × 10. 
import java.util.Scanner;

public class L05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Multiplication table of "+ n +":");
        int i = 1;
        System.out.println("Multiplication table of number" + n + " from "+ n + " X 1 to" + n +" X 10 :");
        while(i<=10){
            System.out.println(i+" X "+n+" = " + (i*n));
            i++;
        }
    }
    
}
