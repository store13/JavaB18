package day40_Encapsulation;

public class Quiz {

    public Quiz(){
        System.out.println("A");
    }

    public Quiz(int a){ // A C B
        this(2.5);  // A C
        System.out.println("B");    // B
    }

    public Quiz(double a){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz(100);
    }


}
