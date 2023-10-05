package advancejava.lambda;


interface Calculator{
   //void switchOn();
    void sum(int input);
}
public class CalculatorImpl {

    public static void main(String[] args) {
//       Calculator calculator = ()->{
//        System.out.println("Switch On");
//    };

        //calculator.switchOn();*/

    Calculator calculator2 = (input) -> {
        System.out.println(input * 2);
    };

    calculator2.sum(20);
}

}

