import java.util.Scanner;

public class Time {
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float time, distance, speed;

        System.out.println("Digite a distância em KM e a velocidade em KM/H respectivamente: ");

        distance = read.nextFloat();
        speed = read.nextFloat();

        time = distance/speed;

        System.out.println("O tempo de trajeto é de " + time + " horas.");

        read.close();

    }

}
