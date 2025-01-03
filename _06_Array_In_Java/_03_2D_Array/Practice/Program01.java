public class Program01 {

    public static void main(String args[]){

        int nums[] [] = new int[3] [2];

        for (int i=0; i<=2; i++){
            for(int j=0; j<=1; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}