public class _01TypesOfString {

    public static void main(String[] args) {
        
        //imutuable
        String brand = "pwskill";
        System.out.println(brand);
        brand.concat("Abhay");
        System.out.println(brand);

        //mutable   
        StringBuilder brand1 = new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("Abhay");
        System.out.println(brand1);

    }
}