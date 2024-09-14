import java.util.Scanner;


 public class Media{
    public static void main(String[] args){
        float grade1, grade2, media;
        Scanner read = new Scanner(System.in);

        System.out.println("Digite as notas das provas: ");
       
        grade1 = read.nextFloat();
        grade2 = read.nextFloat();
        
        media = ((grade1+grade2)/2);

        System.out.println("A média entre " + grade1 + " e " + grade2 + " é: " + media);
        read.close();
    }
 }