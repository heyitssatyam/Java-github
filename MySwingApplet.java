import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MySwingApplet extends JApplet {
    JButton jbtnAlpha;
    JButton jbtnBeta;

    public void init(){
        try{
            SwingUtilities.invokeAndWait(new Runnable(){
                public void run(){
                    makeGUI();
                }
            });
        }catch (Exception exc){
            System.out.println("Cant create because of "+ exc);
        }
    }

    private void makeGUI(){
      setLayout(new FlowLayout());

      jbtnAlpha = new JButton("Alpha");
      jbtnBeta = new JButton("Beta");
      JLabel jlab = new JLabel("Press a button.");
    jbtnAlpha.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            jlab.setText("Alpha was pressed");
        }
    });

    jbtnBeta.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            jlab.setText("Beta was pressed.");
        }
    });
    add(jlab);
    }
}
