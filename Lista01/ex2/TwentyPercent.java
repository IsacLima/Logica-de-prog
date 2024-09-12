import java.util.Scanner;

public class TwentyPercent{

    public static void main(String[] args){
        float number;

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um valor a ser adicionado 20%: ");
        number = read.nextFloat();

        System.out.println("o valor de " + number + " adicionado 20% fica: " + (number + (number*0.2)));

        read.close();

    }
}