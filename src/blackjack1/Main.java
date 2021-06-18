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
        String dealerCard1 = "";

        

        for(int i=0; i<2; i++){
          player1card += deck1.generateCard();
          dealerCard1 += deck1.generateCard();

        }

        System.out.println(player1card);







    }
}
