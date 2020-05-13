package model.card;

import model.City.City;

/**
 * This class represents a Minotaur Card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Minotaur extends SpecialCard {

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new Minotaur Card with "city" City.
     *
     * @param c
     */
    public Minotaur(City c) {
        super(c);
        this.move=-2;
    }

    /**
     * Returns the string representation of a Minotaur card
     * <p>
     * <b>Postcondition:</b> The string representation of a Minotaur card is
     * returned</p>
     *
     * @return The string representation of a Minotaur card
     */
    @Override
    public String toString() {
        return "Minotaur{" + '}' + "is" + super.toString();
    }

}
