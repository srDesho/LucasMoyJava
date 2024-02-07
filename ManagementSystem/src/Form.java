import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public JPanel panel;
    public JButton btnResult;
    public JTextField txtName;


    public Form() {
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                JOptionPane.showMessageDialog(null, "Welcome " + name);
            }
        });
    }
}