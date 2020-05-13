package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import model.Board.*;
import model.City.City;
import model.Sullogi.Sullogi;
import model.card.*;
import model.finding.*;
import model.player.player;
import model.position.*;
import view.View;

/**
 * This class represents the controler
 *
 * @version 1.0
 * @author Ioannis Manioros
 */


public class Controller {

    View view;
    Board board;
    Sullogi allcards;
    player P1, P2;
    private String[] path_names = {"knossos", "malia", "phaistos", "zakros"};
    
    private boolean empty_table, notstarted;

    /**
     * <b>constructor</b>: Constructs a new Controller and sets the game to
     * start.
     * <b>postcondition</b>: constructs a new Controller,with new 2 players,
     * init allcards and initialize some boolean variables.So,is
     * responsible for creating a new game and initializing it.
     */
    public Controller() {
        Card c;
        P1 = new player("P1", 1);
        P2 = new player("P2", 2);
        
        //trapoula me kartes
        allcards = new Sullogi();   
        for (int a=0; a<4; a++) {
            for (int i=1; i<=10;i++) {
                for (int k=0; k<2; k++) {
                    c=new NumberCard(i, City.values()[a]);
                    c.setImage("resources/images/cards/" + path_names[a] + i + ".jpg");
                    allcards.addCard(c);
                }
                
            }
            for (int k=0; k<3; k++) {
                c = new Ariadne(City.values()[a]);
                c.setImage("resources/images/cards/" + path_names[a] + "Ari.jpg");
                allcards.addCard(c);
            }
            for (int k=0; k<2; k++) {
                c = new Minotaur(City.values()[a]);
                c.setImage("resources/images/cards/" + path_names[a] + "Min.jpg");
                allcards.addCard(c);
            }
        }
        
        this.allcards.initCards();  //ανακάτεμα τράπουλας
        
        this.empty_table = true;
        this.notstarted = true;
    }

    /**
     * <b>transformer</b>:player play a card
     * <p>
     * <b>Postcondition:</b> has been played a card
     * @param card card which player want play
     */
    public void PlayCard(Card card) {
    }

    /**
     * <b>Observer</b>:check a card if had played
     * <p>
     * <b>Postcondition:</b> return true if a card had played otherwise false
     * @return boolean true if a card had played otherwise false
     */
    public boolean CardHasPlayed() {
        return false;

    }

    /**
     * <b>accessor</b>:Returns which player has the turn
     *
     * <p>
     * <b>Postcondition:</b> Returns which player has the turn </p>
     *
     * @return which player has the turn (for example 0 if p1 has the turn )
     */
    public int getTurn() {
        return 0;
    }

    /**
     * <b>transformer</b>:set who will play
     * <p>
     * <b>Postcondition:</b> has been set who plays
     * @return int turn
     */
    public int setTurn() {
        return 0;
    }

    /**
     * <b>transformer</b>: sets the variable notstarted to false
     * <p>
     * <b>Postcondition:</b> has been set the variable notstarted to false</p>
     */
    public void setStarted() {
        this.notstarted = false;
    }

    /*
     *<b>Observer</b>: Return true if the game has not started  false otherwise
     * <p><b>Postcondition:</b> return true if the game  has not started  false otherwise
     * @return true if the game has not started  false otherwise
     */

    public boolean getStarted() {
        return this.notstarted;
    }

    /**
     * <b>transformer</b>: initializes players cards in the beginning
     * <p>
     * <b>Postcondition:</b> initializes players cards in the beginning </p>
     */
    public void initPlayerCards() {
        this.allcards.initCards();  //ανακάτεμα τράπουλας
        
        for (int i=0; i<8; i++) {                       // μοίρασμα 8 κάρτες στον καθένα
            this.P1.setCards(this.allcards.drawCard());
            this.P2.setCards(this.allcards.drawCard());
        }
    }

    /**
     * <b>transformer</b>: initializes some things(allcards,turn,round) to start
     * game
     * <p>
     * <b>Postcondition:</b> initializes some things(allcards,turn,round) for a
     * new deal(partida)</p>
     */
    public void initTable() {

    }

    /**
     * <b>Observer</b>:Return true if game has finished, false otherwise
     * <p>
     * <b>Postcondition:</b> return true if game has finished, false otherwise
     * </p>
     *
     * @return true if a game has finished, false otherwise
     */
    public boolean game_over() {

        return false;
    }
    
    /**
     * <b>transformer</b>: initializes some things to start game
     * <p>
     * <b>Postcondition:</b> has initialized some things to start game
     */
    public void initialize() {
        initPlayerCards();
        
        view = new View();
        view.initComponents();
        
        view.showPlayerCards(1, P1.getCards());
        view.showPlayerCards(2, P2.getCards());
        
        view.setVisible(true);
        setListeners();      
        updatePawns();
    }
    
    /**
     * <b>transformer</b>: update pawns situation
     * <p>
     * <b>Postcondition:</b> has updated pawns situation
     */
    private void updatePawns() {
        view.clearPawns();
        view.updatePawn(P1);
        view.updatePawn(P2);   
        
    }
    
    /**
     * <b>transformer</b>: set listeners
     * <p>
     * <b>Postcondition:</b> set listeners 
     */
    public void setListeners(){
        ArrayList<JButton> blist;
        //κάρτες στο χέρι των παικτών
        for (int i=1; i<=2; i++) {
            blist = view.getPlayerButtons(i);
            for (int j=0; j<8; j++) {
                blist.get(j).addActionListener(new CardListener());
            }

        }
    }
    
    public static void main(String[] args) {
        Controller c = new Controller();
        c.initialize();
    }

    /**
         * <b>transformer</b>: play a card
         * <p>
         * <b>Postcondition:</b> a card had played
         */
    public void playCard(int playerNumber, int cardNuber) {
    
    }
    
    private class CardListener implements ActionListener
    {
        /**
         * <b>transformer</b>: performe actions
         * <p>
         * <b>Postcondition:</b> actions has made
         */
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton button = (JButton) e.getSource();
            String bname = button.getName();
            int buttonCode = Integer.parseInt(bname);
            int playerNum = buttonCode / 10;
            int cardNum = buttonCode % 10;
            player p; //paikths pou paizei thn karta
            player pp; //o allos paikths
            Card c;
            
            int i;
            
            if (playerNum==2) {
                pp = P1;
                p = P2;
            }
            else {
                p = P1;
                pp = P2;
            }
            
            c = p.getCardtoplay(cardNum);      
            i = c.getCity().ordinal();    //o aa tou city sto enum {0,1,2,3}

            if (c instanceof Minotaur) {
                if (pp.getPawn(i).getThesi()<2)
                    pp.getPawn(i).setThesi(0);
                else
                    pp.getPawn(i).move(-2);
            }
            else {
                p.getPawn(i).move(c.getMove());
            }
            
            /*
            elegxos position gia finding
            */
            
            
            p.setCards(allcards.drawCard());// travaei nea karta
            
            updatePawns();
            view.showPlayerCards(p.getID(), p.getCards());           
        }
    }
        
        
}
