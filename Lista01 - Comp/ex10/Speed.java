import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Velocidade em Km/H: ");

        double km = in.nextDouble();
        double ms = km * 3.6;

        System.out.println("A velocidade em m/s é de: " + ms);

        in.close();

    }

}