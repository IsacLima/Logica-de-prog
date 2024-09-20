import java.util.Scanner;


public class Distance{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("X e Y de um ponto: ");

        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.print("X e Y de outro ponto: ");

        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double distance = Math.sqrt( (double)( (x2-x1)*(x2-x1) ) + ( (y2-y1)*(y2-y1) ) );

        
        System.out.println("Resultado da distância: " + distance);

        in.close();
 
    }

}