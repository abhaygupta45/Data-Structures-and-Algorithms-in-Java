public class _03Creating1DArray_UsingString {
    
    public static void main(String[] args) {
        
        String names[] = {"Abhay","Priyanshu", "shivam"};

        for(int i=0; i<=2; i++){
            System.out.println(names[i]);
        }
        
        System.out.println();
        System.out.println();


        String name[] = new String[4];
        name[0] = "Sejal";
        name[1] = "Kartik";
        name[2] = "Aditya";
        name[3] = "Devansh";
    
        for(int i=0; i<=3; i++){
            System.out.println(name[i]);
        }

    }
}
