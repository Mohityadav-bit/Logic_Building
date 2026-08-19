// 17. Find the smallest digit in the given number. 
import java.util.Scanner;
public class L17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int smallest = 9;
        int number = sc.nextInt();
        while(number>0){
            int lastdigit = number%10;
            System.out.println(lastdigit);
            if(lastdigit<smallest){
                smallest = lastdigit;
            }
            number = number/10;
        }
        System.out.println("The smallest value of the given number is: "+smallest);
    }
}
