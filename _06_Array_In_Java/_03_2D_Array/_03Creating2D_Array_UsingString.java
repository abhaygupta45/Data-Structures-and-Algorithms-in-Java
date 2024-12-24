public class _03Creating2D_Array_UsingString {
    
    public static void main(String[] args) {
        
        String name [] [] = {
                            {"1","Abhay"},
                            {"2","priyahshu"},
                            {"3","Shivam"}
                         };

        for (int i=0; i<=2; i++){
            for(int j=0; j<=1; j++){
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
}
