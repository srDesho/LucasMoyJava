package com.cristianml.views;

import com.cristianml.models.Client;

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
    private JTextField txtLastName;
    private JTextField txtEmail;
    private JTextField txtPhone;
    private List<Client> nameList = new ArrayList<Client>();

    public Form() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                client.setName(txtName.getText());
                client.setLastname(txtLastName.getText());
                client.setEmail(txtEmail.getText());
                client.setPhone(txtPhone.getText());
                nameList.add(client);
                refreshList();
                JOptionPane.showMessageDialog(null, "Added success. " );
                cleanText();
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
            Client client = nameList.get(i);
            data.addElement(client.getFullName());
        }
        listClients.setModel(data);
    }

    public void cleanText() {
        txtName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");

    }

}