package blackjack1;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){



        // ask player if he would like to play
        System.out.println(" Would you like to play blackjack today? (true/false) ");
        boolean userwantstoplay = input.nextBoolean();

        if(userwantstoplay){
            playGame();

        } else{
            System.out.println("Thanks for coming, please come back again!");
        }





    }

    public static void playGame(){
        // instantiate deck
        Card deck1 = new Card(52);

        System.out.println("Thanks for joining the game!, we will now give you your first two cards");

        String player1card = "";
        int player1score = 0;
        String dealerCard1 = "";
        int dealerscore = 0;



        for(int i=0; i<2; i++){
          String playercard = deck1.generateCard();
          player1card += playercard;
          String dealerCard = deck1.generateCard();
          dealerCard1 += dealerCard;



          player1score = deck1.checkCards(player1card);
          dealerscore = deck1.checkCards(dealerCard1);

        }

        System.out.println("Your current cards are: " + player1card + " your score is: " + player1score);
        System.out.println("The dealers cards are: " + dealerCard1 + " their score is: " + dealerscore) ;

        System.out.println("would you like  to hit, stand or bust: ");
        String userOption = input.nextLine();

        switch(userOption){
            case "hit":
                player1card += deck1.generateCard();
                player1score += deck1.checkCards(player1card);

        }







    }
}
