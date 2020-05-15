package Miscellanious.QuizQuestions;

public class Test {
    //1
//    public Test(){
//        this(); // COMPILER ERROR , Constructor can NOT call Itself (BU SATIR CEVAP)
//       System.out.println("A");
//    }
//    public Test(int a){
//        this();
//       System.out.println("B");
//    }
//    public static void main(String[] args) {
//        Test obj = new Test (200);


//    public Test(){
//        //this(); // COMPILER ERROR , Constructor can NOT call Itself (BU SATIR CEVAP)
//        System.out.println("A");
//    }
//    public Test(int a){
//        this(2.5);
//        System.out.println("B");
//    }
//    public Test(double c){
//        this();
//        System.out.println("C");
//    }
//    public static void main(String[] args) {
//        Test obj = new Test (200);
//    }

//        public static  String name = "OS";
//
//    public Test(){
//            name = "HI";
//    }
//    {
//        name = "mar";
//    }
//       public static void main(String[] args) {
//           System.out.println(name);
//    }
//    static {
//            name = "MAdina";
//    }


    int score;

    public Test(){
        score = 65;
    }
    static {
        // score = 55; ERROR
    }
    {
        score = 75;
    }
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.score);
    }

    //2
//    public Test(){
//        this(10); // constructor can NOT contain itself. no loops . ERROR -This line (CEVAP)
//       System.out.println("a");
//    }
//    public Test (int a){  // // this constractor contains Default one 's !!!
//        this();                 // ERROR _THIS LiNE (CEVAP)
//        System.out.println("b");



}
