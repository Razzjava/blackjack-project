package blackjack1;

public class Dealer extends Player {

    //attributes

    // constructor

    //methods

    public String dealerDecision(){
        int score = this.getScore();

        while (score <= 17){
            return "hit";
        }

        return "stick";



    }

    public void info(){
        System.out.println("The Dealers Cards are: "+ cards + " and their score is currently: "+ score);
    }
}
