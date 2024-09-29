// (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte

public class _02program {
    
    public static void main(String[] args) {
        
        double num = 45.5;
        int number;
        number = (int)num;
        System.out.println(number);
    }
}
