public class Card {
    public static char rank;//A 2 ... 9 J Q K
    public static char suite;//'d' 'c' 'h' 's'

    //constant
    public static final char[] ranks = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'};
    public static final char[] suites = new char[]{'D', 'C', 'H', 'S'};

    public Card(char rank ,char suite){
        this.rank = rank;
        this.suite = suite;
    }

    public char getRank(){
        return this.rank;
    }

    public char getSuite(){
        return this.suite;
    }
}