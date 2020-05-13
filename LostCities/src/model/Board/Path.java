package model.Board;
import java.util.ArrayList;
import model.City.City;
import model.position.Position;

/**
 * This class represents a path
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Path {
    private City anaktoro;
    private ArrayList<Position> path = new ArrayList<>(9);
    private final int checkPoint = 7;

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new path with "city" City.
     *
     * @param anaktoro
     */
    public Path(City anaktoro) {
        this.anaktoro = anaktoro;
    }

    /**
     * <b>Transformer:</b> sets the Anaktoro's city
     * <b>Postcondition:</b> Anaktoro's city has been set
     *
     * @param anaktoro path's city
     */
 /*   public void setAnaktoro(City anaktoro) {
        this.anaktoro = anaktoro;
    }
*/
    /**
     * <b>Transformer:</b> sets path
     * <b>Postcondition:</b> path has been set
     *
     * @param path an ArrayList with positions
     */
    public void setPath(ArrayList<Position> path) {
        this.path = path;
    }

    /**
     * <b>Accessor:</b> returns the path's city
     * <b>Postcondition:</b> path's city has been returned
     *
     * @return int value
     */
    public City getAnaktoro() {
        return anaktoro;
    }

    /**
     * <b>Accessor:</b> returns the position in path
     * <b>Postcondition:</b> position in path has been returned
     *
     * @return Position path
     */    
    public ArrayList<Position> getPath() {
        return path;
        
    }
    
    /**
     * <b>Accessor:</b> returns the check point
     * <b>Postcondition:</b> check point has been returned
     *
     * @return Position checkPoint
     */
    public int getCheckPoint() {
        return checkPoint;
    }

    /**
     * <b>Accessor:</b> returns the position
     * <b>Postcondition:</b> position has been returned
     *
     * @return int thesi
     */    
    Position getPosition(int thesi) { 
        return null; 
    }
}
