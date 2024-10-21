public class _04Program {
    
    public static void main(String[] args) {
        
        int a=30;
        int b=20;
        int c=40;

        int res =(a<b)? (a<c ? a:b): (b<c? b:c);
        System.out.println(res);
    }
}
