import java.util.Scanner;

//incompleto (verificação, fazer ou não fazer?! eis a questão)

public class AscII{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Um único caracter: ");

        
        char caracter = in.next().charAt(0);
        
        int charToInt = (int) caracter;
        char capslock = (char) (charToInt - 32);

        System.out.println(charToInt + " " + capslock);
 
    }

}