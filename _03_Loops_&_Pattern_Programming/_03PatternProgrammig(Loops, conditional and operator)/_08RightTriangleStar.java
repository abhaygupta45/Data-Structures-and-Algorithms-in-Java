import java.util.*;

public class _08RightTriangleStar{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter number :- ");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}