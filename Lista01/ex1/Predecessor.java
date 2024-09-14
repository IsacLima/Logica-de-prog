//importo a função scanner que lê entradas
import java.util.Scanner;


public class Predecessor{
   
    public static void main(String[] args) {
        //declaro as variaveis que usarei
        int number, predecessor;
        
        //instancio a função de leitura
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número para descobrir seu antecessor: ");
        
        //recebo o retorno da leitura (nextInt() = o valor lido será inteiro)
        number = read.nextInt();

        predecessor = number - 1;

        //printo a saída
        System.out.println("O número antecessor ao " + number +  " é: " + predecessor);

        //fecha o scanner
        read.close();
    }
}

