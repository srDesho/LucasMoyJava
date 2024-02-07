import javax.swing.*;

public class Main {
    // Form windows =  new Form();
    public static void main(String[] args) {

        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}