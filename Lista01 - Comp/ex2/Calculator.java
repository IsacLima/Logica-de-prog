import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Dois inteiros: ");

        int number1 = in.nextInt();
        int number2 = in. nextInt();

        int add = number1 + number2;
        int sub = number1 - number2;
        int mult = number1 * number2;
        float div = (float) number1 / number2;

        System.out.println("Resultados\nSoma: " + add + "\nSubtração; " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + div);
 
    }

}