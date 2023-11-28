package ds_java;
import Animation.PanneauAnimationMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DsAnimationMain extends JFrame implements ActionListener {

    DsPannel testP = new DsPannel("green") ;
    DsPannel testP1 = new DsPannel("blue") ;
    DsPannel testP2 = new DsPannel("red") ;
    GridLayout g =  new GridLayout(2,1) ;

    JPanel p1 = new JPanel(new GridLayout(1,0));

    DsAnimationMain() {
        p1.add(testP2);
        p1.add(testP1);
        this.add(p1);
        this.setTitle("DS Animation");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(g);

        this.add(testP);
        this.add(p1);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
         new DsAnimationMain();

    }
}


