import java.util.Scanner;
public class _03Stars {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n times you want to print star in one line :-");
        int n = scan.nextInt();

        for(int i=0; i<n; i++ ){
            System.out.print("*");
        }
        scan.close();
    }
}
