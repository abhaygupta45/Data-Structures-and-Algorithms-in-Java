public class _03JaggedArrayUsingEnhancedForLoop {
    public static void main(String[] args) {
        
        int nums[][] = {
                        {1,2,3,4,3,5,3},
                        {5,6,7,8,3},
                        {9,10,11,12},
                       };
    
        for(int n[] : nums){
           for(int m : n){
            System.out.print(m+ " ");
           }
           System.out.println();
        }
    }
}
