import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        float numerator, denominator, result;

        System.out.println("Digite o numerador e o denominador para fazermos a divisão: ");

        numerator = read.nextFloat();
        denominator = read.nextFloat();

        if(denominator == 0){
            System.out.println("Erro: denominador 0 eu não consigo meu filho!");
        }

        else{
            result = numerator/denominator;
            System.out.println("O resultado da divisão entre " + numerator + " e " + denominator + " é: " + result);
        }
        
        read.close();
    }

}
