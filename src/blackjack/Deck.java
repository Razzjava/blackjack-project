package blackjack;

public class Deck {
    //there are 52 cards in a deck
    private int numofcards;
    private int remainingcards;


    // constrctor
    public void Deck(int vnumofcards){
        this.numofcards = vnumofcards;
    }

    //methods

///// remaining cards
    public int getRemainingcards() {
        return remainingcards;
    }

    public void setRemainingcards(int remainingcards) {
        this.remainingcards = remainingcards;
    }



}
