public class Program02 {
    
    public static void main(String args[]){

        int nums[] [] = new int[3] [2];

        nums[0] [0] = 6;
        nums[0] [1] = 5;
        nums[1] [0] = 4;
        nums[1] [1] = 4;
        nums[2] [0] = 3;
        nums[2] [1] = 2;

        for (int i=0; i<=2; i++){
            for(int j=0; j<=1; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 