import java.util.Scanner;
public class _01UserInput {
    
    public static void main (String []args){

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your age");
        int age = scan.nextInt();
        System.out.println("Age is "+ age);


        System.out.print("Enter average");
        double avg = scan.nextDouble();
        System.out.println("average is " + avg);


        System.out.print("Enter Your Name");
        String name = scan.next();
        System.out.println("Your name is " + name);

        scan.close();
    }
    
}
