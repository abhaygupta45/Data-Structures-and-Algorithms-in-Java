import java.util.*;
public class _04HshapePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
