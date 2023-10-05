package corejava;

public class FinalExampleTest {

    final int age = 18;


    void display(){
     //   age = 55;  // compiler error
    }

    public static void main(String[] args) {
        FinalExampleTest obj = new FinalExampleTest();
        // gives compile time error
        obj.display();
    }
}
