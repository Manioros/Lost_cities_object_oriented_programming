/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * @version 1.0
 * @author Ioannhs Manioros
 */



import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLayeredPane;


public class JLayeredPaneExtension extends JLayeredPane {

    Image image;

    /**
     * <b>transformer</b>: take an image
     * <b>postcondition</b>: take an image
     *
     * @param img
     */
    public JLayeredPaneExtension(Image img) {
        image = img;
    }

    /**
     * <b>transformer</b>: paint a component with image backgroud
     * <b>postcondition</b>:paint a component with image backgroud
     *
     */
    @Override
    public void paintComponent(Graphics g) {//p
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}