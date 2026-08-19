// 5. Print the multiplication table of a given number. 
import java.util.Scanner;

public class L05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The multiplication table of "+ n);
        for(int i = 1; i<= 10; i++){
            System.out.println(n+" X "+i+ " = "+n*i);
        }        
    }
}
