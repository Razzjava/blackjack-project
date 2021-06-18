package blackjack1;

import java.util.ArrayList;
import java.util.Random;

public class Card extends Deck{

    //attributes
    private int cardNum;
    ArrayList<String> cards = new ArrayList<String>();







    //contructor
    public Card(int numofcards){
        super(numofcards);
    }


    //methods


    public String generateCard(){
        Random rand =  new Random();
        int randomNum = rand.nextInt(10)+1;

        String card = "";

        if( randomNum == 1){
            card = "ace";
        } else if (randomNum == 2){
            card = "2";
        } else if (randomNum == 3){
            card = "3";
        } else if (randomNum == 4){
            card = "4";
        } else if (randomNum == 5) {
            card ="5";
        } else if (randomNum == 6){
            card ="6";
        } else if (randomNum == 7){
            card = "7";
        } else if (randomNum == 8){
            card = "8";
        } else if (randomNum == 9){
            card = "9";
        } else if (randomNum == 10){
            card = "Jack";
        } else if (randomNum ==11){
            card = "queen";
        } else if (randomNum == 12){
            card = "king";
        }

        return card;


    }

    public void setCards(ArrayList<String> cards) {
        this.cards = cards;
    }

    public ArrayList<String> getCards() {
        return cards;
    }
}
