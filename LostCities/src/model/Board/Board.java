package model.Board;

import model.City.City;

/**
 * This class represents board
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Board {
    Path[] path; //one path for each city
    
    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new Board
     *
     */
    public Board() {
        path[0] = new Path(City.Knossos);
        path[1] = new Path(City.Malia);
        path[2] = new Path(City.Faistos);
        path[3] = new Path(City.Zakros);
    }
}
