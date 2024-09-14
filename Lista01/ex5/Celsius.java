import java.util.Scanner;

public class Celsius{
    public static void main(String[] args){
        float temp, celsius;

        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite o valor da temperatura em Fahrenheit: ");

        temp = read.nextFloat();
        celsius = (((temp - 32)/9)*5);

        System.out.println("A temperatura em Fahrenheit é " + temp + " e em Celsius é " + celsius);
        
        read.close();

    }
}