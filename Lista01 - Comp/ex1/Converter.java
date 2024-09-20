import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Inteiro e Decimal: ");

        int intNumber = in.nextInt();
        float decNumber = in.nextFloat();

        float convertedToFloat = (float) intNumber;
        int convertedToInt = (int) decNumber;

        System.out.println("Resultado da conversão: "+ convertedToFloat + " e " + convertedToInt);

        in.close();

    }
}