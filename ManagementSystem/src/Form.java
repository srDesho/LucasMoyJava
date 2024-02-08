import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Form {
    public JPanel panel;
    private JButton btnSave;
    private JTextField txtName;
    private JList listClients;
    private JButton deleteButton;
    private List<String> nameList = new ArrayList<String>();

    public Form() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                nameList.add(name);
                refreshList();
                JOptionPane.showMessageDialog(null, "Added success. " );
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listClients.getSelectedIndex();
                nameList.remove(index);
                refreshList();
            }
        });
    }
    public void refreshList() {
        DefaultListModel data = new DefaultListModel();
        for (int i = 0; i < nameList.size(); i++) {
            String name = nameList.get(i);
            data.addElement(name);
        }
        listClients.setModel(data);
    }

}