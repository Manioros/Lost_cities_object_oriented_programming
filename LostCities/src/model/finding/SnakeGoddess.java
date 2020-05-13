package model.finding;

/**
 * This class represents a SnakeGoddess
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class SnakeGoddess extends Finding {

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new SnakeGoddess
     *
     */
    public SnakeGoddess() {
        setCollectable(true);
    }

    @Override
    public String toString() {
        return "SnakeGoddess{" + "collectable=" + isCollectable() + '}';
    }
    
    
}
