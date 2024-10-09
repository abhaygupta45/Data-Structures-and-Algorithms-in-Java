public class _01Conditionals {
    public static void main (String []args){

        // int age = 17;
        
        // if (age >= 18){
        //     System.out.println("legal adult");
        // }else{
        //     System.out.println("you are kid");
        // }

        int age = 31;

        // if (age >= 18 && age < 60){
        //     System.out.println("You are an adult");
        // }else if(age >= 60){
        //     System.out.println("You are a Old man");
        // }else {
        //     System.out.println("You are Kid");
        // }


        if (age >= 18 && age < 60){
            if (age >= 20 && age < 30){
                System.out.println("You are in your 20's");
            }else if (age >= 30 && age < 40){
                System.out.println("You are in your 40's");
            }else {
                System.out.println("You are in your 50's");
            }  
        }else if(age >= 60){
            System.out.println("You are a Old man");
        }else if (age < 18 && age < 16){
            System.out.println("You are teenager");
        }else {
            System.out.println("You are Kid");
        }
    }
}
