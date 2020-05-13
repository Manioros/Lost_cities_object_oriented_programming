package model.position;

import model.City.City;

/**
 * This class represents a position
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public abstract class Position {

    private int points;//mhpws na to ypologizw sto controler
    private int number_position;
    private String imagePath;

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new position.
     *
     */
    public Position() {
        this.points = -20;
        this.number_position = 1;
    }

    /**
     * <b>transformer</b>:set point in a specific position
     * <p>
     * <b>Postcondition:</b> point in a specific position has been set
     * @param points position's points
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * <b>transformer</b>:set position's number
     * <p>
     * <b>Postcondition:</b> position's number has been set
     * @param number position's number
     */
    public void setNumber(int number) {//---
        this.number_position = number;
    }

    /**
     * <b>accessor:</b>Returns position's points
     *
     * <b>Postcondition:</b> returns position's points
     *
     * @return position's points
     */
    public int getPoints() {
        return points;
    }

    /**
     * <b>accessor:</b>Returns position's number
     *
     * <b>Postcondition:</b> returns position's number
     *
     * @return position's number
     */
    public int getNumber() {
        return number_position;
    }

}
