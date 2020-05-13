package model.Sullogi;

import java.util.ArrayList;
import java.util.Collections;
import model.card.Card;

/**
 * This class represents a sullogi from card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Sullogi {

    private ArrayList<Card> cards;

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new Sullogi with a new card ArrayList.
     *
     */
    public Sullogi() {
        cards = new ArrayList<Card>();
    }

    /**
     * <b>Transformer:</b> Initializes and shuffles cards.
     * <b>Postcondition:</b> The cards have been initialised and shuffled.
     */
    public void initCards() {
        Collections.shuffle(this.cards);  //ανακάτεμα τράπουλας
    }

    /**
     * <b>Observer:</b> Returns true if this list contains no elements.
     * <b>Postcondition:</b> Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {

        return false;
    }

    /**
     * <b>Transformer:</b> Adds a card to the list.
     * <b>Postcondition:</b> A card has been added to the list.
     *
     * @param c card which added in Sullogi
     */
    public void addCard(Card c) {
        this.cards.add(c);
    }

    /**
     * <b>Transformer:</b> Removes a card from the list.
     * <b>Postcondition:</b> A card has been removed from the list.
     *
     * @param c card which removed from sullogi
     */
    public void removeCard(Card c) {
        this.cards.remove(c);
    }

    /**
     * <b>Transformer:</b> Returns the size of a list.
     * <b>Postcondition:</b> The size of the list has been returned.
     *
     * @return size of the list
     */
    public int size() {
        return cards.size();
    }

    /**
     * <b>Accessor:</b> returns the card in position 'index'
     * <b>Postcondition:</b> the card in position 'index' has been returned
     *
     * @param index
     * @return the card in position 'index'
     */
    public Card getCard(int index) {
        return cards.get(index);
    }

    /**
     * <b>Transformer:</b> Clears an ArrayList
     * <b>Postcondition:</b> An ArrayList is cleared.
     */
    public void clearAll() {

    }

    /**
     * <b>Accessor:</b> returns all the cards
     * <b>Postcondition:</b> all the cards has been returned
     *
     * @return all the cards
     */
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    /**
     * <b>Accessor:</b> returns a cards
     * <b>Postcondition:</b> has returned a card
     *
     * @return a card
     */
    public Card drawCard() {
        return this.cards.remove(0);
    }
}
