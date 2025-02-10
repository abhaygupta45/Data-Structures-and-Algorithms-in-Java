

public class _02ImmutableString {
    
    public static void main(String[] args) {

        String s1 = new String ("Abhay");
        String s2 = new String ("Abhay");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        String s3 = "Ram";
        String s4 = "Ram";
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3 == s4);
        
    }
}
