package model.card;

import model.City.City;

/**
 * This class represents a number Card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class NumberCard extends Card {

    private int value;

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new number Card with "value" int
     *
     * @param value card's value
     * @param city
     */
    public NumberCard(int value,City city) {
        super(city);
        this.value = value;
        this.move=1;
    }

    /**
     * <b>Transformer:</b> sets the card's value
     * <b>Postcondition:</b> card's value has been set
     *
     * @param value card's value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * <b>Accessor:</b> returns the card's value
     * <b>Postcondition:</b> card's value has been returned
     *
     * @return int value
     */
    public int getValue() {
        return value;
    }


    /**
     * Returns the string representation of a number card
     * <p>
     * <b>Postcondition:</b> The string representation of a card is returned</p>
     *
     * @return The string representation of a card
     */
    @Override
    public String toString() {
        return "NumberCard{" + "value=" + value + ", city=" + getCity() + '}';
    }

}
