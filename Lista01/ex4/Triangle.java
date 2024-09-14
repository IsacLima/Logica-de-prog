
import java.util.Scanner;

public class Triangle{
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int area, b, h;

        System.out.println("Qual a altura do triangulo? ");
        h = read.nextInt();
        
        System.out.println("E qual o valor da base?");
        b = read.nextInt();
        
        area = (b*h)/2;
        
        System.out.println("A área desse triângulo é equivalente a " + area);

        read.close(); 
    }
}
