public class Program04JackedArray {
    public static void main(String args[]){

        int nums[] [] = {
                           {6,5,5,6},
                           {4,3},
                           {2,1,5}
                        };

        for (int i=0; i<=2; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
