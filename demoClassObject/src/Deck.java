public class Deck {
    //52 cards
    private Card[] cards;

    public Deck(){
      this.cards = new Card[Card.suites.length * Card.ranks.length];
        int idx = 0;
        for(int i = 0; i < Card.ranks.length; i++){
            for(int j = 0; j < Card.suites.length; j++){
                this.cards[idx++] = new Card('A', 'D');
            }
        }
    }
    public static void main(String[] args) {
      Deck deck = new Deck();
    }
}
