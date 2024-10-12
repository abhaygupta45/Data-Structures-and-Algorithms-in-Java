public class _04NestingProgram {
    
    public static void main(String[] args) {
        
        int age = 31;

        if(age >= 18 && age<=60){

           if (age>20 && age<30){
            System.out.println("YOu are in 20s");
           }else if (age >= 30 && age <= 40){
            System.out.println("you are in 30s");
           }else {
            System.out.println("you are not in 20s and 30s");
           }
        }
        else if(age >= 60){
            System.out.println("you are old now");
        }
        else if (age >= 16 && age < 18){
            System.out.println("you are teen age");
        }
        else {
            System.out.println("You are still kid");
        }
    }
}
