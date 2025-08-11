import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ImageDemo {
    
    ImageDemo(){
        JFrame jfrm = new JFrame("Image Demo");

        jfrm.setSize(500, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon ii = new ImageIcon("cat.jpg");

        JLabel jl = new JLabel("Cat" , ii, JLabel.CENTER);
        jfrm.add(jl);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new ImageDemo();
            }
        });
    }
}
