import java.util.Scanner;

public class Fahrenheit{
    public static void main(String[] args){
        float temp, fahrenheit;

        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite o valor da temperatura em Celsius: ");

        temp = read.nextFloat();
        fahrenheit = (temp * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
        
        read.close();

    }
}