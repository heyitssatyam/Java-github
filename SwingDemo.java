import javax.swing.*;


class SwingDemo {
    SwingDemo(){

        JFrame jfrm = new JFrame("A SImple Swing application");
        jfrm.setSize(275,275);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Swing means powerfull GUIs. ");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new SwingDemo();
            }
        });
    }
}