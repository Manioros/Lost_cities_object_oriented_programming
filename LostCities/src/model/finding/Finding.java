package model.finding;

/**
 * This class represents a Finding
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public abstract class Finding {

    private int points;
    private boolean collectable;

    /**
     * <b>Transformer:</b> sets the Finding's points
     * <b>Postcondition:</b> Finding's points has been set
     *
     * @param points Finding's points
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * <b>Accessor:</b> returns the Finding's points
     * <b>Postcondition:</b> Finding's points has been returned
     *
     * @return int points
     */
    public int getPoints() {
        return this.points;

    }

    public void setCollectable(boolean clct){
        this.collectable = clct;
    }
    
    public boolean isCollectable() {
        return collectable;
    }

    /**
     * Returns the string representation of Finding
     * <p>
     * <b>Postcondition:</b> The string representation of a Finding is
     * returned</p>
     *
     * @return The string representation of a Finding
     */
    @Override
    abstract public String toString();

}
