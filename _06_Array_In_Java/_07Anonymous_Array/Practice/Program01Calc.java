class Calc {
    public int add(int x, int y){
        int result = x+y;
        return result;
    }
}



public class Program01Calc {

    public static void main(String[] args) {
        
        Calc obj = new Calc();
        int result = obj.add(5,10);
        System.out.println(result);
    }
}