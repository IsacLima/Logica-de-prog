import java.util.Scanner;

public class Seconds {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma quantia de tempo em segundos: ");

        float seconds = in.nextFloat();
        int hours =(int) seconds/3600;
        seconds = seconds - (hours*3600);
        int minutes = (int) seconds / 60;
        seconds = seconds - (minutes*60);

        System.out.println("O tempo total é de: " + hours + ":" + minutes + ":" + seconds);

        in.close();

    }

}
