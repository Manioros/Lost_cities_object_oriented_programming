package model.finding;

/**
 * This class represents a RareFinding
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class RareFinding extends Finding {

    private String name;

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new RareFinding with "points" int and
     * "name"
     *
     * @param points finding's points
     * @param name finding's name
     */
    public RareFinding(int points, String name) {
        setPoints(points);
        setCollectable(true);
        this.name = name;
    }

    /**
     * <b>Accessor:</b> returns the RareFinding's name
     * <b>Postcondition:</b> RareFinding's name has been returned
     *
     * @return int points
     */
    public String getName() {
        return name;
    }
/*
    /**
     * <b>transformer</b>: sets RareFinding's name
     * <p>
     * <b>Postcondition:</b> RareFinding's name have been set</p>
     *
     * @param name RareFinding's name
     */
   /* public void setName(String name) {
        this.name = name;
    }
*/
    @Override
    public String toString() {
        return "RareFinding{" + "name=" + name + ", collectable=" + isCollectable() + '}';
    }



}
