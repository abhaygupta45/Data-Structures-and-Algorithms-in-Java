class Calc {
    public int add(int nums[]){
        int result = 0;
        for(int n: nums){
            result = result + n;
        }
        return result;
    }
}



public class Program02Calc {

    public static void main(String[] args) {
        
        Calc obj = new Calc();
        int nums[] = {5,4,3,2,1};
        int result = obj.add(nums);
        System.out.println(result);
    }
}