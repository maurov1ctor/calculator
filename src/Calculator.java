import java.util.Scanner;

public class Calculator {
    float num1;
    float num2;
    float res;
    String ope;

    public void Calc(){

        Scanner in = new Scanner(System.in);

        System.out.println("\n************ PROGRAMA CALCULATOR ************\n");
        System.out.print("Entre com um número: \n");
        num1 = in.nextFloat();

        System.out.print("Entre com outro número: \n");
        num2 = in.nextFloat();

        System.out.println("Escolha qual operaçãop será realizada: ( + - / * ");
        ope = in.next();

        switch (ope){
            case "+":
                res = num1 + num2;
                    break;

            case "-":
                res = num1 - num2;
                    break;

            case "*":
                res = num1 * num2;
                break;

            case "/":
                res = num1 / num2;
                break;

            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(String.format("Resultado: %.2f", res));
    }
}
