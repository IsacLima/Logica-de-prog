import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Comprimento e largura do retangulo: ");

        int base = in.nextInt();
        int height = in.nextInt();
        int perimeter = 2*(base+height);

        System.out.println("O perímetro é de " + perimeter);

        in.close();

    }

}
