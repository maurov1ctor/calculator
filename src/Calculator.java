import java.util.Scanner;

public class Calculator {

    Scanner in = new Scanner(System.in);

    float num1;
    float num2;
    float res;

    public void Calc(){
        System.out.println("\n************ PROGRAMA CALCULATOR ************ \n");
        System.out.print("Entre com um número: \n");
        num1 = in.nextInt();

        System.out.print("Entre com outro número: \n");
        num2 = in.nextInt();;
    }
}
