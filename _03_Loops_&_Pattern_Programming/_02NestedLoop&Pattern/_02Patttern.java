import java.util.Scanner;

public class _02Patttern {
    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number of times you want to print pattern:");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            System.out.print("* ");
            }

            System.out.println();
        }
        scan.close();
    }
}
