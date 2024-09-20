import java.util.Scanner;

public class Concatenation{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Dois nomes: ");

        
        String name1 = in.next();
        String name2 = in.next();

        String concatenation = name1 + " " + name2;

       

        System.out.println("Resultados da concatenação: " + concatenation);
 
    }

}