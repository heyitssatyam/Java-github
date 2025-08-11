import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JButtonDemo  {
    
    JButtonDemo(){


        JFrame jfrm =new JFrame("Jbutton demo");
        jfrm.setSize(1000 ,1000);
        jfrm.setLayout(new FlowLayout());

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jb = new JLabel("Which button is pressed:");
        ImageIcon cat =new ImageIcon("cat.jpg");
        JButton jbtn = new JButton(cat);
        jbtn.setActionCommand("Cat");
        jbtn.addActionListener((ae) -> jb.setText("Cat"));
        jfrm.add(jbtn);


        ImageIcon cow =new ImageIcon("cow.png");
        jbtn = new JButton(cow);
        jbtn.setActionCommand("Cow");
        jbtn.addActionListener((ae) -> jb.setText("Cow"));
        jfrm.add(jbtn);

        ImageIcon dog =new ImageIcon("dog.png");
        jbtn = new JButton(dog);
        jbtn.setActionCommand("Dog");
        jbtn.addActionListener((ae) -> jb.setText("Dog"));
        jfrm.add(jbtn);


        ImageIcon horse =new ImageIcon("horse.png");
        jbtn = new JButton(horse);
        jbtn.setActionCommand("Horse");
        jbtn.addActionListener((ae) -> jb.setText("Horse"));
        jfrm.add(jbtn);
        jfrm.add(jb);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new JButtonDemo();
            }
        });
    }
}
