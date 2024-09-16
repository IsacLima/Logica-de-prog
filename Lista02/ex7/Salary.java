import java.util.Scanner;

public class Salary{

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        float hours, value, tax, totalNoTax, totalWithTax;
        
        System.out.println("Digite seu salário/hora, suas horas trabalhadas e quanto porcento de imposto é descontado: ");

        value = read.nextFloat();
        hours = read.nextFloat();
        tax = read.nextFloat();

        totalNoTax = (value * hours);
        totalWithTax = totalNoTax - (totalNoTax*(tax/100));

        System.out.println("O seu salário do mês é de R$" + totalNoTax + "\nO total com desconto fica R$" + totalWithTax);

        read.close();

    }

}