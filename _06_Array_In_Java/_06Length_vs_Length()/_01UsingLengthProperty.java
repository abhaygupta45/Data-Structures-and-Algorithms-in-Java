public class _01UsingLengthProperty {
    public static void main(String[] args) {
        
        // using length property in 1D array
        int num[] = {2,3,4,5,5,6,7};
        System.out.println(num.length); // length property 

        // using length property in 2D array
        int nums [] [] = {
                           {2,3,4,5},
                           {2,3,4,5},
                           {1,0,9,7,3,4,5,6,7,8}
                         };
        System.out.println(nums.length); // print the length of element in array
        System.out.println(nums[0].length); // print 1st index 
        System.out.println(nums[1].length);
        System.out.println(nums[2].length);
    }
}