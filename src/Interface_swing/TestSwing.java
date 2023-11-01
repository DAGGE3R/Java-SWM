package Interface_swing;

import javax.swing.*;
import java.awt.*;

public class TestSwing extends JFrame {
    public TestSwing (){

        JPanel p = new JPanel();
        p.setBackground(Color.orange);

        this.setContentPane(new Panneau());
        this.setTitle("Ma premier fenetre java");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestSwing();

    }

}
