package model.position;

import model.finding.Finding;

/**
 * This class represents a position with finding
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class FindingPosition extends Position {
    Finding evrima;
    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new position with finding.
     *
     */
    public FindingPosition() {
    }

    /**
     * <b>transformer</b>:set position's finding
     * <p>
     * <b>Postcondition:</b> position's finding has been set
     * @param evrima Finding
     */
    public void setEvrima(Finding evrima) {
        this.evrima = evrima;
    }
    /**
     * <b>accessor:</b>Returns position's finding
     *
     * <b>Postcondition:</b> returns position's finding
     *
     * @return position's finding
     */
    public Finding getEvrima() {
        return evrima;
    }
    
    
}
