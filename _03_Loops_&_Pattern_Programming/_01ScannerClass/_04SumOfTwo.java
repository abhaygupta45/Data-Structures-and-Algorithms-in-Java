import java.util.Scanner;
public class _04SumOfTwo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter first number :");
        int num1 = scan.nextInt();
        System.out.print("Enter second number :");
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        System.out.println("sum of " + num1 + "and" + num2 + " is " + sum);
    }
}
