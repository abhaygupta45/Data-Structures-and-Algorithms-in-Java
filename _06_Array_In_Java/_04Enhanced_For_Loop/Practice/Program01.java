public class Program01 {

    public static void main(String[] args) {
        
        int nums [][] = {
                            {2,3,5,6},
                            {2,3,6,6},
                            {2,3,5,6}
                        };

    
    for (int a[]: nums){
        for(int b : a){
            System.out.print(b + " " );
        }
        System.out.println();
    }
    }
}