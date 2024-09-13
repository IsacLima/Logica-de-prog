import java.util.Scanner;


 public class Media{
    public static void main(String[] args){
        float grade1, grade2;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        grade1 = read.nextFloat();
        System.out.print("Digite a nota da segunda prova: ");
        grade2 = read.nextFloat();
        System.out.println("A média entre " + grade1 + " e " + grade2 + " é: " + ((grade1+grade2)/2));
        read.close();
    }
 }