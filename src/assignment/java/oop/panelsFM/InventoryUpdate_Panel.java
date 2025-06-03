/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment.java.oop.panelsFM;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.io.*;

public class InventoryUpdate_Panel extends javax.swing.JPanel {
    
    private DefaultTableModel model;
    
    public InventoryUpdate_Panel() {
        initComponents();
        loadInventoryUpdates();
    }

     private void loadInventoryUpdates() {
        model = new DefaultTableModel(new String[]{"Item Code", "Item Name", "Updated Qty", "Date", "Status"}, 0);
        try (BufferedReader br = new BufferedReader(new FileReader("src/assignment/java/oop/FM data/Inventory_updates.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    model.addRow(new String[]{parts[0], parts[1], parts[2], parts[3], "Pending"});
                } else if (parts.length == 5) {
                model.addRow(parts);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, 
                    "Error loading inventory updates:\n" + e.getMessage(),
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
        tblInventory.setModel(model);
        
        tblInventory.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblInventory.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblInventory.getColumnModel().getColumn(2).setPreferredWidth(70);
        tblInventory.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblInventory.getColumnModel().getColumn(4).setPreferredWidth(80);
        
        tblInventory.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) {

    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    String status = (String) model.getValueAt(row, 4);

    if (isSelected) {
        c.setBackground(new Color(51, 153, 255)); 
        c.setForeground(Color.WHITE);             
    } else {
        if ("Verified".equalsIgnoreCase(status)) {
            c.setBackground(new Color(200, 255, 200)); // green
        } else if ("Rejected".equalsIgnoreCase(status)) {
            c.setBackground(new Color(255, 200, 200)); // red
        } else {
            c.setBackground(Color.WHITE);
        }
        c.setForeground(Color.BLACK);
    }

    return c;

    }
});
        
    }
     
     private void verifySelectedRow() {
        int selectedRow = tblInventory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to verify.");
            return;
        }

        model.setValueAt("Verified", selectedRow, 4);
        saveToFile();
        JOptionPane.showMessageDialog(this, "Inventory update marked as Verified.");
    }
     
      private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/assignment/java/oop/FM data/Inventory_updates.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    sb.append(model.getValueAt(i, j));
                    if (j < model.getColumnCount() - 1) sb.append(",");
                }
                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving file:\n" + e.getMessage(),
                    "Save Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnVerify = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("View Inventory Updates");

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 451, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerify, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerify)
                .addGap(18, 18, 18)
                .addComponent(btnReject)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        verifySelectedRow();
        btnReject = new javax.swing.JButton();
        btnReject.setText("Reject");
        btnReject.setBackground(Color.RED);
        btnReject.setForeground(Color.BLACK);
        btnReject.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRejectActionPerformed(evt);
    }
});

        
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRow = tblInventory.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to reject.");
        return;
    }

    model.setValueAt("Rejected", selectedRow, 4);
    saveToFile();
    tblInventory.repaint();
    JOptionPane.showMessageDialog(this, "Inventory update marked as Rejected.");
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables
}
