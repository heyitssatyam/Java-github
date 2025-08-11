import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EventDemo {
    JLabel jlab;

    EventDemo(){
        JFrame jfrm = new JFrame("Event Demo");

        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220 , 90);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta  = new JButton("Beta");
        JLabel jlab = new JLabel("Press a button");

        // jbtnAlpha.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         jlab.setText("Alpha was pressed!");
        //     }
        // });

        jbtnAlpha.addActionListener((ae) -> jlab.setText("Alpha was pressed.."));
        // jbtnBeta.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae){
        //         jlab.setText("Beta was pressed!");
        //     }
        // });
        jbtnBeta.addActionListener((ae) -> jlab.setText("Beta was pressed.."));

        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new EventDemo();
            }
        });
    }
}
