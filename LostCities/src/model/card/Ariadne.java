package model.card;

import model.City.City;

/**
 * This class represents a Ariadne Card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Ariadne extends SpecialCard {
    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new Ariadne Card with "city" City.
     *
     * @param city card's city
     */
    public Ariadne(City city) {
        super(city);
        this.move=2;
    }

    /**
     * Returns the string representation of a Ariadne card
     * <p>
     * <b>Postcondition:</b> The string representation of a Ariadne card
     * is returned</p>
     *
     * @return The string representation of a card
     */
    @Override
    public String toString() {
        return "Ariadne{" + '}' + "is" + super.toString();
    }

}
