import java.util.Scanner;

public class Votes{

    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        int voters, validVotes, whiteVotes, nullVotes;
        float percentValidVotes, percentWhiteVotes, percentNullVotes; 

        System.out.println("Digite a quantidade de eleitores, a quantidade de votos válidos, a quantidade de votos brancos e a quantidade de votos nulos, respectivamente: ");

        voters = read.nextInt();
        validVotes = read.nextInt();
        whiteVotes = read.nextInt();
        nullVotes = read.nextInt();

        percentValidVotes = (validVotes*100)/voters;
        percentWhiteVotes = (whiteVotes*100)/voters;
        percentNullVotes = (nullVotes*100)/voters;

        System.out.println("\nSeguem as informações desta eleição:\nDos votos válidos temos: " + percentValidVotes + "%\nDos votos brancos temos: " + percentWhiteVotes + "%\nDos votos nulos temos: " + percentNullVotes + "%\nPor hoje é só pessoal.");

        read.close();
    }

}