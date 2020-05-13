package model.player;

import java.awt.Color;
import java.util.ArrayList;
import model.Board.Pawn;
import model.City.City;
import model.Sullogi.Sullogi;
import model.card.Card;
import model.finding.Fresco;
import model.finding.RareFinding;

/**
 * This class represents a player
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class player {

    private String name;
    private int ID;
    private Sullogi cards;
    private Sullogi[][] playedCards;
    private boolean hasplayed;
    private int totalSnakeGoddess;
    private ArrayList<Fresco> FrescoClct;
    private ArrayList<RareFinding> RareFindingClct;
    private Pawn[] pawn = new Pawn[4];
    Color color;
    
    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a new player with "name" String and "ID" int.
     *
     * @param name player's name
     * @param ID player's ID
     */
    public player(String name, int ID) {

        this.name = name;
        this.ID = ID;
        this.cards = new Sullogi();
        this.playedCards = new Sullogi[4][];
        this.hasplayed = false;
        this.FrescoClct = new ArrayList<Fresco>();
        this.RareFindingClct = new ArrayList<RareFinding>();
       // this.pawn = new Pawn[4];
        pawn[0] = new Pawn(City.Knossos);
        pawn[1] = new Pawn(City.Malia);
        pawn[2] = new Pawn(City.Faistos);
        pawn[3] = new Pawn(City.Zakros);
        
        if (ID==2) 
            this.color = Color.RED;
        else
            this.color = Color.BLUE;
    }

    /**
     * <b>transformer</b>: It initializes a player for a new deal(moirasma)
     * <b>postcondition</b>: clear the contents of players collection and
     * initialize some variables (for example initialize variables that give us
     * information if a player has said tichu or grand tichu and if player has
     * started or finished in a game(se mia partida))
     */
    public void init_player() {

    }

    /**
     * <b>accessor</b>: Returns the ID of a player.
     * <b>postcondition</b>: Returns the ID of the player.
     *
     * @return the ID of the player (int)
     */
    public int getID() {
        return ID;
    }

    /**
     * <b>transformer</b>: It sets the ID of a player
     * <b>postcondition</b>:the ID of the player is changed to id
     *
     * @param id the new ID of the player
     */
    public void setID(int id) {
        this.ID = id;
    }

    /**
     * <b>accessor:</b>Returns the name of the player
     *
     * <b>Postcondition:</b> returns the name of the player
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * <b>transformer</b>: sets the name of the player to newName
     * <p>
     * <b>Postcondition:</b> the name of this player is changed to newName</p>
     *
     * @param newName the new name of the player
     *
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * <b>accessor</b>:Returns the card who wants a player to play
     *
     * <p>
     * <b>Postcondition:</b> returns the card that player wants to play </p>
     *
     * @return the card that player wants to play
     */
    public Card getCardtoplay(int index) {
        Card c = this.cards.getCard(index);
        this.cards.removeCard(c);
        return c;
    }

    /**
     * <b>transformer </b>: adds a Card to player's cards
     * <p>
     * <b>Postcondition:</b> a card added to player's cards</p>
     *
     * @param c the card that will be added to player's Collection
     *
     */
    public void setCards(Card c) {
        this.cards.addCard(c);
    }

    
    // returns all p;ayer cards as an arraylist
    public ArrayList<Card> getCards() {
        return this.cards.getCards();
    }
    
    /**
     * <b>transformer</b>: sets the variable hasplayed to true
     * <p>
     * <b>Postcondition:</b> sets the variable hasplayed to true</p>
     */
    public void Played() {

    }

    /**
     * <b>Observer</b>:Returns if a player has finished the game
     *
     * <p>
     * <b>Postcondition:</b> Returns if a player has finished the game</p>
     *
     * @return true if a player has finished the game , false otherwise
     */
    public boolean getHasFinished() {
        return false;
    }
//------------------------------
    
    /**
     * <b>transformer</b>: increase by one variable totalSnakeGoddess
     * <p>
     * <b>Postcondition:</b> variable totalSnakeGoddess has increased by one</p>
     */
    public void addSnakegoddess() {
        this.totalSnakeGoddess++;
    }

    /**
     * <b>Observer</b>:Returns number of snake goddess which player have collected
     *
     * <p>
     * <b>Postcondition:</b> Returns number of snake goddess which player 
     * have collected</p>
     *
     * @return number of snake goddess which player have collected
     */
    public int getSnakegoddess() {
        return this.totalSnakeGoddess;
    }

    /**
     * <b>transformer</b>: set variable hasplayed with new condition
     * <p>
     * <b>Postcondition:</b> variable hasplayed has updated with nes condition</p>
     */
    public void sethasPlayed(boolean hasplayed) {
        this.hasplayed = hasplayed;
    }

    /**
     * <b>Observer</b>:Returns boolean value if player has play
     *
     * <p>
     * <b>Postcondition:</b> Returns boolean value if player has play</p>
     *
     * @return boolean value if player has play
     */
    public boolean gethasPlayed() {
        return this.hasplayed;
    }

    /**
     * <b>transformer</b>: add a fresco finding in arraylist FrescoClct
     * <p>
     * <b>Postcondition:</b> has added fresco finding in arraylist FrescoClct</p>
     */
    public void addFrescoClct(Fresco fresco) {
        this.FrescoClct.add(fresco);
    }

    /**
     * <b>Observer</b>:Returns a list with player's fresco findings
     *
     * <p>
     * <b>Postcondition:</b> Returns a list with player's fresco </p>
     *
     * @return a list with player's fresco 
     */
    public ArrayList<Fresco> getFrescoClct() {
        return this.FrescoClct;
    }

    /**
     * <b>transformer</b>: add a rare finding in arraylist RareFindingClct
     * <p>
     * <b>Postcondition:</b> has added rare finding  in arraylist RareFindingClct</p>
     */
    public void addRareFindingClct(RareFinding rarefindinng) {
        this.RareFindingClct.add(rarefindinng);
    }

    /**
     * <b>Observer</b>:Returns a list with player's rare findings
     *
     * <p>
     * <b>Postcondition:</b> Returns a list with player's rare findings </p>
     *
     * @return a list with player's rare findings 
     */
    public ArrayList<RareFinding> getRareFindingClct(){
        return this.RareFindingClct;
    }
    
    /**
     * <b>Observer</b>: Returns player's pawns
     *
     * <p>
     * <b>Postcondition:</b> Returns player's pawns </p>
     *
     * @return player's pawns
     */
    public Pawn[] getPawns() {
        return pawn;
    }
    
    /**
     * <b>Observer</b>: Returns player's specific pawn
     *
     * <p>
     * <b>Postcondition:</b> Returns player's specific pawns </p>
     *
     * @param pos
     * @return player's specific pawns
     */
    public Pawn getPawn(int pos) {
        return pawn[pos];
    }
    
    /**
     * <b>Observer</b>:Returns player's color
     *
     * <p>
     * <b>Postcondition:</b> Returns player's color </p>
     *
     * @return player's color
     */
    public Color getColor() {
        return this.color;
    }
}
