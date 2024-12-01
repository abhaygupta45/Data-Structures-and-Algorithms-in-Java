class Test1 {

    int a = 4;
    String name = "abhay";

    public static void main(String[] args) {
        // declare the variable
        // create the object
        int num = 9; // primitive
        Test1 obj1 = new Test1(); //reference
        Test1 obj2 = new Test1(); //reference

        obj1.name = "Abhay Gupta";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);
    }
}