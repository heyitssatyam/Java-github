import javax.swing.*;

public class LookAndFeelExample {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        JFrame jfrm = new JFrame("Swing PLAF example");
        jfrm.setSize(300,200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.add(new JButton("Click Me"));
        jfrm.setVisible(true);
    }
}
