package com.cristianml.views;

import com.cristianml.dao.DaoClient;
import com.cristianml.models.Client;
import com.mysql.cj.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

public class Form {
    private JTextField txtName;
    private JTextField txtPhone;
    private JTextField txtLastName;
    private JTextField txtEmail;
    private JList listName;
    private JLabel lblId;
    private JButton btnSave;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JButton btnRefreshList;
    private JButton btnNewClient;
    public JPanel panel;
    List<Client> nameList = new ArrayList<>();

    public Form() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                client.setName(txtName.getText());
                client.setLastname(txtLastName.getText());
                client.setEmail(txtEmail.getText());
                client.setPhone(txtPhone.getText());

                if (!StringUtils.isEmptyOrWhitespaceOnly(lblId.getText())){
                    client.setId(lblId.getText());
                }

                DaoClient dao = new DaoClient();
                dao.save(client);
                refreshList();
                JOptionPane.showMessageDialog(null, "Added Successfully...");
                cleanTextBoxes();
            }
        });
        btnNewClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanTextBoxes();
            }
        });
        panel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e);
                refreshList();
            }
        });
        btnRefreshList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshList();
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listName.getSelectedIndex();
                Client client = nameList.get(index);
                DaoClient dao = new DaoClient();
                dao.delete(client.getId());
                refreshList();
                JOptionPane.showMessageDialog(null, "Deleted successfully...");
            }
        });
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listName.getSelectedIndex();
                Client client = nameList.get(index);
                lblId.setText(client.getId());
                txtName.setText(client.getName());
                txtLastName.setText(client.getLastname());
                txtEmail.setText(client.getEmail());
                txtPhone.setText(client.getPhone());

                DaoClient dao = new DaoClient();
                dao.save(client);
                refreshList();
            }
        });
    }

    public void refreshList() {
        DaoClient dao = new DaoClient();
        nameList = dao.list();
        DefaultListModel data = new DefaultListModel();
        for (int i = 0; i < nameList.size(); i++) {
            Client client = nameList.get(i);
            data.addElement(client.getFullname());
        }
        listName.setModel(data);
    }

    public void cleanTextBoxes() {
        txtName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        lblId.setText("");
    }
}
