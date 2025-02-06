import java.util.List;

import javax.smartcardio.Card;

public class BigTwoGame {
    private Deck deck;
    private ShuffleManager shuffleManager;

    public BigTwoGame(){
        this.shuffleManager = new ShuffleManager(this.deck.getCards());
    }

    public void start(){
        this.shuffleManager.shuffle();;
    }
}
