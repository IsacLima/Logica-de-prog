import java.util.Scanner;

public class PosOrNeg {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        float number;

        System.out.println("Digite um número para verificarmos se é positivo ou negativo: ");

        number = read.nextFloat();

        if(number>=0){
            System.out.println("O número " + number + " é positivo!");
        }

        else{
            System.out.println("O número " + number + " é negativo!");
        }

        read.close();
    }

}
