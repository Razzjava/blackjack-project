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
        int randomNum = rand.nextInt(12)+1;

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
        } else if (randomNum == 9) {
            card = "9";
        } else if (randomNum ==10) {
            card = "10";

        } else if (randomNum == 11){
            card = "jack";
        } else if (randomNum ==12){
            card = "queen";
        } else if (randomNum == 13){
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

    public int checkCards(String card){
        int score = 0;
        switch (card){
            case "ace" :
                score +=1;
                break;
            case "2":
                score +=2;
                break;
            case "3":
                score +=3;
                break;
            case "4":
                score += 4;
                break;
            case "5":
                score += 5;
                break;
            case "6":
                score += 6;
                break;
            case "7":
                score += 7;
                break;
            case "8":
                score += 8;
                break;
            case "9":
                score += 9;
                break;
            case "10":
                score += 10;
                break;
            case "jack":
                score +=10;
                break;
            case "queen":
                score += 10;
                break;
            case "king":
                score += 10;
                break;



        }

        return score;

    }
}
