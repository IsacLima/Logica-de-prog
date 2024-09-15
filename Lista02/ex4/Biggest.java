import java.util.Scanner;

public class Biggest {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int number1, number2;

        System.out.println("Digite dois números para compará-los: ");

        number1 = read.nextInt();
        number2 = read.nextInt();

        if(number1 > number2){
            System.out.println("O número salvo na variavel number1 de valor " + number1 + " é maior que o número salvo na variavel number2 de valor " + number2 + "!");
        }

        if(number1 < number2){
            System.out.println("O número salvo na variavel number2 de valor " + number2 + " é maior que o número salvo na variavel number1 de valor " + number1 + "!");
        }

        if(number1 == number2){
            System.out.println("O número salvo na variavel number1 de valor " + number1 + " é igual ao número salvo na variavel number2 de valor " + number2 + "!");
        }

        read.close();
    }

}
