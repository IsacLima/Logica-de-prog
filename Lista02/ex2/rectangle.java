import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        float base, height, area, perimeter;

        System.out.println("Digite, na seguinte ordem, o valor referente a base e a altura do retângulo: ");

        base = read.nextFloat();
        height = read.nextFloat();

        area = base*height;
        perimeter = 2*(base + height);

        System.out.println("Seguem as informações sobre o retângulo:\nArea: " + area + "\nPerímetro: " + perimeter);

        read.close();

    }

}
