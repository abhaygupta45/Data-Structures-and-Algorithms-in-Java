public class Program03 {
    
    public static void main(String[] args) {
        
        // Duplicate allow in heap area because using of new keyword
        String s1 = new String("pw");
        String s2 = new String("pw");
        System.out.println(s1 == s2);

        // Duplicate not allow in String constant pool because reference is not storing same type of data 
        String s3 = "pw";
        String s4 = "pw";
        System.out.println(s3==s4);

        String s=new String(); 
        System.out.println(s);
    }
} 
