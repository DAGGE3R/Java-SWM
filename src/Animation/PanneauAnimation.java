package Animation;

import javax.swing.*;
import java.awt.*;

public class PanneauAnimation extends JPanel {
    private int posX=0 ;
    private int posY=0 ;

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void paintComponent(Graphics g ){

        g.setColor(Color.WHITE);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(Color.RED);
        g.fillOval(posX,posY,50,50);

    }



}
