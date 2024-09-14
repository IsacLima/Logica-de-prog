import java.util.Scanner;

public class Event {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        double ticketPrice, totalIncome, lostMoney;
        int members, freepass, fullTicket, totalAudience;

        System.out.println("Digite, respectivamente:\nO valor do ingresso;\nO número de sócios;\nO total de não pagantes;\nE o total de pagantes.");

        ticketPrice = read.nextDouble();
        members = read.nextInt();
        freepass = read.nextInt();
        fullTicket = read.nextInt();

        totalAudience = members + freepass + fullTicket;
        totalIncome = (fullTicket*ticketPrice) + (members*(ticketPrice - (ticketPrice*0.3)));
        lostMoney = (freepass*ticketPrice) + (members * (ticketPrice*0.3));

        System.out.println("O público total do evento foi de " + totalAudience + " pessoas.\nA renda total foi de R$" + totalIncome + ".\nO dinheiro deixado de ganhar foi de R$" + lostMoney + ".");

        read.close();

    }

}
