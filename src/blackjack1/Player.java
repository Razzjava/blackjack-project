package blackjack1;



public abstract class Player {
    //attributes
    int score;
    String cards = "";
    //constructor


    //methods

    //method to call
   public void setScore(int cardScore){
       this.score += cardScore;
   }

   public void setCard(String card){
       this.cards += card + ", ";

   }

    public String getCards() {
        return cards;
    }

    public int getScore() {
        return score;
    }

    public void info(){
       System.out.println("Your current Cards are: "+ cards + " and your score is currently: "+ score);
    }



}
