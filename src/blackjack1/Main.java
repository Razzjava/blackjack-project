package blackjack1;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){



        // ask player if he would like to play
        System.out.println(" Would you like to play blackjack today? (true/false) ");
        boolean userwantstoplay = input.nextBoolean();



        if(userwantstoplay){
            playGame2();

        } else{
            System.out.println("Thanks for coming, please come back again!");
        }





    }

    // initial implementation
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
          player1card += " ";
          String dealerCard = deck1.generateCard();
          dealerCard1 += dealerCard;
          dealerCard1 += " ";

//    addd to score not replace

          player1score += deck1.checkCards(playercard);
          dealerscore += deck1.checkCards(dealerCard);

        }

        System.out.println("Your current cards are: " + player1card + " your score is: " + player1score);
        System.out.println("The dealers cards are: " + dealerCard1 + " their score is: " + dealerscore) ;

        // fix input - not recording
        while (player1score < 21 && dealerscore < 21){
            System.out.println("would you like to hit, stick: ");
            String userOption = input.next();

            switch (userOption) {
                case "hit":
                    String playerCard = deck1.generateCard();
                    player1card += playerCard;
                    player1score += deck1.checkCards(playerCard);

                    System.out.println("your cards are now: " + player1card + " and score is now: "+ player1score);
                    break;
                case "stick":
                    break;


            }
        }

        if(player1score > 21) {
            System.out.println("Game over, the dealer has won!!! ");

        } else if (dealerscore > 21){
            System.out.println("Congratulations, you have won, the dealer is now bust");
        }


            }



            // second function to test move to Player class and Dealer class
            public static void playGame2() {

                // deck instantiated
                Card deck2 = new Card(52);

//                System.out.println("How many people will be playing today?: ");
//                int peoplePlaying = input.nextInt();

                System.out.println("Thanks for joining the game!, we will now give you your first two cards");

                // time to instantiate player and dealer

                User user = new User();
                Dealer dealer = new Dealer();

                //generating initial cards and setting scores;
                for (int i = 0; i < 2; i++) {
                    String newCard1 = deck2.generateCard();
                    user.setCard(newCard1);
                    user.setScore(deck2.checkCards(newCard1));

                    String newCard2 = deck2.generateCard();
                    dealer.setCard(newCard2);
                    dealer.setScore(deck2.checkCards(newCard2));
                }

                // get info call
                user.info();
                dealer.info();

                String userDecision = "";

                do {
                    System.out.println("would you like to hit, stick: ");
                    String userOption = input.next();
                    userDecision += userOption;
                    System.out.println(userDecision);



                    switch (userOption) {
                        case "hit":
                            String playerCard = deck2.generateCard();
                            user.setCard(playerCard);
                            user.setScore(deck2.checkCards(playerCard));

                            user.info();
                            dealer.info();
                            break;
                        case "stick":
                            break;
                    }
                } while (userDecision.equals("hit") && user.getScore() <= 21);

                if(user.getScore() > 21){
                    System.out.println("Unlucky, once again you have lost, what a shame!");
                } else{

                    while (dealer.dealerDecision() == "hit") {
                        switch (dealer.dealerDecision()) {
                            case "hit":
                                System.out.println("The Dealer has decided to hit");
                                String dealerCard = deck2.generateCard();
                                dealer.setCard(dealerCard);
                                dealer.setScore(deck2.checkCards(dealerCard));

                                user.info();
                                dealer.info();
                                break;
                            case "stick":
                                break;

                        }
                    }
                }


                if(user.getScore() > 21) {
                    System.out.println("Game over, the dealer has won!!! ");

                } else if (dealer.getScore() > 21){
                    System.out.println("Congratulations, you have won, the dealer is now bust");
                } else if (user.getScore() > dealer.getScore()){
                    System.out.println("Congratulation, your hand is higher than the Dealers, you have won!!");
                } else if (dealer.getScore() > user.getScore()){
                    System.out.println("Unlucky, the dealer won, better luck next time!");
                } else if (dealer.getScore() == user.getScore()){
                    System.out.println("Its a draw, you'll have play again");
                }

                System.out.println("Would you like to play again? (true/false): ");
                Boolean playAgain = input.nextBoolean();

                if (playAgain){
                    playGame2();
                } else{
                    System.out.println("Thanks for playing Blackjack, come back at any time!");
                }
            }
        }











