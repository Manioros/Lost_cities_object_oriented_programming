package model.card;

import model.City.City;

/**
 * Contains the methods signatures needed for creating a card
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public abstract class Card {

    private City city;
    private String image;
    protected int move;
    
    Card(City city){
        this.city = city;
    }

    /**
     * <b>Accessor:</b> returns the card's city
     * <b>Postcondition:</b> card's city has been returned
     *
     * @return the card's city
     */
    public City getCity() {
        return this.city;

    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public String getImage() {
        return this.image;
    }
    
    public int getMove() {
        return this.move;
    }

}
