package com.cristianml.views;

import com.cristianml.dao.DaoClient;
import com.cristianml.models.Client;
import com.mysql.cj.util.StringUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

public class Form {
    public JPanel panel;
    private JButton btnSave;
    private JTextField txtName;
    private JList listClients;
    private JButton btnDelete;
    private JTextField txtLastName;
    private JTextField txtEmail;
    private JTextField txtPhone;
    private JButton btnEdit;
    private JLabel lblId;
    private JButton btnConsultList;
    private JButton btnNew;
    private List<Client> nameList = new ArrayList<>();

    public Form() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                client.setName(txtName.getText());
                client.setLastname(txtLastName.getText());
                client.setEmail(txtEmail.getText());
                client.setPhone(txtPhone.getText());

                if(!StringUtils.isEmptyOrWhitespaceOnly(lblId.getText())) {
                    client.setId(lblId.getText());
                }

                DaoClient dao = new DaoClient();
                dao.save(client);

                refreshList();
                JOptionPane.showMessageDialog(null, "Added success. " );
                cleanText();
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listClients.getSelectedIndex();
                Client client = nameList.get(index);
                DaoClient dao = new DaoClient();
                dao.delete(client.getId());
                //nameList.remove(index);
                JOptionPane.showMessageDialog(null, "Deleted successfully");
                refreshList();
            }
        });
        panel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                super.componentMoved(e);
                JOptionPane.showMessageDialog(null, "Hi bro");
                refreshList();
            }
        });
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listClients.getSelectedIndex();
                Client client = nameList.get(index);
                txtName.setText(client.getName());
                txtLastName.setText(client.getLastname());
                txtEmail.setText(client.getEmail());
                txtPhone.setText(client.getPhone());
                lblId.setText(client.getId());
            }
        });
        btnConsultList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshList();
            }
        });
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanText();
            }
        });
    }
    public void refreshList() {
        DaoClient dao = new DaoClient();
        nameList = dao.list();

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
        lblId.setText("");
    }

}