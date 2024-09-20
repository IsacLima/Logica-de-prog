import java.util.Scanner;

public class UsdToReal {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Um valor em USD e a taxa de câmbio: ");

        float usd = in.nextFloat();
        float tax = in.nextFloat();
        float real = usd*tax;

        System.out.println("A conversão resulta em: R$" + real);

        in.close();

    }

}