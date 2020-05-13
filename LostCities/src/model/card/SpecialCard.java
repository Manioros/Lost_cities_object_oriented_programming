package model.card;

/**
 * This class represents a SpecialCard Card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
import model.City.City;

/**
 * This class represents a special Card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public abstract class SpecialCard extends Card {


    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new number Card with "city" City.
     *
     * @param city card's city
     */
    public SpecialCard(City city) {
        super(city);
    }


    /**
     * Returns the string representation of a special card
     * <p>
     * <b>Postcondition:</b> The string representation of a card is returned</p>
     *
     * @return The string representation of a card
     */
    @Override
    public String toString() {
        return "SpecialCard{" + "city=" + getCity() + '}';
    }

}
