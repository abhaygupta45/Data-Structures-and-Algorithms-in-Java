public class _04JaggedArrays {

    public static void main(String[] args) {

        int num[] [] = new int [3] [];

        num[0] = new int[4];
        num[1] = new int[2];
        num[2] = new int[3];

        num [0] [0] = 6;
        num [0] [1] = 5;
        num [1] [0] = 4;
        num [1] [1] = 3;
        num [2] [0] = 2;
        num [2] [1] = 1;

        for(int i=0; i<=2; i++){
            for(int j=0; j<=1; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        int nums [] [] = {
                            {6,5,4,2},
                            {4,3,1},
                            {2,1}
                         };

        for (int i=0; i<=2; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}