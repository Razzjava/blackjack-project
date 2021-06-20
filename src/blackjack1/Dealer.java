package blackjack1;

public class Dealer extends Player {

    //attributes

    // constructor

    //methods

    public String dealerDecision(){
        int score = this.getScore();

        while (score <= 20){
            return "hit";
        }

        return "stick";



    }
}
