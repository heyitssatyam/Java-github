import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo {
    
    JTextFieldDemo(){

        JFrame jfrm = new JFrame("JTextField Demo");
        JLabel jlab= new JLabel("Enter a Text");
        jfrm.setSize(800, 600);
        jfrm.setLayout(new FlowLayout());

        JTextField jtf = new JTextField(15);
        jfrm.add(jtf);

        jtf.addActionListener((ae) -> jlab.setText(jtf.getText()));
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new JTextFieldDemo();
            }
        });
    }
}
