package model.Board;

import model.Board.Path;
import model.City.City;

/**
 * This class represents a pawn
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class Pawn {
    private Path anaktoro;
    private int thesi;
    private boolean thiseas;
    private City city;
    
   
    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new Pawn with "thiseas" boolean.
     *
     * @param anaktoro
     */
    public Pawn(Path anaktoro) {
        this.thesi = -1;
        this.anaktoro = anaktoro;
        this.thiseas = false;
    }
   
     public Pawn(City city) {
        this.thiseas = false;
        this.thesi = -1;
        this.city = city;
    }
     
     

 
    /**
     * <b>Transformer:</b> sets the pawn's thesi
     * <b>Postcondition:</b> pawn's thesi has been set
     *
     * @param thesi pawn's position in path
     */
    public void setThesi(int thesi) {
        this.thesi = thesi;
    }

    /**
     * <b>Transformer:</b> sets if pawn is thiseas
     * <b>Postcondition:</b> pawn has been set, if it is thiseas
     *
     * @param thiseas true if pawn is thiseas, else false
     */
    public void setThiseas(boolean thiseas) {
        this.thiseas = thiseas;
    }
    
    /**
     * <b>Accessor:</b> returns the pawn's path
     * <b>Postcondition:</b> pawn's path has been returned
     *
     * @return Path anaktoro
     */
    public Path getAnaktoro() {
        return this.anaktoro;
    }
    
    public City getCity() {
        return city;
    }
    
    /**
     * <b>Accessor:</b> returns the pawn's position
     * <b>Postcondition:</b> pawn's position has been returned
     *
     * @return int thesi
     */
    public int getThesi() {
        return this.thesi;
    }
    
    /**
     * <b>Observer</b>: Return true if the pawn is thiseas false otherwise
     * <p>
     * <b>Postcondition:</b> return true if the pawn is thiseas false otherwise
     *
     * @return true if the pawn is thiseas false otherwise
     */
    public boolean isThiseas() {
        return this.thiseas;
    }

//    public void makeMovePawn(int makemove){
//        this.thesi = this.thesi + move(makemove);
//    }
    
    /**
     * <b>Transformer:</b> calculate a movement
     * <b>Postcondition:</b> movement has been calculated
     *
     * @param step how long is movement
     */
    public void move(int step)
    {
        thesi += step;
        if (thesi<0)
            thesi = 0;
        if (thesi>7)
            thesi=7;
    }
    /**
     * Returns the string representation of a pawn
     * <p>
     * <b>Postcondition:</b> The string representation of a pawn is returned</p>
     *
     * @return The string representation of a pawn
     */
    @Override
    public String toString() {
        return "Pawn{" + "anaktoro=" + anaktoro + ", thesi=" + thesi + ", thiseas=" + thiseas + '}';
    }
    
    
}
