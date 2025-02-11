public class Program01 {

    public static void main(String[] args) {
        
        //Example of Immutable String
        String brand = "PwSkiils";
        System.out.println(brand);
        brand.concat("Bhopal");
        System.out.println(brand);

        //Example of Mutable String using String builder

        StringBuilder brand1 = new StringBuilder("Pwskills");
        System.out.println(brand1);
        brand1.append("Bhopal");
        System.out.println(brand1);
    }
}