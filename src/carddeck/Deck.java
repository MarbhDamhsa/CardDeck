package carddeck;
import java.util.*;


public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();

    enum Values {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;}
    enum Suit {HEARTS, SPADES, DIAMONDS, CLUBS;}

    static boolean firstThread = true;
    public Deck(){
        for (Suit s : Suit.values()) {
            for(Values v : Values.values()){
                this.cards.add(new Card(s.name(),v.name()));
            }
        }
        //shuffle the deck when its created
        Collections.shuffle(this.cards);

    }

    public ArrayList<Card> getDeck(){
        return cards;
    }

}