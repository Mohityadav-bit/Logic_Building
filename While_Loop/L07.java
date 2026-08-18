import java.util.Scanner;
// 7. Calculate the sum of all even numbers from 1 up to n. 

public class L07{
    public static void main(String[] args){
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        System.out.println("All Even Numbers b/w 1 to "+ n);
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
                sum = sum+i;
            }
            i++;
        }
        System.out.println("The total sum of even nums: "+ sum);
    }

}