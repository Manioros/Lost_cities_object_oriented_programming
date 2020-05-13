package view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import model.Board.Pawn;
import model.card.Card;
import model.player.player;

/**
 *
 * @version 1.0
 * @author Ioannis Manioros
 */
public class View extends JFrame {

    //private JLayeredPaneExtension basic_panel;
    private JLabel p1_name_label, p1_info_label;
    private JLabel p2_name_label, p2_info_label;
    private JButton[] p1_hand_buttons, p1_play_buttons;
    private JButton[] p2_hand_buttons, p2_play_buttons;
    private JLayeredPane basic_panel, top_panel, bottom_panel;
    private JLayeredPane p1_name_panel, p1_hand_panel, p1_play_panel, p1_info_panel;
    private JLayeredPane p2_name_panel, p2_hand_panel, p2_play_panel, p2_info_panel;
    private JLayeredPaneExtension middle_panel;
    //private JLayeredPane middle_panel;
    private JLayeredPane deck_panel, table_panel; //, path_panel[] = new JLayeredPane[4];
    private JLayeredPaneExtension path_panel[] = new JLayeredPaneExtension[4];

    private JButton[][] path_button = new JButton[4][9];
    private JLayeredPane internalPane;
    private ClassLoader cldr;
    private String[] path_names = {"knossos", "malia", "phaistos", "zakros"};
    boolean enabled = true;

    /**
     * <b>accessor</b>: returns player's buttons.
     * <b>postcondition</b>: Returns player's buttons.
     *
     * @return player's buttons.
     */
    public ArrayList<JButton> getPlayerButtons(int player_number) {
        if (player_number == 1) {
            return new ArrayList<>(Arrays.asList(p1_hand_buttons));
        }
        if (player_number == 2) {
            return new ArrayList<>(Arrays.asList(p2_hand_buttons));
        }
        return null;
    }

    /**
     * <b>Transformer:</b> remove all pawns
     * <b>Postcondition:</b> pawns has removed
     *
     */
    public void clearPawns() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                path_button[i][j].removeAll();
            }
        }
    }

    /**
     * <b>Transformer:</b> update pawn
     * <b>Postcondition:</b> pawn has updated
     *
     */
    public void updatePawn(player thePlayer) {
        Pawn pawn;
        JButton path_position; //h thesh pou prepei na mep to pioni
        JLabel jpawn;

        for (int i = 0; i < 4; i++) {
            pawn = thePlayer.getPawn(i);
            if (pawn.getThesi() >= 0) {
                path_position = path_button[i][pawn.getThesi()];

                jpawn = new JLabel();
                jpawn.setBorder(BorderFactory.createLineBorder(thePlayer.getColor()));
                //jpawn.setLocation(0,0);
                URL imageURL2;
                if (pawn.isThiseas()) {
                    imageURL2 = cldr.getResource("resources/images/pionia/theseus.jpg"); //image
                } else {
                    imageURL2 = cldr.getResource("resources/images/pionia/arch.jpg"); //image
                }
                Image image2 = new ImageIcon(imageURL2).getImage();
                //image2 = image2.getScaledInstance(20,30, java.awt.Image.SCALE_SMOOTH);                            
                jpawn.setIcon(new ImageIcon(image2));

                path_position.add(jpawn);
            }
            path_panel[i].repaint();
        }
        this.pack();
    }

    /**
     * Constructor.
     *
     * <b>Postcondition</b>Creates a View
     *
     */
    public View() {
        cldr = this.getClass().getClassLoader();
        this.setResizable(true);
        this.setTitle("Αναζητώντας τα Χαμένα Μινωικά Ανάκτορα");
        this.setPreferredSize(new Dimension(1400, 900));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * <b>Transformer:</b> initialize all panels
     * <b>Postcondition:</b> has all panels initialized
     *
     */
    public void initComponents() {

//                // button 
//		dice= new JButton("Dice");
//		dice.setFont(new java.awt.Font("Rockwell", 0, 20));                
//		dice = new JButton(); //init Buttons
//                
//                pawn = new JLabel();
//		//pawn.setBounds((int) labels[0].getBounds().getCenterX()-50, (int)  labels[0].getBounds().getCenterY()-50, 100,100);
//		URL imageURL4 = cldr.getResource("resources/images/pawn_blue.png"); //image
//		Image image4 = new ImageIcon(imageURL4).getImage();
//		image4 = image4.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
//		pawn.setIcon(new ImageIcon(image4));
        basic_panel = new JLayeredPane();
        basic_panel.setLayout(new BoxLayout(basic_panel, BoxLayout.Y_AXIS));
        this.add(basic_panel);

        top_panel = new JLayeredPane();
        top_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
        top_panel.setPreferredSize(new Dimension(100, 150));

        p1_name_panel = new JLayeredPane();
        p1_name_panel.setLayout(new FlowLayout());
        p1_name_label = new JLabel("<html>Παίκτης 1<br/>3 Αρχαιολόγοι<br/>1 Θησέας</html>");
        p1_name_panel.add(p1_name_label);

        p1_hand_panel = new JLayeredPane();
        p1_hand_panel.setLayout(new FlowLayout());

        p1_play_panel = new JLayeredPane();
        p1_play_panel.setLayout(new FlowLayout());

        p1_info_panel = new JLayeredPane();
        p1_info_panel.setLayout(new FlowLayout());
        p1_info_label = new JLabel("<html>Σκορ: 0<br/>Αγαλματάκια: 0</html>");
        p1_info_panel.add(p1_info_label);

        top_panel.add(p1_name_panel);
        top_panel.add(p1_hand_panel);
        top_panel.add(p1_play_panel);
        top_panel.add(p1_info_panel);
        p1_hand_buttons = new JButton[8];
        for (int i = 0; i < 8; i++) {
            p1_hand_buttons[i] = new JButton();
            p1_hand_buttons[i].setPreferredSize(new Dimension(88, 120));
            //clabels[i].setBounds(80+i*250, 100, 200, 200);
            URL imageURL2 = cldr.getResource("resources/images/cards/backCard.jpg"); //image
            Image image2 = new ImageIcon(imageURL2).getImage();
            image2 = image2.getScaledInstance(88, 120, java.awt.Image.SCALE_SMOOTH);
            p1_hand_buttons[i].setSize(88, 120);
            p1_hand_buttons[i].setIcon(new ImageIcon(image2));
            p1_hand_panel.add(p1_hand_buttons[i]);
        }
        p1_play_buttons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            p1_play_buttons[i] = new JButton();
            p1_play_buttons[i].setPreferredSize(new Dimension(88, 120));
            URL imageURL2 = cldr.getResource("resources/images/cards/backCard.jpg"); //image
            Image image2 = new ImageIcon(imageURL2).getImage();
            image2 = image2.getScaledInstance(88, 120, java.awt.Image.SCALE_SMOOTH);
            p1_play_buttons[i].setIcon(new ImageIcon(image2));
            p1_play_panel.add(p1_play_buttons[i]);
        }
        basic_panel.add(top_panel);

        //tablo paixnidiou
        URL imageURL = cldr.getResource("resources/images/background.jpg"); //image
        Image image = new ImageIcon(imageURL).getImage();
        middle_panel = new JLayeredPaneExtension(image);
        //middle_panel = new JLayeredPane();
        middle_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
        middle_panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
        middle_panel.setPreferredSize(new Dimension(1300, 600));
        deck_panel = new JLayeredPane();
        //deck_panel.setPreferredSize(new Dimension(300,540));
        deck_panel.setLayout(new FlowLayout()); //FlowLayout.LEFT));
        deck_panel.add(new JButton("deck"));
        middle_panel.add(deck_panel);

        // ta 3 paths
        table_panel = new JLayeredPane();
        table_panel.setLayout(new BoxLayout(table_panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < 4; i++) {
            path_panel[i] = new JLayeredPaneExtension(null);
            path_panel[i].setLayout(new FlowLayout(FlowLayout.LEFT));
            for (int j = 0; j < 8; j++) {
                path_button[i][j] = new JButton();
                path_button[i][j].setLayout(new FlowLayout());
                path_button[i][j].setPreferredSize(new Dimension(120, 100));
                URL imageURL2;
                if (j < 7) {
                    imageURL2 = cldr.getResource("resources/images/paths/" + path_names[i] + ".jpg"); //image
                } else {
                    imageURL2 = cldr.getResource("resources/images/paths/" + path_names[i] + "Palace.jpg"); //image
                }
                Image image2 = new ImageIcon(imageURL2).getImage();
                image2 = image2.getScaledInstance(120, 100, java.awt.Image.SCALE_SMOOTH);
                path_button[i][j].setIcon(new ImageIcon(image2));
                path_panel[i].add(path_button[i][j]);
            }
            table_panel.add(path_panel[i]);
        }
        middle_panel.add(table_panel);
        basic_panel.add(middle_panel);

        bottom_panel = new JLayeredPane();
        bottom_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
        bottom_panel.setPreferredSize(new Dimension(1300, 150));

        p2_name_panel = new JLayeredPane();
        p2_name_panel.setLayout(new FlowLayout());
        p2_name_label = new JLabel("<html>Παίκτης 2<br/>3 Αρχαιολόγοι<br/>1 Θησέας</html>");
        p2_name_panel.add(p2_name_label);

        p2_hand_panel = new JLayeredPane();
        p2_hand_panel.setLayout(new FlowLayout());

        p2_play_panel = new JLayeredPane();
        p2_play_panel.setLayout(new FlowLayout());

        p2_info_panel = new JLayeredPane();
        p2_info_panel.setLayout(new FlowLayout());
        p2_info_label = new JLabel("<html>Σκορ: 0<br/>Αγαλματάκια: 0</html>");
        p2_info_panel.add(p2_info_label);

        bottom_panel.add(p2_name_panel);
        bottom_panel.add(p2_hand_panel);
        bottom_panel.add(p2_play_panel);
        bottom_panel.add(p2_info_panel);
        p2_hand_buttons = new JButton[8];
        for (int i = 0; i < 8; i++) {
            p2_hand_buttons[i] = new JButton();
            p2_hand_buttons[i].setPreferredSize(new Dimension(88, 120));
            //clabels[i].setSize(250,370);
            //clabels[i].setBounds(80+i*250, 100, 200, 200);
            URL imageURL2 = cldr.getResource("resources/images/cards/backCard.jpg"); //image
            Image image2 = new ImageIcon(imageURL2).getImage();
            image2 = image2.getScaledInstance(88, 120, java.awt.Image.SCALE_SMOOTH);
            p2_hand_buttons[i].setIcon(new ImageIcon(image2));
            p2_hand_panel.add(p2_hand_buttons[i]);
        }
        p2_play_buttons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            p2_play_buttons[i] = new JButton();
            p2_play_buttons[i].setPreferredSize(new Dimension(88, 120));
            URL imageURL2 = cldr.getResource("resources/images/cards/backCard.jpg"); //image
            Image image2 = new ImageIcon(imageURL2).getImage();
            image2 = image2.getScaledInstance(88, 120, java.awt.Image.SCALE_SMOOTH);
            p2_play_buttons[i].setIcon(new ImageIcon(image2));
            p2_play_panel.add(p2_play_buttons[i]);
        }
        basic_panel.add(bottom_panel);

        pack();
        basic_panel.repaint();
    }

    /**
     * <b>Transformer:</b> show player's cards
     * <b>Postcondition:</b> show player's cards
     *
     */
    public void showPlayerCards(int playernumber, ArrayList<Card> cards) {
        JButton[] p = p1_hand_buttons;
        JLayeredPane pane = p1_hand_panel;
        if (playernumber == 2) {
            p = p2_hand_buttons;
            pane = p2_hand_panel;
        }

        //pane.removeAll();
        for (int i = 0; i < 8; i++) {
            String bname = "" + (playernumber * 10 + i);

            //p[i] = new JButton();
            p[i].setName(bname);
            //p[i].setPreferredSize(new Dimension(88,120));

            //clabels[i].setBounds(80+i*250, 100, 200, 200);
            //URL imageURL2 = cldr.getResource("resources/images/cards/backCard.jpg"); //image
            URL imageURL2 = cldr.getResource(cards.get(i).getImage()); //image
            Image image2 = new ImageIcon(imageURL2).getImage();
            image2 = image2.getScaledInstance(88, 120, java.awt.Image.SCALE_SMOOTH);
            p[i].setSize(88, 120);
            p[i].setIcon(new ImageIcon(image2));
            //pane.add(p[i]);                
        }
        this.pack();
    }

}
