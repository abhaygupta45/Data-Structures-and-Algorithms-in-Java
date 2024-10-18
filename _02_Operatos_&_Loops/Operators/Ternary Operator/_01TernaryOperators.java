public class _01TernaryOperators {
    
    public static void main (String []args){

        int a = 30;
        int b = 20;
        int c = 40;
        int res = (a<b)?a:b;
        System.out.println(res);
        String result = (a<b)?"a is less":"b is less";
        System.out.println(result);

        int lessIn3 = (a<b)?(a<c ? a:b): (b<c ? b:c);
        System.out.println(lessIn3);

        if (a<b){
            if (a<c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }else{
            if(b<c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    } 
}
