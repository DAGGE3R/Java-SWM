package Interface_swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Panneau  extends JPanel {
    public void paintComponent(Graphics g) {
        int h = this.getHeight()/2;
        int w = this.getWidth()/2;

        try {
            Image img = ImageIO.read(new File("./Mona.jpg"));
            g.drawImage(img,0,0,this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //! Draw

        /*g.fillOval(w-25,h-25,50,50);
        g.drawRect(40,40,40,40);
        g.drawRoundRect(85,85,40,40,20,20);*/


        // !Font

  /*     Font font  = new Font("SF pro" , Font.BOLD ,20);
        g.setFont(font);
        g.drawString("Bonjour", w,h);
        System.out.println(g.getFont());*/

    }

}
