import java.util.Scanner;

public class Square{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number, square;

        System.out.println("Digite o número que será elevado ao quadrado: ");
        
        number = read.nextInt();
        square = (number*number);

        System.out.println("O quadrado de " + number + " é : " + square);

        read.close();
    }
}

