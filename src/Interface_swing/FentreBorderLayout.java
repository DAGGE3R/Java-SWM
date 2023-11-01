
package Interface_swing;
import javax.swing.*;
import java.awt.*;

public class FentreBorderLayout extends JFrame{
    public FentreBorderLayout(){
        this.setTitle("Bouton BL");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

       /* this.setLayout(new BorderLayout());*/

        this.getContentPane().add(new JButton("CENTER" ), BorderLayout.CENTER) ;
        this.getContentPane().add(new JButton("NORTH" ), BorderLayout.NORTH) ;
        this.getContentPane().add(new JButton("SOUTH" ), BorderLayout.SOUTH) ;
        this.getContentPane().add(new JButton("WEST" ), BorderLayout.WEST) ;
        this.getContentPane().add(new JButton("EAST" ), BorderLayout.EAST) ;
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FentreBorderLayout();
    }
}
