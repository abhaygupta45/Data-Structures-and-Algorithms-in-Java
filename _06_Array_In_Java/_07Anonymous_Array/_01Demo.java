class Calc
{
    public int add(int nums[])
    {
        int result = 0;
        for (int n : nums){
            result = result + n;
        }
        return result;
    }
}



public class _01Demo{

    public static void main(String[] args) {

        Calc obj = new Calc();
        int result = obj.add(new int []{5,3,4,7}); //Anonymous array is used here it is used only one time
        System.out.println(result);
        
    }
}