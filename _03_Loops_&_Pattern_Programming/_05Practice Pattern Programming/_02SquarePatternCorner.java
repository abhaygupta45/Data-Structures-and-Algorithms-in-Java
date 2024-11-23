import java.util.*;
public class _02SquarePatternCorner {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :-");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
    
}
