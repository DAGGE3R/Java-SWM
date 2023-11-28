package ds_java;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class DsAnimation extends JPanel {

    private String ballColor;
    private int posX=100;
    private int posY=75 ;

    public String getBallColor() {
        return ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

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
        if (Objects.equals(ballColor, "red")) g.setColor(Color.RED);
        if (Objects.equals(ballColor, "blue")) g.setColor(Color.BLUE);
        if (Objects.equals(ballColor, "green")) g.setColor(Color.GREEN);
        g.fillOval(posX,posY,50,50);

    }
}
