public class _01SquarePattern {

    public static void main (String []args){

        int n = 10;
        for(int i=0; i<10; i++ ){
            for(int j=0; j<10; j++){
                if(i==0 || j==0 || i== n-1 || j== n-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}