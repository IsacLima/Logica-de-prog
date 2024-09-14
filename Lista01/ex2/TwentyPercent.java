import java.util.Scanner;

public class TwentyPercent{

    public static void main(String[] args){
        double number, twentyAdd;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um valor a ser adicionado 20%: ");
        number = read.nextDouble();

        twentyAdd = (number + (number * 0.2));

        System.out.println("o valor de " + number + " adicionado 20% fica: " + twentyAdd);

        read.close();

    }
}