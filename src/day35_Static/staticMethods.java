package day35_Static;

public class staticMethods {

    int a = 100;            // to able to use in static method, we should create an object , then we can call
    static int b = 200;     // global variables, use it everywhere

    public static void main(String[] args) {

        // System.out.println(a);  // static only accepts static

        staticMethods obj = new staticMethods();

        System.out.println(obj.a);

        System.out.println("============================");

        System.out.println(b);
        System.out.println(staticMethods.b);
        System.out.println(obj.b);    // prefers to be called through class name, it compiles, but gives yellow WARNING
    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }
}
