import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1;
        String sinal;
        int num2;

        Scanner scannner = new Scanner(System.in);
        num1 = scannner.nextInt();
        num2 = scannner.nextInt();
        sinal = scannner.next();

        if (sinal.equals("+")) {
            int resultado = num1 + num2;
            System.out.println(resultado);  
        } else if (sinal.equals("-")) {
            System.out.println(num1 - num2);
        }

    }
}
