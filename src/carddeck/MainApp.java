/*
 *    Creates, shuffles, and prints out a deck of cards
 */
package carddeck;

public class MainApp {
        public static void main(String[] args){
        Deck deck = new Deck();

        //print out the deck.
        System.out.println(deck.getDeck());
    }
}//MainApp
