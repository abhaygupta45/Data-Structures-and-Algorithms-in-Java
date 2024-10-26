import java.util.Scanner;
public class _02IntInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Age :- ");
        int age = scan.nextInt();

        System.out.println("age is :" + age);
    }

}