import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 3 notas: ");

        float note1 = in.nextFloat();
        float note2 = in.nextFloat();
        float note3 = in.nextFloat();
        float mean = (note1 + note2 + note3)/3;

        System.out.println("A média é de " + mean);

        in.close();

    }

}
