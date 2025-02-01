public class _01AvoidArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        

        // int[] arr= new int[5];

        // arr = new int[6];
        // System.out.println(arr.length);
        // int num[] = {2,3,4,5};
        // System.out.println(num.length); // it runs smothly
        // System.out.println(num[3]); // it runs smothly

        // System.out.println(num[4]); // in this line exception and after this next line code also not get run.

        // to solve avoid this Exception we can use some tricks
        // System.out.println(num[num.length-1]); // this is the correct way to avoid the exception.



        // using loop
        // int nums[] = {6,7,8,9};

        // for (int i=0; i<4; i++){
        //     System.out.println(nums[i]);
        //     System.out.println("hey ");
        // }

        // System.out.println("bye bye array");

        // using inhanced for loop

        int number [] = {1,2,3,4,5};

        for (int n : number){
            System.out.println(n);
        }
    }
}