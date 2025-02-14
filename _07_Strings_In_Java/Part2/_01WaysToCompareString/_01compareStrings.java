package Strings;

public class _01compareStrings {

    public static void main(String[] args) {
        
        String s1 = "pwskill";
        String s2 = new String("pwskills");

        System.out.println("reference is compared " + s1==s2);
        System.out.println("using equals that compare not a reference and the answer is --"  + s1.equals(s2));

    }
}