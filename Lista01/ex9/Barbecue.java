import java.util.Scanner;

public class Barbecue {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int man, woman, children;
        double totalMeat, meatMan, meatWoman, meatChildren;

        System.out.println("Digite quantos homens, mulheres e crianças estarão presentes: ");
        
        man = read.nextInt();
        woman = read.nextInt();
        children = read.nextInt();
        
        meatMan = man * 400;
        meatWoman = woman * 320;
        meatChildren = children * 200;
        
        totalMeat = (meatMan + meatWoman + meatChildren);
        totalMeat = totalMeat + (totalMeat*0.2);


        System.out.println("O total de carne necessária pro seu aniversário é de " + totalMeat + " gramas.");

        read.close();
    }
}
