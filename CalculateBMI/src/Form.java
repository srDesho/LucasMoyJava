import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public JButton btnCalculate;
    public JTextField txtWeight;
    public JTextField txtHeight;
    public JPanel panel1;

    public Form() {
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the weight and height
                String strWeight = txtWeight.getText();
                String strHeight = txtHeight.getText();

                // Convert to Double
                Double weight = Double.parseDouble(strWeight);
                Double height = Double.parseDouble(strHeight);

                Double bmi = weight / (height * height);

                JOptionPane.showMessageDialog(null, "Your BMI is: " + bmi);
            }
        });
    }
}
