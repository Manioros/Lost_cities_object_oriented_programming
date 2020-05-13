package model.finding;

/**
 * This class represents a Fresco
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Fresco extends Finding {

    private String name;
   
    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new Fresco
     *
     * @param name
     * @param points
     */
    public Fresco(String name,int points) {
        setCollectable(false);
        setPoints(points);
        this.name = name;
    }

    /**
     * <b>Accessor:</b> returns the Fresco's name
     * <b>Postcondition:</b> Fresco's name has been returned
     *
     * @return String name
     */
    public String getName() {
        return name;
    }
    
    /**
     * <b>transformer</b>: sets Fresco's name
     * <p>
     * <b>Postcondition:</b> Fresco's name have been set</p>
     *
     */
  /*  public void setName(String name) {

    }
*/
    @Override
    public String toString() {
        return "Fresco{" + "name=" + name + ", collectable=" + isCollectable() + '}';
    }


}
