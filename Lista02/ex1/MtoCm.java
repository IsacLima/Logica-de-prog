import java.util.Scanner;

public class MtoCm {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        float meters, centimeters;

        System.out.println("Digite o comprimento em metros: ");

        meters = read.nextFloat();

        centimeters = meters*100;

        System.out.println(meters + " em centímetros é: " + centimeters);

        read.close();

    }

}
