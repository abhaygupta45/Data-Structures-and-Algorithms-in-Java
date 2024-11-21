import java.util.Scanner;
public class _14Pattern {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N :- ");
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        scan.close();
    }
}
}
